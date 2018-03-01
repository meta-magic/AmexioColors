/**
 * Copyright (c) 2018 Araf Karsh Hamid

 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.

 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 
 *   or (per the licensee's choosing)
 
 * under the terms of the Apache 2 License version 2.0
 * as published by the Apache Software Foundation.
*/
package org.amexio.colors.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Read the Theme Generation Data File.
 * 
 * Data File Format
 * 
 * 1. Theme File Name
 * 2. Theme Color 1
 * 3. Theme Color 2
 * 4. Theme Color 3
 * 5. Theme Color 4
 * 
 * You can the Data File with a File Name and a Single Color. 
 * System will automatically derive the rest of the colors.
 * 
 * You can // to put comments in the Data File. Themes Data 
 * reader will ignore any rows which starts with // 
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date
 */
public final class ThemesDataReader {
	
	private final String dataFileName;
	private final String destinationPath;
	private final boolean fileStatus;
	private final ArrayList<ThemeConfig> themes;
	private File dataFile;
	
	/**
	 * Set the Input Data File Name
	 * 
	 * @param _dataFile
	 */
	public ThemesDataReader(String _dataFile, String _destination) {
		destinationPath = (_destination != null) ? _destination : "";
		dataFileName = (_dataFile != null) ? _dataFile : "NO-DATA";
		dataFile		 = new File(destinationPath + dataFileName);
		fileStatus	 = dataFile.canRead();
		themes		 = new ArrayList<ThemeConfig>(50);
	}
	
	/**
	 * Returns TRUE if the file can be read.
	 * 
	 * @return boolean status
	 */
	private boolean canRead() {
		return fileStatus;
	}
	
	/**
	 * Process the row
	 * @return
	 */
	public boolean processFile() {
		if(!this.canRead()) {
			return false;
		}
		BufferedReader dFile;
		try {
			dFile = new BufferedReader(new FileReader(dataFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		try {
			while(dFile.ready()) {
				ThemeConfig tc = processRow(dFile.readLine());
				if(tc != null) {
					themes.add(tc);
				}
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if(dFile != null) {
				try {
					dFile.close();
				} catch (IOException ignored) {
					System.out.println("Unable to close the file");
				}
			}
			 
		}
		return true;
	}
	
	private ThemeConfig processRow(String _row) {
		if(_row != null && _row.length() >0) {
			boolean materialDesign = true;
			double version = 3.0;
			if(!_row.startsWith("//")) {
				String[] fields = _row.split(",");
				if(fields != null) {
					switch(fields.length) {
					case 2:
						return new ThemeConfig(fields[0], fields[1]);
					case 3:
						return new ThemeConfig(fields[0], fields[1], fields[2]);
					case 4:
						return new ThemeConfig(fields[0], fields[1], 
								fields[2], fields[3], null);
					case 5:
						return new ThemeConfig(fields[0], fields[1], 
								fields[2], fields[3], fields[4]);
					}
				}
			} else {
				materialDesign = getDesignType(_row.split(":"));
				version = getVersion(_row.split(":"));
				
			}
		}
		return null;
	}
	
	/**
	 * Returns TRUE if the Design Type = Material Design
	 * @param _data
	 * @return
	 */
	private boolean  getDesignType(String[] _data) {
		if(_data != null && _data.length >1) {
			if(_data[1].equalsIgnoreCase("Material Design")) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns the Theme Version
	 * @param _data
	 * @return
	 */
	private double getVersion(String[] _data) {
		if(_data != null && _data.length >1) {
			try {
				return Double.parseDouble(_data[1]);
			} catch (Exception ignored) {}
		}
		return 3.2;
	}
	
	/**
	 * Returns the Theme List
	 * @return
	 */
	public ArrayList<ThemeConfig> getThemes() {
		return this.themes;
	}

	/**
	 * For Testing purpose ONLY.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String dest		= "/Users/arafkarsh/AmexioColors/mda-new/";
		String dataFile = "Themes-Data.txt";
		
		ThemesDataReader data = new ThemesDataReader(dataFile, dest);
		if(data.processFile()) {
			ArrayList<ThemeConfig> themes = data.getThemes();
			for(ThemeConfig theme : themes) {
				System.out.println("> "+theme);
			}
		}
	}

}

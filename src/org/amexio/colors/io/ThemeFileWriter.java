/**
 * Copyright (c) 2018 MetaMagic Global Inc, NJ, USA

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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.amexio.colors.core.Color;
import org.amexio.colors.themes.AmexioThemeBuilder;

/**
 * Theme File Generator
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 26, 2018
 */
public class ThemeFileWriter {

	private final String destinationPath;
	private long start;
	private long stop;
	private double time;
	
	/**
	 * Create the Theme File creator with the destination Path
	 * @param _filePath
	 */
	public ThemeFileWriter(String _filePath) {
		destinationPath = (_filePath == null) ? "" : _filePath;
		System.out.println("Destination = "+destinationPath);
	}
	
	/**
	 * Create Theme File 
	 * 
	 * @param String _fileName
	 * @param String _data
	 */
	public boolean generateFile(String _fileName, String _data) {
		if(_fileName == null || _fileName.length() == 0) {
			System.out.println("Invalid File Name .. FileName=["+_fileName+"]");
			return false;
		}
		if(_data == null || _data.length() == 0) {
			System.out.println("Nothing to be written.. Empty Theme Data");
			return false;
		}
		String fp = destinationPath + _fileName;
		// if( !(new File(fp).canWrite()) ) {
			// System.out.println("Write Permission not available... FileName=["+fp+"]");
			// return false;			
		// }
		// Check if the File Path is writable
		System.out.println("Theme File Generation Started! ... File=["+fp+"]");
		start = System.currentTimeMillis();
		PrintWriter out = null;
		try {
			out = new PrintWriter(
								new BufferedWriter(new FileWriter(fp)));
			out.write(_data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch(Exception ignored) {}
				out = null;
			}
		}
		stop = System.currentTimeMillis();
		time = stop - start;
		// double timeSeconds = (double) time / 1000;
		System.out.println("Theme File Generation Completed in "+time+" milli seconds. File=["+_fileName+"]");
		return true;
	}	

}

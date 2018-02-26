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
package org.amexio.colors.themes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.amexio.colors.core.Color;

/**
 * Theme File Generator
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 26, 2018
 */
public class ThemeFileCreator {

	
	public static void main(String[] args) {

	}

	/**
	 * Generate the default Theme Data
	 * @return String
	 */
	public static String generateThemeData() {
		return generateThemeData(null, null, null, null, null, null);
	}
	
	/**
	 * Generate Theme with Single color
	 * 
	 * @param String _color1 (hex code of the color)
	 * @return String
	 */
	public static String generateThemeData(String _color1) {
		return generateThemeData(_color1, null, null, null, null, null);
	}
	
	/**
	 * Generate Theme with Two Colors
	 * 
	 * @param String _color1 (hex code of the color)
	 * @param String _color2 (hex code of the color)
	 * @return String
	 */
	public static String generateThemeData(String _color1, String _color2) {
		return generateThemeData(_color1, _color2, null, null, null, null);
	}
	
	/**
	 * Generate Theme with Three Colors
	 * 
	 * @param String _color1 (hex code of the color)
	 * @param String _color2 (hex code of the color)
	 * @param String _color3 (hex code of the color)
	 * @return String
	 */
	public static String generateThemeData(String _color1, String _color2, String _color3) {
		return generateThemeData(_color1, _color2, _color3, null, null, null);
	}
	
	/**
	 * Generate Theme with Four Colors
	 * 
	 * @param String _color1 (hex code of the color)
	 * @param String _color2 (hex code of the color)
	 * @param String _color3 (hex code of the color)
	 * @param String _color4 (hex code of the color)
	 * @return String
	 */
	public static String generateThemeData(String _color1, String _color2, 
			String _color3, String _color4) {
		return generateThemeData(_color1, _color2, _color3, _color4, null, null);
	}
	/**
	 * Create a Theme with 4 Primary Colors and 2 App Colors
	 * 
	 * All the Color values are given in Hex
	 * @param String _color1 (hex code of the color)
	 * @param String _color2 (hex code of the color)
	 * @param String _color3 (hex code of the color)
	 * @param String _color4 (hex code of the color)
	 * @param String _color5 (hex code of the color)
	 * @param String _color6 (hex code of the color)
	 * @return String
	 */
	public static String generateThemeData(String _color1, String _color2, String _color3,
			String _color4, String _color5, String _color6) {
		AmexioThemeBuilder builder = new AmexioThemeBuilder(new Color(_color1), 
				new Color(_color2), new Color(_color3),
				new Color(_color4), new Color(_color5), new Color(_color6), null);
		return builder.printSCSS();
	}
	
	/**
	 * Create Theme File 
	 * 
	 * @param String _fileName
	 * @param String _data
	 */
	public static void generateFile(String _fileName, String _data) {
		if(_fileName == null) {
			System.out.println("Invalid File Name .. FileName=["+_fileName+"]");
			return;
		}
		if(_data == null || _data.length() == 0) {
			System.out.println("Nothing to be written.. Empty Theme Data");
			return;
		}
		// Check if the File Path is writable
		System.out.println("Theme File Generation Started! ...");
		long start = System.currentTimeMillis();
		PrintWriter out = null;
		try {
			out = new PrintWriter(
								new BufferedWriter(new FileWriter(_fileName)));
			out.write(_data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(out != null) {
				out.close();
				out = null;
			}
		}
		long stop = System.currentTimeMillis();
		long time = stop - start;
		double timeSeconds = (double) time / 1000;
		System.out.println("Time Taken   = "+time+" milli seconds");
		System.out.println("Time Taken   = "+timeSeconds+" seconds");
		System.out.println("Theme File Generation Completed.");
	}	

}

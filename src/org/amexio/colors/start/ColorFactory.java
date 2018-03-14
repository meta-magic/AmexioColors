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
package org.amexio.colors.start;

import org.amexio.colors.themes.AmexioThemeFactory;

/**
 * Amexio Colors Command Line Executable
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date
 */
public final class ColorFactory {

	/**
	 * Amexio Colors - Entry Module
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Amexio Colors - Build Themes
		if(checkArgs(args)) {
			buildThemes(args[0], args[1]);
		}
	}
	
	/**
	 * Check Arguments
	 * 
	 * @param args
	 * @return
	 */
	private static boolean checkArgs(String[] args) {
		if(args == null || args.length < 2) {
			 printUsage();
			return false;
		}
		return true;
	}
	
	/**
	 * Print the API Usage in command line.
	 */
	private static void printUsage() {
		System.out.println("Amexio Colors v1.0");
		System.out.println("Usage: java -jar amexioColors themesInputFile outputPath");
	}
	
	/**
	 * Build Amexio Themes
	 * @param inputFileName
	 * @param outputPath
	 */
	public static boolean buildThemes(String inputFileName, String outputPath) {
		if(inputFileName == null || outputPath == null) {
			printUsage();
			return false;
		}
		AmexioThemeFactory factory = new AmexioThemeFactory(inputFileName,outputPath);
		if(factory.createThemes()) {
			System.out.println("Theme Generation Process Completed...");
			return true;
		} else {
			System.out.println("Unable to find the file");
		}
		return false;
	}
}


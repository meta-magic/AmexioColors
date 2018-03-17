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

/**
 * Amexio Color Version
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date
 */
public class AmexioCLIHelp {
	
	public static final String NL = System.getProperty("line.separator");

	public static final String VERSION = "1.0.4";
	
	public static final String HELP = "" + NL
			+ "----------------------------------------------------------------------" + NL
			+ "--help\tShow this HELP messages" + NL + NL
			+ "-g\tGenerate All Files" + NL
			+ "-d\tGenerate ONLY JSONs for Amexio Demo Apps" + NL
			+ "-a\tGenerate ONLY JSONs for Amexio API Web Site" + NL
			+ "-t\tGenerate ONLY SCSS files for the Theme (Default)" + NL
			+ "-c\tGenerate ONLY SCSS for Amexio Colors" + NL + NL
			+ "-i\tThemes Input File"		+ NL
			+ "-o\tThemes output Directory" + NL
			+ "----------------------------------------------------------------------" + NL
			+ "";
	
	// ASCII Art Creator: http://www.network-science.de/ascii/
	// Shadow

	public static final String PRODUCT_LOGO = ""
			+ "	    \\                       _)  "    + NL
			+ "	   _ \\   __ `__ \\   _ \\ \\  / |  _ \\ "    + NL
			+ "	  ___ \\  |   |   |  __/`  <  | (   |"    + NL
			+ "	_/   _ \\_|  _|  _|\\___|_/\\_\\_|\\___/ "    + NL
			+"" + NL;
	
	public static final String PRODUCT = "" 
			+ "Amexio Colors v" + VERSION + NL
			+ "Copyright (c) 2018, MetaMagic Global Inc, NJ, USA" + NL
			+ "----------------------------------------------------------------------" + NL
			+ PRODUCT_LOGO
			+ "Checkout more details in: https://www.amexio.tech/amexio-colors" + NL
			+ "----------------------------------------------------------------------" + NL;
	
	public static final String PARAM_EXAMPLE = ""
			+ "themesInputFile : Sample Input File Contains following data" + NL 
			+ "// Amexio Themes v4.0 - Jan 31, 2018" + NL 
			+ "// Design-Type : Material Design" + NL 
			+ "// Theme-Version : 4.0" + NL 
			+ "army-olive,#4B5320,#708238" + NL 
			+ "ash-stone-black,#544C4A,#877F7D" + NL + NL
			+ "----------------------------------------------------------------------" + NL
			+ "outputFolder: All the required files will be generated" + NL
			+ "              in this folder. Example /home/johndoe/themes/"  + NL
			+ "----------------------------------------------------------------------"  + NL
			+ "Usage: ac themesInputFile -d outputFolder"  + NL
			+ "----------------------------------------------------------------------";

}

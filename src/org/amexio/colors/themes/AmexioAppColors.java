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
package org.amexio.colors.themes;

import org.amexio.colors.core.Color;

/**
 * Theme Builder will automatically determines the Font Colors and 
 * Background Colors for various component properties like 
 * <p>
 * 01. App Bacground Color
 * 02. App Foreground Color
 * 03. App Header Background Color
 * 04. App Header Foreground Color
 * 05. App Header Hover Color
 * 06. App Header Hover Foreground Color
 * <p>
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 25, 2018
 */
public final class AmexioAppColors {
	
	public static final String NL = System.getProperty("line.separator");
	
	// App Variables
	private final Color appBackgroundColor;
	private final Color appForegroundColor;
	
	private final Color appHeaderBackgroundColor;
	private final Color appHeaderForegroundColor;
	
	private final Color appHeaderMenuBackgroundColor;
	private final Color appHeaderMenuFontColor;
	
	private final Color appHeaderHoverBackgroundColor;
	private final Color appHeaderHoverForegroundColor;
	
	/**
	 * App Colors
	 * 
	 * @param Color _bgColor
	 * @param Color _headerBGColor
	 */
	public AmexioAppColors(Color _bgColor, Color _headerBGColor) {
		appBackgroundColor 				= _bgColor;
		appForegroundColor				= _bgColor.foregroundColor();
		
		appHeaderBackgroundColor		= _headerBGColor;
		appHeaderForegroundColor		= _headerBGColor.foregroundColor();
				
		Color pureColor					= _headerBGColor.pureColor();
		// appHeaderMenuBackgroundColor	= pureColor.darker(25);
		// appHeaderMenuFontColor		= appHeaderMenuBackgroundColor.foregroundColor();
		
		appHeaderMenuBackgroundColor	= _headerBGColor;
		appHeaderMenuFontColor			= _headerBGColor.foregroundColor();		
		
		appHeaderHoverBackgroundColor 	= appHeaderMenuBackgroundColor.lighter(45);
		appHeaderHoverForegroundColor	= appHeaderMenuBackgroundColor.darker(35);
	}
	
	/**
	 * Prints the SCSS for App Vars
	 * 
	 * @return String
	 */
	public String printSCSS() {
		StringBuilder sb = new StringBuilder();
		sb.append("/** App Color Variables ------------------------ */").append(NL);
		sb.append("$appBackground : ").append("var(--appBackground);").append(NL);
		sb.append("$appBackgroundImage : ").append("var(--appBackgroundImage);").append(NL);

		sb.append("$appForegroundColor : ").append("var(--appForegroundColor);").append(NL); 
		
		sb.append("$appHeaderBGColor : ").append("var(--appHeaderBGColor);").append(NL);
		sb.append("$appHeaderFontColor : ").append("var(--appHeaderFontColor);").append(NL);

		sb.append("$appHeaderMenuBGColor : ").append("var(--appHeaderMenuBGColor);").append(NL);
		sb.append("$appHeaderMenuFontColor : ").append("var(--appHeaderMenuFontColor);").append(NL);

		
		sb.append("$appHeaderHoverBGColor : ").append("var(--appHeaderHoverBGColor);").append(NL);
		sb.append("$appHeaderHoverFontColor : ").append("var(--appHeaderHoverFontColor);").append(NL);
		sb.append(NL);
		return sb.toString();
	}

	/**
	 * Prints the CSS3 Variables for App Colors
	 * 
	 * @return
	 */
	public String printCSS() {
		StringBuilder sb = new StringBuilder();
		sb.append("/** App Color CSS Variables ------------------------ */").append(NL);
		sb.append("--appBackground :").append(appBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("--appBackgroundImage : none;").append(NL);

		sb.append("--appForegroundColor :").append(appForegroundColor.hexStr()).append(";").append(NL); 
		
		sb.append("--appHeaderBGColor :").append(appHeaderBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("--appHeaderFontColor :").append(appHeaderForegroundColor.hexStr()).append(";").append(NL);

		sb.append("--appHeaderMenuBGColor :").append(appHeaderMenuBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("--appHeaderMenuFontColor :").append(appHeaderMenuFontColor.hexStr()).append(";").append(NL);

		
		sb.append("--appHeaderHoverBGColor :").append(appHeaderHoverBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("--appHeaderHoverFontColor :").append(appHeaderHoverForegroundColor.hexStr()).append(";").append(NL);
		sb.append(NL);
		return sb.toString();
	}
	
	/**
	 * Prints the CSS3 Vars as a JSON for App Vars
	 * 
	 * @return
	 */
	public String printCSSJSON() {
		StringBuilder sb = new StringBuilder();
		// sb.append("/** App Color CSS Variables ------------------------ */").append(NL);
		sb.append("{ \"key\": \"--appBackground\", \"value\": \"").append(appBackgroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--appBackgroundImage\", \"value\": \"none\"},").append(NL);

		sb.append("{ \"key\": \"--appForegroundColor\", \"value\": \"").append(appForegroundColor.hexStr()).append("\"},").append(NL); 
		
		sb.append("{ \"key\": \"--appHeaderBGColor\", \"value\": \"").append(appHeaderBackgroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--appHeaderFontColor\", \"value\": \"").append(appHeaderForegroundColor.hexStr()).append("\"},").append(NL);

		sb.append("{ \"key\": \"--appHeaderMenuBGColor\", \"value\": \"").append(appHeaderMenuBackgroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--appHeaderMenuFontColor\", \"value\": \"").append(appHeaderMenuFontColor.hexStr()).append("\"},").append(NL);

		
		sb.append("{ \"key\": \"--appHeaderHoverBGColor\", \"value\": \"").append(appHeaderHoverBackgroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--appHeaderHoverFontColor\", \"value\": \"").append(appHeaderHoverForegroundColor.hexStr()).append("\"}").append(NL);

		return sb.toString();
	}
}

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

import org.amexio.colors.core.Color;

/**
 * Theme Builder will automatically determines the Font Colors and 
 * Background Colors for various component properties like 
 * 
 * 01. Component Bacground Color
 * 02. Component Foreground Color
 * 
 * 03. Component Header Background Color
 * 04. Component Header Foreground Color
 * 05. Component Hover Background Color
 * 06. Component Hover Foreground Color
 * 07. Component Footer Background Color
 * 08. Component Footer Foreground Color
 * 
 * 09. Component Active Background Color
 * 10. Component Active Foreground Color
 * 11. Component Disabled Background Color
 * 12. Component Disabled Foreground Color
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 25, 2018
 */
public final class AmexioComponentColors {
	
	public static final String NL = System.getProperty("line.separator");

	// Component Structure Color Variables
	private final Color componentBackgroundColor;
	private final Color componentForegroundColor;
	private final Color componentHeaderBackgroundColor;
	private final Color componentHeaderForegroundColor;
	private final Color componentFooterBackgroundColor;
	private final Color componentFooterForegroundColor;
	
	// Component State Colors
	private final Color componentHeaderHoverBackgroundColor;
	private final Color componentHeaderHoverForegroundColor;
	private final Color componentActiveBackgroundColor;
	private final Color componentActiveForegroundColor;
	private final Color componentDisabledBackgroundColor;
	private final Color componentDisbaledForegroundColor;
	
	/**
	 * Component Colors
	 * 
	 * @param Color _bgColor
	 * @param Color _headerBGColor
	 */
	public AmexioComponentColors(Color _bgColor, Color _headerBGColor) {
		// Component Structure Colors
		componentBackgroundColor 				= _bgColor;
		componentForegroundColor					= _bgColor.foregroundColor();
		componentHeaderBackgroundColor			= _headerBGColor;
		componentHeaderForegroundColor			= _headerBGColor.foregroundColor();
		componentFooterBackgroundColor			= _headerBGColor.foregroundColor();
		componentFooterForegroundColor			= _headerBGColor;
		
		// Component State Change Colors
		componentHeaderHoverBackgroundColor 		= _headerBGColor.lighter(60);
		componentHeaderHoverForegroundColor		= _headerBGColor.darker(10);
		
		Color pureBGColor 						= _headerBGColor.pureColor();
		Color grayTone							= _headerBGColor.grayTone();
		
		componentActiveBackgroundColor			= pureBGColor.lighter(30);
		componentActiveForegroundColor			= pureBGColor.darker(40);
		componentDisabledBackgroundColor			= grayTone;
		componentDisbaledForegroundColor			= grayTone.darker(30);
	}
	
	/**
	 * Prints the SCSS for Component Vars
	 * 
	 * @return String
	 */
	public String printSCSS() {
		StringBuilder sb = new StringBuilder();
		sb.append("/** Component Color Variables ------------------------ */").append(NL);
		sb.append("$componentBGColor :").append(componentBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("$componentFontColor :").append(componentForegroundColor.hexStr()).append(";").append(NL); 
		
		sb.append("$componentHeaderBGColor :").append(componentHeaderBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("$componentHeaderFontColor :").append(componentHeaderForegroundColor.hexStr()).append(";").append(NL);
		sb.append("$componentFooterBGColor :").append(componentFooterBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("$componentFooterFontColor :").append(componentFooterForegroundColor.hexStr()).append(";").append(NL);
		
		sb.append("$componentHeaderHoverBGColor :").append(componentHeaderHoverBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("$componentHeaderHoverFontColor :").append(componentHeaderHoverForegroundColor.hexStr()).append(";").append(NL);
		
		sb.append("$componentActiveBGColor :").append(componentActiveBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("$componentActiveFontColor :").append(componentActiveForegroundColor.hexStr()).append(";").append(NL);
		sb.append("$componentDisabledBGColor :").append(componentDisabledBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("$componentDisabledFontColor :").append(componentDisbaledForegroundColor.hexStr()).append(";").append(NL);
		
		sb.append(NL);
		return sb.toString();
	}
}

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
 * 01. Component Bacground Color
 * 02. Component Foreground Color
 * <p>
 * 03. Component Header Background Color
 * 04. Component Header Foreground Color
 * 05. Component Hover Background Color
 * 06. Component Hover Foreground Color
 * 07. Component Footer Background Color
 * 08. Component Footer Foreground Color
 * <p>
 * 09. Component Active Background Color
 * 10. Component Active Foreground Color
 * 11. Component Disabled Background Color
 * 12. Component Disabled Foreground Color
 * <p>
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
	
	private final Color componentDataBackgroundColor;
	private final Color componentDataForegroundColor;
	
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
		componentFooterBackgroundColor			= _headerBGColor.lighter(45);
		componentFooterForegroundColor			= _headerBGColor.darker(45);
		
		// Get the Pure Colors for Color Variations
		Color pureBGColor 						= _headerBGColor.pureColor();
		Color grayTone							= _headerBGColor.grayTone();
		
		// Component Data Colors
		componentDataBackgroundColor				= pureBGColor.darker(45);
		componentDataForegroundColor				= pureBGColor.lighter(30);
		
		// Component State Change Colors
		componentHeaderHoverBackgroundColor 		= pureBGColor.lighter(35);
		componentHeaderHoverForegroundColor		= pureBGColor.darker(35);
		
		componentActiveBackgroundColor			= pureBGColor.lighter(20);
		componentActiveForegroundColor			= pureBGColor.darker(45);
		
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
		sb.append("$componentBGColor : ").append("var(--componentBGColor);").append(NL);
		sb.append("$componentFontColor : ").append("var(--componentFontColor);").append(NL); 
		
		sb.append("$componentHeaderBGColor : ").append("var(--componentHeaderBGColor);").append(NL);
		sb.append("$componentHeaderFontColor : ").append("var(--componentHeaderFontColor);").append(NL);
		sb.append("$componentFooterBGColor : ").append("var(--componentFooterBGColor);").append(NL);
		sb.append("$componentFooterFontColor : ").append("var(--componentFooterFontColor);").append(NL);
		
		sb.append("$componentDataBGColor : ").append("var(--componentDataBGColor);").append(NL);
		sb.append("$componentDataFontColor : ").append("var(--componentDataFontColor);").append(NL);
		
		sb.append("$componentHoverBGColor : ").append("var(--componentHoverBGColor);").append(NL);
		sb.append("$componentHoverFontColor : ").append("var(--componentHoverFontColor);").append(NL);
		
		sb.append("$componentActiveBGColor : ").append("var(--componentActiveBGColor);").append(NL);
		sb.append("$componentActiveFontColor : ").append("var(--componentActiveFontColor);").append(NL);
		sb.append("$componentDisabledBGColor : ").append("var(--componentDisabledBGColor);").append(NL);
		sb.append("$componentDisabledFontColor : ").append("var(--componentDisabledFontColor);").append(NL);
		sb.append(NL);
		sb.append("$componentBoxShadow  : ").append("var(--componentBoxShadow);").append(NL);
		
		sb.append(NL);
		return sb.toString();
	}
	
	/**
	 * Prints the CSS for Component Vars
	 * 
	 * @return String
	 */
	public String printCSS() {
		StringBuilder sb = new StringBuilder();
		sb.append("/** Component Color CSS Variables ------------------------ */").append(NL);
		sb.append("--componentBGColor :").append(componentBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("--componentFontColor :").append(componentForegroundColor.hexStr()).append(";").append(NL); 
		
		sb.append("--componentHeaderBGColor :").append(componentHeaderBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("--componentHeaderFontColor :").append(componentHeaderForegroundColor.hexStr()).append(";").append(NL);
		sb.append("--componentFooterBGColor :").append(componentFooterBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("--componentFooterFontColor :").append(componentFooterForegroundColor.hexStr()).append(";").append(NL);
		
		sb.append("--componentDataBGColor :").append(componentDataBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("--componentDataFontColor :").append(componentDataForegroundColor.hexStr()).append(";").append(NL);
		
		sb.append("--componentHoverBGColor :").append(componentHeaderHoverBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("--componentHoverFontColor :").append(componentHeaderHoverForegroundColor.hexStr()).append(";").append(NL);
		
		sb.append("--componentActiveBGColor :").append(componentActiveBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("--componentActiveFontColor :").append(componentActiveForegroundColor.hexStr()).append(";").append(NL);
		sb.append("--componentDisabledBGColor :").append(componentDisabledBackgroundColor.hexStr()).append(";").append(NL);
		sb.append("--componentDisabledFontColor :").append(componentDisbaledForegroundColor.hexStr()).append(";").append(NL);
		sb.append(NL);
		
		sb.append("--componentBoxShadow :0 0px 1px 0 white, 0 2px 10px 0 rgba(0, 0, 0, 0.12)").append(NL);;

		sb.append(NL);
		return sb.toString();
	}
	
	/**
	 * Print the CSS3 Vars for the Component Variables
	 * @return
	 */
	public String printCSSJSON() {
		StringBuilder sb = new StringBuilder();
		// sb.append("/** Component Color CSS Variables ------------------------ */").append(NL);
		sb.append("{ \"key\": \"--componentBGColor\", \"value\": \"").append(componentBackgroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--componentFontColor\", \"value\": \"").append(componentForegroundColor.hexStr()).append("\"},").append(NL); 
		
		sb.append("{ \"key\": \"--componentHeaderBGColor\", \"value\": \"").append(componentHeaderBackgroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--componentHeaderFontColor\", \"value\": \"").append(componentHeaderForegroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--componentFooterBGColor\", \"value\": \"").append(componentFooterBackgroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--componentFooterFontColor\", \"value\": \"").append(componentFooterForegroundColor.hexStr()).append("\"},").append(NL);
		
		sb.append("{ \"key\": \"--componentDataBGColor\", \"value\": \"").append(componentDataBackgroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--componentDataFontColor\", \"value\": \"").append(componentDataForegroundColor.hexStr()).append("\"},").append(NL);
		
		sb.append("{ \"key\": \"--componentHoverBGColor\", \"value\": \"").append(componentHeaderHoverBackgroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--componentHoverFontColor\", \"value\": \"").append(componentHeaderHoverForegroundColor.hexStr()).append(";\"},").append(NL);
		
		sb.append("{ \"key\": \"--componentActiveBGColor\", \"value\": \"").append(componentActiveBackgroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--componentActiveFontColor\", \"value\": \"").append(componentActiveForegroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--componentDisabledBGColor\", \"value\": \"").append(componentDisabledBackgroundColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--componentDisabledFontColor\", \"value\": \"").append(componentDisbaledForegroundColor.hexStr()).append("\"},").append(NL);
		sb.append(NL);
		
		sb.append("{ \"key\": \"--componentBoxShadow\", \"value\": \"0 0px 1px 0 white, 0 2px 10px 0 rgba(0, 0, 0, 0.12)\"}").append(NL);;

		sb.append(NL);
		return sb.toString();
	}
}

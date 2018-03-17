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

import java.util.ArrayList;

import org.amexio.colors.core.Color;
import org.amexio.colors.web.Colors;

/**
 * Amexio Colors 
 * <p>
 * 12 Standard Background Colors and its corresponding Font colors defined along with 
 * CSS class as amexio-color (red, blue etc)
 * 
 * <p>
 * 
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date
 */
public final class AmexioColors {
	
	public static final String NL = System.getProperty("line.separator");
	
	// Random Colors to be used within a theme
	public static final Color amexioColorRedLight	= Colors.ORANGE.CORAL;
	public static final Color amexioColorRedDark		= Colors.RED.CRIMSON;
	public static final Color amexioColorGreenLight	= Colors.GREEN.LIME;
	public static final Color amexioColorGreenDark	= Colors.GREEN.SEAGREEN;
	public static final Color amexioColorPurpleLight = Colors.PURPLE.MAGENTA;
	public static final Color amexioColorPurpleDark	= Colors.PURPLE.DARKMAGENTA;
	public static final Color amexioColorBlueLight 	= Colors.BLUE.DEEPSKYBLUE;
	public static final Color amexioColorBlueDark 	= Colors.BLUE.DARKBLUE;
	public static final Color amexioColorBrownLight = Colors.BROWN.SANDYBROWN;
	public static final Color amexioColorBrownDark 	= Colors.BROWN.MAROON;
	public static final Color amexioColorYellowLight	= Colors.YELLOW.GOLD;
	public static final Color amexioColorYellowDark	= new Color("#ff9900"); // Colors.RED.FIREBRICK;
	public static final Color amexioColorBlack		= Colors.GRAY.BLACK;
	public static final Color amexioColorWhite		= Colors.WHITE.WHITE;
	
	
	// Font Colors for all the Light and Dark Colors
	public static final Color amexioFontForRedLight		= amexioColorRedLight.foregroundColor();
	public static final Color amexioFontForRedDark		= amexioColorRedDark.foregroundColor();
	public static final Color amexioFontForGreenLight	= amexioColorGreenLight.foregroundColor();
	public static final Color amexioFontForGreenDark		= amexioColorGreenDark.foregroundColor();
	public static final Color amexioFontForPurpleLight	= amexioColorPurpleLight.foregroundColor();
	public static final Color amexioFontForPurpleDark	= amexioColorPurpleDark.foregroundColor();
	public static final Color amexioFontForBlueLight		= amexioColorBlueLight.foregroundColor();
	public static final Color amexioFontForBlueDark		= amexioColorBlueDark.foregroundColor();
	public static final Color amexioFontForBrownLight	= amexioColorBrownLight.foregroundColor();
	public static final Color amexioFontForBrownDark		= amexioColorBrownDark.foregroundColor();
	public static final Color amexioFontForYellowLight	= amexioColorYellowLight.foregroundColor();
	public static final Color amexioFontForYellowDark	= amexioColorYellowDark.foregroundColor();
	
	// Colors list
	public static final ArrayList<AmexioColorClass>	amexioColors = new ArrayList<AmexioColorClass>(20);

	static {
		amexioColors.add(new AmexioColorClass("amexio-red-light",amexioColorRedLight,amexioFontForRedLight));
		amexioColors.add(new AmexioColorClass("amexio-red",amexioColorRedDark,amexioFontForRedDark));
		amexioColors.add(new AmexioColorClass("amexio-green-light",amexioColorGreenLight,amexioFontForGreenLight));
		amexioColors.add(new AmexioColorClass("amexio-green",amexioColorGreenDark,amexioFontForGreenDark));
		amexioColors.add(new AmexioColorClass("amexio-purple-light",amexioColorPurpleLight,amexioFontForPurpleLight));
		amexioColors.add(new AmexioColorClass("amexio-purple",amexioColorPurpleDark,amexioFontForPurpleDark));
		amexioColors.add(new AmexioColorClass("amexio-blue-light",amexioColorBlueLight,amexioFontForBlueLight));
		amexioColors.add(new AmexioColorClass("amexio-blue",amexioColorBlueDark,amexioFontForBlueDark));
		amexioColors.add(new AmexioColorClass("amexio-brown-light",amexioColorBrownLight,amexioFontForBrownLight));
		amexioColors.add(new AmexioColorClass("amexio-brown",amexioColorBrownDark,amexioFontForBrownDark));
		amexioColors.add(new AmexioColorClass("amexio-yellow-light",amexioColorYellowLight,amexioFontForYellowLight));
		amexioColors.add(new AmexioColorClass("amexio-yellow",amexioColorYellowDark,amexioFontForYellowDark));
		amexioColors.add(new AmexioColorClass("amexio-black",amexioColorBlack,amexioColorWhite));
		amexioColors.add(new AmexioColorClass("amexio-white",amexioColorWhite,amexioColorBlack));
	}
	
	/**
	 * Amexio Color Definitions
	 * @return
	 */

	public static String printColorDefinitions() {
		StringBuilder sb = new StringBuilder();
		sb.append(NL);
		sb.append("/** Theme Additional Std Colors : Light and Dark shades --- */").append(NL);
		sb.append("$amexioColorRedLight : ").append(amexioColorRedLight.hexStr()).append(";").append(NL);
		sb.append("$amexioColorRedDark : ").append(amexioColorRedDark.hexStr()).append(";").append(NL);
		sb.append("$amexioColorGreenLight : ").append(amexioColorGreenLight.hexStr()).append(";").append(NL);
		sb.append("$amexioColorGreenDark : ").append(amexioColorGreenDark.hexStr()).append(";").append(NL);
		sb.append("$amexioColorPurpleLight : ").append(amexioColorPurpleLight.hexStr()).append(";").append(NL);
		sb.append("$amexioColorPurpleDark : ").append(amexioColorPurpleDark.hexStr()).append(";").append(NL);
		sb.append("$amexioColorBlueLight : ").append(amexioColorBlueLight.hexStr()).append(";").append(NL);
		sb.append("$amexioColorBlueDark : ").append(amexioColorBlueDark.hexStr()).append(";").append(NL);
		sb.append("$amexioColorBrownLight : ").append(amexioColorBrownLight.hexStr()).append(";").append(NL);
		sb.append("$amexioColorBrownDark : ").append(amexioColorBrownDark.hexStr()).append(";").append(NL);
		sb.append("$amexioColorYellowLight : ").append(amexioColorYellowLight.hexStr()).append(";").append(NL);
		sb.append("$amexioColorYellowDark : ").append(amexioColorYellowDark.hexStr()).append(";").append(NL);
		sb.append("$amexioColorBlack : ").append(amexioColorBlack.hexStr()).append(";").append(NL);
		sb.append("$amexioColorWhite : ").append(amexioColorWhite.hexStr()).append(";").append(NL);

		sb.append(NL);
		return sb.toString();
	}
	
	/**
	 * Amexio Color Font Definitions
	 * @return
	 */
	public static String printFontDefinitions() {
		StringBuilder sb = new StringBuilder();
		sb.append(NL);
		sb.append("/** Theme Additional Std Font Colors : Light and Dark shades --- */").append(NL);
		sb.append("$amexioFontForRedLight : ").append(amexioFontForRedLight.hexStr()).append(";").append(NL);
		sb.append("$amexioFontForRedDark : ").append(amexioFontForRedDark.hexStr()).append(";").append(NL);
		sb.append("$amexioFontForGreenLight : ").append(amexioFontForGreenLight.hexStr()).append(";").append(NL);
		sb.append("$amexioFontForGreenDark : ").append(amexioFontForGreenDark.hexStr()).append(";").append(NL);
		sb.append("$amexioFontForPurpleLight : ").append(amexioFontForPurpleLight.hexStr()).append(";").append(NL);
		sb.append("$amexioFontForPurpleDark : ").append(amexioFontForPurpleDark.hexStr()).append(";").append(NL);
		sb.append("$amexioFontForBlueLight : ").append(amexioFontForBlueLight.hexStr()).append(";").append(NL);
		sb.append("$amexioFontForBlueDark : ").append(amexioFontForBlueDark.hexStr()).append(";").append(NL);
		sb.append("$amexioFontForBrownLight : ").append(amexioFontForBrownLight.hexStr()).append(";").append(NL);
		sb.append("$amexioFontForBrownDark : ").append(amexioFontForBrownDark.hexStr()).append(";").append(NL);
		sb.append("$amexioFontForYellowLight : ").append(amexioFontForYellowLight.hexStr()).append(";").append(NL);
		sb.append("$amexioFontForYellowDark : ").append(amexioFontForYellowDark.hexStr()).append(";").append(NL);
		sb.append(NL);
		return sb.toString();
	}
	
	/**
	 * Returns the Color Class Definitions
	 * @return
	 */
	public static String printColorCSSDefinitons() {
		StringBuilder sb = new StringBuilder();
		sb.append(NL);
		sb.append("/** CSS Class definitions for the Amexio Colors --- */").append(NL);
		for(AmexioColorClass colorClass : amexioColors) {
			sb.append(colorClass.printCSS());
		}
		sb.append(NL);
		return sb.toString();
	}
	
	/**
	 * Print the Amexio Color CSS
	 * @return
	 */
	public static String printCSS() {
		StringBuilder sb = new StringBuilder();
		sb.append(printColorDefinitions());
		sb.append(printFontDefinitions());
		sb.append(printColorCSSDefinitons());
		return sb.toString();
	}
}

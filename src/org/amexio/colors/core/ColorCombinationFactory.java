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

package org.amexio.colors.core;

import org.amexio.colors.io.ThemeConfig;
import org.amexio.colors.web.Colors;

/**
 * Color Factory
 * 
 * @author Araf Karsh Hamid
 * @version 2.0
 * @date April 27, 2019
 */
public class ColorCombinationFactory {
	
	private final Color appBGColor = Colors.WHITE.WHITESMOKE;
	private final Color componentBGColor = Colors.WHITE.WHITE; 
	
	private final ThemeConfig themeConfig;
	
	private final Color themeColor1;
	private final Color themeColor2;
	private final Color themeColor3;
	private final Color themeColor4;
	private final Color themeColor5;
	private final Color themeColor6;
	
	/**
	 * Create Theme Colors based on Theme Config
	 * 
	 * @param _theme
	 */
	public ColorCombinationFactory(ThemeConfig _theme) {
		themeConfig = (_theme == null) ? new ThemeConfig() : _theme;
		themeColor1 = themeConfig.getPrimaryColor();
		switch(themeConfig.getColorAlgo()) {
		case ColorAlgoConstants.COLOR_DEFAULT:			// 0
			// Classic Dual Color Material Design themes with 2 colors
			Color color = themeColor1;
			if(themeColor1.hexStr().equalsIgnoreCase("#FFFFFF")) {
				color =  new Color(themeConfig.getColor2());
			}
			ColorAnalogousSix caf1 = new ColorAnalogousSix(color);
			themeColor2 = new Color(themeConfig.getColor2());
			// Colors with 30 degree deviation
			themeColor3 = caf1.getColor3();
			themeColor4 = caf1.getColor4();
			themeColor5 = caf1.getColor5();
			themeColor6 = caf1.getColor6();
			break;
		case ColorAlgoConstants.COLOR_ANALOGOUS:		// 1
		case ColorAlgoConstants.COLOR_ANALOGOUS_SIX:	// 2
			ColorAnalogousSix caf2 = new ColorAnalogousSix(themeColor1);
			// Colors with 30 degree deviation
			themeColor2 = caf2.getColor2();
			themeColor3 = caf2.getColor3();
			themeColor4 = caf2.getColor4();
			themeColor5 = caf2.getColor5();
			themeColor6 = caf2.getColor6();
			break;
		case ColorAlgoConstants.COLOR_ANALOGOUS_DUO:	// 3
			// Two sets of Color Analogous in Duo mode
			ColorAnalogousDuo cad = new ColorAnalogousDuo(themeColor1);
			themeColor2 = cad.getColorTop().getColorLeft();
			themeColor3 = cad.getColorTop().getColorRight();
			themeColor4 = cad.getColorBottom().getColorLeft();
			themeColor5 = cad.getColorBottom().getPrimaryColor();
			themeColor6 = cad.getColorBottom().getColorRight();
			break;
		case ColorAlgoConstants.COLOR_NEUTRAL: 			// 4
		case ColorAlgoConstants.COLOR_TRIADIC_SIX:		// 7
			ColorTriadicSix cts = new ColorTriadicSix(themeColor1);
			themeColor2 = cts.getColorLeft();
			themeColor3 = cts.getColorRight();
			themeColor4 = cts.getSecondaryColor();
			themeColor5 = cts.getSecondaryColorLeft();
			themeColor6 = cts.getSecondaryColorRight();
			break;
		default:
			// Default is Analogous Duo = 3
			// Two sets of Color Analogous in Duo mode
			ColorAnalogousDuo cad2 = new ColorAnalogousDuo(themeColor1);
			themeColor2 = cad2.getColorTop().getColorLeft();
			themeColor3 = cad2.getColorTop().getColorRight();
			themeColor4 = cad2.getColorBottom().getColorLeft();
			themeColor5 = cad2.getColorBottom().getPrimaryColor();
			themeColor6 = cad2.getColorBottom().getColorRight();
			break;
		}
	}

	/**
	 * @return the appBGColor
	 */
	public final Color getAppBGColor() {
		return appBGColor;
	}

	/**
	 * @return the componentBGColor
	 */
	public final Color getComponentBGColor() {
		return componentBGColor;
	}

	/**
	 * @return the theme
	 */
	public final ThemeConfig getTheme() {
		return themeConfig;
	}

	/**
	 * @return the themeColor1
	 */
	public final Color getThemeColor1() {
		return themeColor1;
	}

	/**
	 * @return the themeColor2
	 */
	public final Color getThemeColor2() {
		return themeColor2;
	}

	/**
	 * @return the themeColor3
	 */
	public final Color getThemeColor3() {
		return themeColor3;
	}

	/**
	 * @return the themeColor4
	 */
	public final Color getThemeColor4() {
		return themeColor4;
	}

	/**
	 * @return the themeColor5
	 */
	public final Color getThemeColor5() {
		return themeColor5;
	}

	/**
	 * @return the themeColor6
	 */
	public final Color getThemeColor6() {
		return themeColor6;
	}
	

}

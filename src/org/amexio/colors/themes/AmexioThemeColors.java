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
import org.amexio.colors.core.ColorAnalogousSix;
import org.amexio.colors.core.ColorCombinationFactory;
import org.amexio.colors.web.Colors;

/**
 * Defines Amexio Theme Params.
 * <p>
 * Based on the Theme Colors :
 * <p>
 * 01. Theme Color 1 
 * 02. Theme Color 2 
 * 03. Theme Color 3
 * 04. Theme Color 4
 * 05. Theme Font Color
 * 06. Theme Font Family
 * <p>
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
 * 01. Component Bacground Color
 * 02. Component Foreground Color
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
public class AmexioThemeColors {
	
	public static final String NL = System.getProperty("line.separator");

	// These are public ONLY because its Final 
	// and Immutable Variables
	public final Color theme1stColor;
	public final Color theme2ndColor;
	
	// More theme Colors :
	// Two create a 3 or 4 Color Themes
	public final Color theme3rdColor;
	public final Color theme4thColor;
	

	// These Colors are primarily used for App Background
	// & Component Background
	public final Color theme5thColor;
	public final Color theme6thColor;
	
	// Commong Font Family and Color
	public final Color themeFontColor;
	public final String themeFontFamily; 
	
	// Random Colors to be used within a theme
	public static final Color amexioColorRedLight = Colors.ORANGE.CORAL;
	public static final Color amexioColorRedDark = Colors.RED.CRIMSON;
	public static final Color amexioColorGreenLight = Colors.GREEN.LIME;
	public static final Color amexioColorGreenDark = Colors.GREEN.SEAGREEN;
	public static final Color amexioColorPurpleLight = Colors.PURPLE.MAGENTA;
	public static final Color amexioColorPurpleDark = Colors.PURPLE.DARKMAGENTA;
	public static final Color amexioColorBlueLight = Colors.BLUE.DEEPSKYBLUE;
	public static final Color amexioColorBlueDark = Colors.BLUE.DARKBLUE;
	public static final Color amexioColorBrownLight = Colors.BROWN.SANDYBROWN;
	public static final Color amexioColorBrownDark = Colors.BROWN.MAROON;
	public static final Color amexioColorYellowLight	= Colors.YELLOW.GOLD;
	public static final Color amexioColorYellowDark	= new Color("#ff9900"); // Colors.RED.FIREBRICK;

	
	/**
	 * Creates the Default Theme with Maroon, FireBrick, WhiteSmoke and Snow
	 * as the Four Theme Colors
	 * 
	 * Theme Colors ------------------------------------------
	 * Color 1 						= Maroon
	 * Color 2 						= FireBrick
	 * Color 3 						= Theme Color 3 (Auto Derived)
	 * Color 4 						= Theme Color 4 (Auto Derived)
	 * 
	 * App Colors Background Colors -------------------------
	 * App Background Color 			= WHITE SMOKE
	 * Component Background Color 	= SNOW
	 * 
	 * Font Family					= Ex. Roboto,Trebuchet MS,Arial,Helvetica,sans-serif
	 *  
	 * 
	 */
	public AmexioThemeColors() {
		this(null, null, null, null, null, null, null);
	}
	
	/**
	 * Define Amexio Theme with One Color.
	 * Rest of the Colors will be auto determined by the Theme Builder
	 * based on Best Color Patterns alogrithms.
	 * 
	 * Theme Colors ------------------------------------------
	 * Color 1 						= Theme Color 1
	 * Color 2 						= Theme Color 2 (Auto Derived)
	 * Color 3 						= Theme Color 3 (Auto Derived)
	 * Color 4 						= Theme Color 4 (Auto Derived)
	 * 
	 * App Colors Background Colors -------------------------
	 * App Background Color 			= WHITE SMOKE
	 * Component Background Color 	= SNOW
	 * 
	 * Font Family					= Roboto,Trebuchet MS,Arial,Helvetica,sans-serif
	 *  
	 * @param Color _color1
	 */
	public AmexioThemeColors(Color _color1) {
		this(_color1, null, null, null, null, null, null);
	}
	
	/**
	 * Define Amexio Theme with One Color.
	 * Rest of the Colors will be auto determined by the Theme Builder
	 * based on Best Color Patterns alogrithms.
	 * 
	 * Theme Colors ------------------------------------------
	 * Color 1 						= Theme Color 1
	 * Color 2 						= Theme Color 2 (Auto Derived)
	 * Color 3 						= Theme Color 3 (Auto Derived)
	 * Color 4 						= Theme Color 4 (Auto Derived)
	 * 
	 * App Colors Background Colors -------------------------
	 * App Background Color 			= WHITE SMOKE
	 * Component Background Color 	= SNOW
	 * 
	 * Font Family					= Ex. Roboto,Trebuchet MS,Arial,Helvetica,sans-serif
	 *   
	 * @param Color _color1
	 * @param String _fontFamily
	 */
	public AmexioThemeColors(Color _color1, String _fontFamily) {
		this(_color1, null, null, null, null, null, _fontFamily);
	}
	
	/**
	 * Define Amexio Theme by Two Colors.
	 * Rest of the Colors will be auto determined by the Theme Builder
	 * based on Best Color Patterns alogrithms.
	 * 
	 * Theme Colors ------------------------------------------
	 * Color 1 						= Theme Color 1
	 * Color 2 						= Theme Color 2
	 * Color 3 						= Theme Color 3 (Auto Derived)
	 * Color 4 						= Theme Color 4 (Auto Derived)
	 * 
	 * App Colors Background Colors -------------------------
	 * App Background Color 			= WHITE SMOKE
	 * Component Background Color 	= SNOW
	 * 
	 * Font Family					= Roboto,Trebuchet MS,Arial,Helvetica,sans-serif
	 *    
	 * @param Color _color1
	 * @param Color _color2
	 */
	public AmexioThemeColors(Color _color1, Color _color2) {
		this(_color1, _color2, null, null, null, null, null);
	}
	
	/**
	 * Define Amexio Theme by Two Colors with Font Family
	 * Rest of the Colors will be auto determined by the Theme Builder
	 * based on Best Color Patterns alogrithms.
	 * 
	 * Theme Colors ------------------------------------------
	 * Color 1 						= Theme Color 1
	 * Color 2 						= Theme Color 2
	 * Color 3 						= Theme Color 3 (Auto Derived)
	 * Color 4 						= Theme Color 4 (Auto Derived)
	 * 
	 * App Colors Background Colors -------------------------
	 * App Background Color 			= WHITE SMOKE
	 * Component Background Color 	= SNOW
	 * 
	 * Font Family					= Ex. Roboto,Trebuchet MS,Arial,Helvetica,sans-serif
	 *  
	 * @param Color _color1
	 * @param Color _color2
	 * @param String _fontFamily
	 */
	public AmexioThemeColors(Color _color1, Color _color2, String _fontFamily) {
		this(_color1, _color2, null, null, null, null, _fontFamily);
	}
	
	/**
	 * Define Amexio Theme by Three Colors.
	 * Rest of the Colors will be auto determined by the Theme Builder
	 * based on Best Color Patterns alogrithms.
	 * 
	 * Theme Colors ------------------------------------------
	 * Color 1 						= Theme Color 1
	 * Color 2 						= Theme Color 2
	 * Color 3 						= Theme Color 3
	 * Color 4 						= Theme Color 4 (Auto Derived)
	 * 
	 * App Colors Background Colors -------------------------
	 * App Background Color 			= WHITE SMOKE
	 * Component Background Color 	= SNOW
	 * 
	 * Font Family					= Roboto,Trebuchet MS,Arial,Helvetica,sans-serif
	 *  
	 * @param Color _color1
	 * @param Color _color2
	 * @param Color _color3
	 */
	public AmexioThemeColors(Color _color1, Color _color2, Color _color3) {
		this(_color1, _color2, _color3, null, null, null, null);
	}
	
	/**
	 * Define Amexio Theme by Four Colors.
	 * Rest of the Colors will be auto determined by the Theme Builder
	 * based on Best Color Patterns alogrithms.
	 * 
	 * Theme Colors ------------------------------------------
	 * Color 1 						= Theme Color 1
	 * Color 2 						= Theme Color 2
	 * Color 3 						= Theme Color 3
	 * Color 4 						= Theme Color 4
	 * 
	 * App Colors Background Colors -------------------------
	 * App Background Color 			= WHITE SMOKE
	 * Component Background Color 	= SNOW
	 * 
	 * Font Family					= Roboto,Trebuchet MS,Arial,Helvetica,sans-serif
	 *  
	 * @param _color1
	 * @param _color2
	 * @param _color3
	 * @param _color4
	 */
	public AmexioThemeColors(Color _color1, Color _color2, Color _color3, 
			Color _color4) {
		this(_color1, _color2, _color3, _color4, null, null, null);
	}
	
	/**
	 * Create Themes based ColorCombinationFactory
	 * 
	 * @param _ccf
	 */
	public AmexioThemeColors(ColorCombinationFactory _ccf) {
		this(_ccf.getThemeColor1(), _ccf.getThemeColor2(), _ccf.getThemeColor3(),
			_ccf.getThemeColor4(), _ccf.getThemeColor5(), _ccf.getThemeColor6(), null);
	}
	/**
	 * Define Amexio Theme by Six Colors.
	 * Rest of the Colors will be auto determined by the Theme Builder
	 * based on Best Color Patterns alogrithms.
	 * 
	 * Color 1 	= Theme Color 1
	 * Color 2 	= Theme Color 2
	 * Color 3 	= Theme Color 3
	 * Color 4 	= Theme Color 4
	 * Color 5	= Color 5
	 * Color 6 	= Color 6
	 * 
	 * Font Family Font Family
	 *  
	 * @param Color _color1
	 * @param Color _color2
	 * @param Color _color3
	 * @param Color _color4
	 * @param String _fontFamily
	 */
	public AmexioThemeColors(Color _color1, Color _color2, Color _color3, 
			Color _color4, Color _color5, Color _color6, String _fontFamily) {
		
		theme1stColor 	= (_color1 != null) ? _color1 : Colors.BROWN.MAROON;
		theme2ndColor 	= (_color2 != null) ? _color2 : Colors.RED.FIREBRICK;;

		theme3rdColor 	= (_color3 != null) ? _color3 : Colors.ORANGE.CORAL;
		theme4thColor 	= (_color4 != null) ? _color4 : Colors.GREEN.MEDIUMSPRINGGREEN;
		
		theme5thColor 	= (_color5 != null) ? _color5 : Colors.WHITE.WHITESMOKE;
		theme6thColor 	= (_color6 != null) ? _color6 : Colors.WHITE.WHITE;
		
		themeFontColor	= theme1stColor.pureColor().darker(45);
		themeFontFamily	= (_fontFamily != null) ? _fontFamily : "Roboto,Trebuchet MS,Arial,Helvetica,sans-serif";
	}
	
	/**
	 * Prints the SCSS for App Vars
	 * 
	 * @return String
	 */
	public String printSCSS() {
		StringBuilder sb = new StringBuilder();
		sb.append(NL);
		sb.append("/** Theme Color Variables ------------------------------- */").append(NL);
		sb.append("$themePrimaryColor : ").append("var(--themePrimaryColor);").append(NL);
		sb.append("$themeSecondaryColor : ").append("var(--themeSecondaryColor);").append(NL); 
		sb.append("$theme3rdColor : ").append("var(--theme3rdColor);").append(NL);
		sb.append("$theme4thColor : ").append("var(--theme4thColor);").append(NL);
		sb.append("$theme5thColor : ").append("var(--theme5thColor);").append(NL);
		sb.append("$theme6thColor : ").append("var(--theme6thColor);").append(NL);
		sb.append(NL);
		
		// Primary Color Shades
		sb.append("/** Primary Color shades -------------------------- */").append(NL);
		Color[] shades = theme1stColor.getShades();
		for(int x=0; x<shades.length; x++ ) {
			sb.append("$themePrimaryColorShade").append(x).append(" : ").append("var(--themePrimaryColorShade").append(x).append(");").append(NL);
		}
		sb.append(NL);
		sb.append("/** Theme Color Gradients -------------------------- */").append(NL);
		sb.append("$themePrimaryColorGradient : ").append("var(--themePrimaryColorGradient);").append(NL);
		sb.append("$themeSecondaryColorGradient : ").append("var(--themeSecondaryColorGradient);").append(NL); 
		sb.append("$theme3rdColorGradient : ").append("var(--theme3rdColorGradient);").append(NL);
		sb.append("$theme4thColorGradient : ").append("var(--theme4thColorGradient);").append(NL);
		sb.append("$theme5thColorGradient : ").append("var(--theme5thColorGradient);").append(NL);
		sb.append("$theme6thColorGradient : ").append("var(--theme6thColorGradient);").append(NL);
		sb.append(NL);
		
		sb.append("/** Theme Font Family -------------------------- */").append(NL);
		sb.append("$themeFontColor : ").append("var(--themeFontColor);").append(NL);
		sb.append("$themeFontFamily : ").append("var(--themeFontFamily);").append(NL);
		sb.append(NL);
		sb.append("$themePrimaryFontColor : ").append("var(--themePrimaryFontColor);").append(NL);
		sb.append("$themeSecondaryFontColor : ").append("var(--themeSecondaryFontColor);").append(NL); 
		sb.append("$theme3rdFontColor : ").append("var(--theme3rdFontColor);").append(NL);
		sb.append("$theme4thFontColor : ").append("var(--theme4thFontColor);").append(NL);
		sb.append("$theme5thFontColor : ").append("var(--theme5thFontColor);").append(NL);
		sb.append("$theme6thFontColor : ").append("var(--theme6thFontColor);").append(NL);
		
		sb.append(NL);
		sb.append("/** Theme Additional Std Colors : Light and Dark shades --- */").append(NL);
		
		sb.append("$amexioColorRedLight : ").append("var(--amexioColorRedLight);").append(NL);
		sb.append("$amexioColorRedDark : ").append("var(--amexioColorRedDark);").append(NL);
		sb.append("$amexioColorGreenLight : ").append("var(--amexioColorGreenLight);").append(NL);
		sb.append("$amexioColorGreenDark : ").append("var(--amexioColorGreenDark);").append(NL);
		sb.append("$amexioColorPurpleLight : ").append("var(--amexioColorPurpleLight);").append(NL);
		sb.append("$amexioColorPurpleDark : ").append("var(--amexioColorPurpleDark);").append(NL);
		sb.append("$amexioColorBlueLight : ").append("var(--amexioColorBlueLight);").append(NL);
		sb.append("$amexioColorBlueDark : ").append("var(--amexioColorBlueDark);").append(NL);
		sb.append("$amexioColorBrownLight : ").append("var(--amexioColorBrownLight);").append(NL);
		sb.append("$amexioColorBrownDark : ").append("var(--amexioColorBrownDark);").append(NL);
		sb.append("$amexioColorYellowLight : ").append("var(--amexioColorYellowLight);").append(NL);
		sb.append("$amexioColorYellowDark : ").append("var(--amexioColorYellowDark);").append(NL);
		sb.append(NL);
		return sb.toString();
	}
	
	/**
	 * Prints the CSS for App Vars
	 * 
	 * @return String
	 */
	public String printCSS() {
		StringBuilder sb = new StringBuilder();
		sb.append(NL);
		sb.append("/** Theme Color in CSS Variables ------------------------------- */").append(NL);
		sb.append("--themePrimaryColor : ").append(theme1stColor.hexStr()).append(";").append(NL);
		sb.append("--themeSecondaryColor : ").append(theme2ndColor.hexStr()).append(";").append(NL); 
		sb.append("--theme3rdColor : ").append(theme3rdColor.hexStr()).append(";").append(NL);
		sb.append("--theme4thColor : ").append(theme4thColor.hexStr()).append(";").append(NL);
		sb.append("--theme5thColor : ").append(theme5thColor.hexStr()).append(";").append(NL);
		sb.append("--theme6thColor : ").append(theme6thColor.hexStr()).append(";").append(NL);
		sb.append(NL);
		
		sb.append("--themePrimaryColorHSLA : ").append(theme1stColor.hsla()).append(";").append(NL);
		sb.append("--themeSecondaryColorHSLA : ").append(theme2ndColor.hsla()).append(";").append(NL); 
		sb.append("--theme3rdColorHSLA : ").append(theme3rdColor.hsla()).append(";").append(NL);
		sb.append("--theme4thColorHSLA : ").append(theme4thColor.hsla()).append(";").append(NL);
		sb.append("--theme5thColorHSLA : ").append(theme5thColor.hsla()).append(";").append(NL);
		sb.append("--theme6thColorHSLA : ").append(theme6thColor.hsla()).append(";").append(NL);
		sb.append(NL);
		// Primary Color Shades
		sb.append("/** Primary Color shades -------------------------- */").append(NL);
		Color[] shades = theme1stColor.getShades();
		for(int x=0; x<shades.length; x++ ) {
			Color shadeColor = shades[x];
			sb.append("--themePrimaryColorShade").append(x).append(" : ").append(shadeColor.hexStr()).append(";").append(NL);
		}
		sb.append(NL);
		sb.append("/** Theme Color Gradients -------------------------- */").append(NL);
		sb.append("--themePrimaryColorGradient : ").append(theme1stColor.getLinearGradient()).append(";").append(NL);
		sb.append("--themeSecondaryColorGradient : ").append(theme2ndColor.getLinearGradient()).append(";").append(NL); 
		sb.append("--theme3rdColorGradient : ").append(theme3rdColor.getLinearGradient()).append(";").append(NL);
		sb.append("--theme4thColorGradient : ").append(theme4thColor.getLinearGradient()).append(";").append(NL);
		sb.append("--theme5thColorGradient : ").append(theme5thColor.getLinearGradient()).append(";").append(NL);
		sb.append("--theme6thColorGradient : ").append(theme6thColor.getLinearGradient()).append(";").append(NL);
		sb.append(NL);
		sb.append("/** Theme Font Family -------------------------- */").append(NL);
		sb.append("--themeFontColor : ").append(themeFontColor.hexStr()).append(";").append(NL);
		sb.append("--themeFontFamily : ").append(themeFontFamily).append(";").append(NL);
		sb.append(NL);
		sb.append("--themePrimaryFontColor : ").append(theme1stColor.foregroundColor().hexStr()).append(";").append(NL);
		sb.append("--themeSecondaryFontColor : ").append(theme2ndColor.foregroundColor().hexStr()).append(";").append(NL); 
		sb.append("--theme3rdFontColor : ").append(theme3rdColor.foregroundColor().hexStr()).append(";").append(NL);
		sb.append("--theme4thFontColor : ").append(theme4thColor.foregroundColor().hexStr()).append(";").append(NL);
		sb.append("--theme5thzFontColor : ").append(theme5thColor.foregroundColor().hexStr()).append(";").append(NL);
		sb.append("--theme6thFontColor : ").append(theme6thColor.foregroundColor().hexStr()).append(";").append(NL);
		
		sb.append(NL);
		sb.append("/** Theme Additional Std CSS Colors : Light and Dark shades --- */").append(NL);
		sb.append("--amexioColorRedLight : ").append(amexioColorRedLight.hexStr()).append(";").append(NL);
		sb.append("--amexioColorRedDark : ").append(amexioColorRedDark.hexStr()).append(";").append(NL);
		sb.append("--amexioColorGreenLight : ").append(amexioColorGreenLight.hexStr()).append(";").append(NL);
		sb.append("--amexioColorGreenDark : ").append(amexioColorGreenDark.hexStr()).append(";").append(NL);
		sb.append("--amexioColorPurpleLight : ").append(amexioColorPurpleLight.hexStr()).append(";").append(NL);
		sb.append("--amexioColorPurpleDark : ").append(amexioColorPurpleDark.hexStr()).append(";").append(NL);
		sb.append("--amexioColorBlueLight : ").append(amexioColorBlueLight.hexStr()).append(";").append(NL);
		sb.append("--amexioColorBlueDark : ").append(amexioColorBlueDark.hexStr()).append(";").append(NL);
		sb.append("--amexioColorBrownLight : ").append(amexioColorBrownLight.hexStr()).append(";").append(NL);
		sb.append("--amexioColorBrownDark : ").append(amexioColorBrownDark.hexStr()).append(";").append(NL);
		sb.append("--amexioColorYellowLight : ").append(amexioColorYellowLight.hexStr()).append(";").append(NL);
		sb.append("--amexioColorYellowDark : ").append(amexioColorYellowDark.hexStr()).append(";").append(NL);
		sb.append(NL);
		return sb.toString();
	}
	
	/**
	 * Prints the CSS JSON
	 * @return
	 */
	public String printCSSJSON() {
		StringBuilder sb = new StringBuilder();
		sb.append(NL);
		sb.append("{ \"key\": \"--appTransparency\", \"value\": \"rgba(0,0,0,0.87)\"},").append(NL);
		// sb.append("/** Theme Color in CSS Variables ------------------------------- */").append(NL);
		sb.append("{ \"key\": \"--themePrimaryColor\", \"value\": \"").append(theme1stColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--themeSecondaryColor\", \"value\": \"").append(theme2ndColor.hexStr()).append("\"},").append(NL); 
		sb.append("{ \"key\": \"--theme3rdColor\", \"value\": \"").append(theme3rdColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--theme4thColor\", \"value\": \"").append(theme4thColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--theme5thColor\", \"value\": \"").append(theme5thColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--theme6thColor\", \"value\": \"").append(theme6thColor.hexStr()).append("\"},").append(NL);
		sb.append(NL);
		
		sb.append("{ \"key\": \"--themePrimaryColorHSLA\", \"value\": \"").append(theme1stColor.hsla()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--themeSecondaryColorHSLA\", \"value\": \"").append(theme2ndColor.hsla()).append("\"},").append(NL); 
		sb.append("{ \"key\": \"--theme3rdColorHSLA\", \"value\": \"").append(theme3rdColor.hsla()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--theme4thColorHSLA\", \"value\": \"").append(theme4thColor.hsla()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--theme5thColorHSLA\", \"value\": \"").append(theme5thColor.hsla()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--theme6thColorHSLA\", \"value\": \"").append(theme6thColor.hsla()).append("\"},").append(NL);
		sb.append(NL);
		// Primary Color Shades
		// sb.append("/** Primary Color shades -------------------------- */").append(NL);
		Color[] shades = theme1stColor.getShades();
		for(int x=0; x<shades.length; x++ ) {
			Color shadeColor = shades[x];
			sb.append("{ \"key\": \"--themePrimaryColorShade").append(x).append("\", \"value\": \"").append(shadeColor.hexStr()).append("\"},").append(NL);
		}
		sb.append(NL);
		// sb.append("/** Theme Color Gradients -------------------------- */").append(NL);
		sb.append("{ \"key\": \"--themePrimaryColorGradient\", \"value\": \"").append(theme1stColor.getLinearGradient()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--themeSecondaryColorGradient\", \"value\": \"").append(theme2ndColor.getLinearGradient()).append("\"},").append(NL); 
		sb.append("{ \"key\": \"--theme3rdColorGradient\", \"value\": \"").append(theme3rdColor.getLinearGradient()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--theme4thColorGradient\", \"value\": \"").append(theme4thColor.getLinearGradient()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--theme5thColorGradient\", \"value\": \"").append(theme5thColor.getLinearGradient()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--theme6thColorGradient\", \"value\": \"").append(theme6thColor.getLinearGradient()).append("\"},").append(NL);
		sb.append(NL);
		// sb.append("/** Theme Font Family -------------------------- */").append(NL);
		sb.append("{ \"key\": \"--themeFontColor\", \"value\": \"").append(themeFontColor.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--themeFontFamily \", \"value\": \"").append(themeFontFamily).append("\"},").append(NL);
		sb.append(NL);
		sb.append("{ \"key\": \"--themePrimaryFontColor\", \"value\": \"").append(theme1stColor.foregroundColor().hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--themeSecondaryFontColor\", \"value\": \"").append(theme2ndColor.foregroundColor().hexStr()).append("\"},").append(NL); 
		sb.append("{ \"key\": \"--theme3rdFontColor\", \"value\": \"").append(theme3rdColor.foregroundColor().hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--theme4thFontColor\", \"value\": \"").append(theme4thColor.foregroundColor().hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--theme5thzFontColor\", \"value\": \"").append(theme5thColor.foregroundColor().hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--theme6thFontColor\", \"value\": \"").append(theme6thColor.foregroundColor().hexStr()).append("\"},").append(NL);
		
		sb.append(NL);
		// sb.append("/** Theme Additional Std CSS Colors : Light and Dark shades --- */").append(NL);
		sb.append("{ \"key\": \"--amexioColorRedLight\", \"value\": \"").append(amexioColorRedLight.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--amexioColorRedDark\", \"value\": \"").append(amexioColorRedDark.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--amexioColorGreenLight\", \"value\": \"").append(amexioColorGreenLight.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--amexioColorGreenDark\", \"value\": \"").append(amexioColorGreenDark.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--amexioColorPurpleLight\", \"value\": \"").append(amexioColorPurpleLight.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--amexioColorPurpleDark\", \"value\": \"").append(amexioColorPurpleDark.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--amexioColorBlueLight\", \"value\": \"").append(amexioColorBlueLight.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--amexioColorBlueDark\", \"value\": \"").append(amexioColorBlueDark.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--amexioColorBrownLight\", \"value\": \"").append(amexioColorBrownLight.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--amexioColorBrownDark\", \"value\": \"").append(amexioColorBrownDark.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--amexioColorYellowLight\", \"value\": \"").append(amexioColorYellowLight.hexStr()).append("\"},").append(NL);
		sb.append("{ \"key\": \"--amexioColorYellowDark\", \"value\": \"").append(amexioColorYellowDark.hexStr()).append("\"}").append(NL);
		sb.append(NL);
		return sb.toString();
	}
}

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

import java.text.DecimalFormat;

/**
 * Color Object.
 * <p>
 * A Color profile establishes the boundaries of the RGB or CMYK gamut, without a
 * color profile, the numbers expressed as RGB or CMYK has no meaning. While RGB is
 * mainly used for electronic displays CMYK is used for print medium.
 * <p>
 * When all the colors of RGB combines you will get white similar to the convergence
 * of the Rainbow colors resulting in white light.
 * <p>
 * At the same time when all the colors of CMYK combines you will get Black as it 
 * represents the absorption of light resulting in Darkness.
 * <p>
 * RGB and CMYK are "device dependent", meaning that you can get different colors 
 * with the same set of numbers.
 * <p>
 * <ul>
 * <li>RGB  = Red Green Blue
 * <li>HSL  = Hue Saturation Lightness
 * <li>HWB  = Hue Whiteness Blackness
 * <li>CMYK = Cyan Magenta Yellow Black
 * </ul>
 * <p>
 * Color is an immutable object with RGB with Alpha, HSL, RGB Normalized Values 
 * (to be used in Machine Learning), Hex Values and Color Channel identification. 
 * <p>
 * It also has the following Conversion Algorithms.
 * <p>
 * <ul>
 * <li>RGB to HSL
 * <li>RGB to HWB
 * <li>RGB to CMYK
 * <li>RGB to NCol (Natural Colors - To be implemented)
 * <p>
 * <li>HSL to RGB
 * </ul>
 * <p>
 * Functions available in Color
 * <p>
 * <ul>
 * <li>= Pure Color of the Current Color (Saturation = 100, Lightness = 51)
 * <li>= Gray Tone of the Current Color (Saturation = 25, Lightness = 81)
 * <li>= Finding Foreground Color for the Current Color
 * <li>= Finding Background Color for the Current Color
 * <li>= Darken the Current Color
 * <li>= Lighten the Current Color
 * </ul>
 * <p>
 * Color Factory uses the the above mentioned variables to understand the color patterns
 * and color combinations. 
 * <p>
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 22, 2018
 */
public final class Color {
	
	// RGB Values
	private final int red;
	private final int green;
	private final int blue;
	private final float alpha;
	private final int rgb;
	
	// Hex Values and Color Name
	private final String  hex;
	private final String colorName;
	private final String colorDesc;
	
	// HSL Values
	private final int hue;
	private final int sat;
	private final int light;
	
	// HWB Values
	private final double hu;
	private final double wh;
	private final double bl;
	
	// CMYK Values
	private double cyan;
	private double magenta;
	private double yellow;
	private double black;
	
	// Normalize the RGB Values between 0 - 1
	// These values will be used in Machine Learning algorithms
	// like SVM to identify a specific name based on color values.
	// Color Names are identified based on names available under 
	// org.amexio.colors.web Color Definitions
	private final float redNorm;
	private final float greenNorm;
	private final float blueNorm;
	
	// Min and Max Normalized RGB Values
	private final float minColor;
	private final float maxColor;
	
	// Find the Dominating RGB Value
	private final boolean redMax;
	private final boolean greenMax;
	private final boolean blueMax;
	
	/**
	 * Creates White Color
	 */
	public Color() {
		this("FFFFFF");
	}
	
	/**
	 * RGB
	 * 
	 * @param int _r
	 * @param int _g
	 * @param int _b
	 */
	public Color(int _r, int _g, int _b) {
		this(_r, _g, _b, 0, null);
	}
	
	/**
	 * Create Color with a HEX Value. 
	 * <p>
	 * Example for White = 0xFFFFFF, Black = 0x000000
	 * 
	 * @param String _hexValue
	 */
	public Color(String _hexValue) {
		this(checkHexValue(_hexValue));
	}
	
	/**
	 * Validate the String input for Hex Value
	 * @param _hexValue
	 * @return int
	 */
	private static int checkHexValue(String _hexValue) {
		if(_hexValue == null) return 0;
		_hexValue = _hexValue.trim();
		if(_hexValue.startsWith("#")) return (int)Long.parseLong(_hexValue.replace("#", ""), 16);
		return (int)Long.parseLong(_hexValue, 16);
	}
	
	/**
	 * Create a Color with an Integer Value
	 * 
	 * @param int _rgbValue
	 */
	public Color(int _rgbValue) {
		this((_rgbValue & 0xFF0000) >> 16, 
				(_rgbValue & 0xFF00) >> 8,
				(_rgbValue & 0xFF),0);
	}
	
	/**
	 * RGB 
	 * 
	 * @param double _r
	 * @param double _g
	 * @param double _b
	 */
	public Color(double _r, double _g, double _b) {
		this((int)_r, (int)_g, (int)_b, (int)0, null);
	}
	
	/**
	 * RGB with Alpha Channel for Tranparency
	 * 
	 * @param double _r
	 * @param double _g
	 * @param double _b
	 * @param float _a
	 */
	public Color(double _r, double _g, double _b, float _a) {
		this((int)_r, (int)_g, (int)_b, _a, null);
	}
	
	/**
	 * RGB with Color Name.
	 * 
	 * @param int _r
	 * @param int _g
	 * @param int _b
	 * @param String _name
	 */
	public Color(int _r, int _g, int _b, String _name) {
		this(_r, _g, _b, 0, _name);
	}
	
	/**
	 * RGB with Alpha Channel for Transparency and no Color Name.
	 * @param int _r
	 * @param int _g
	 * @param int _b
	 * @param float _a
	 */
	public Color(int _r, int _g, int _b, float _a) {
		this(_r, _g, _b, _a, null);
	}
	/**
	 * RGB with Alpha Channel for Transparency and witha Color Name
	 * 
	 * @param int _r
	 * @param int _g
	 * @param int _b
	 * @param float _a
	 * @param String _name
	 */
	public Color(int _r, int _g, int _b, float _a, String _name) {
		
		// RGB with Alpha for transparency
		red 			= (_r <0 || _r>255) ? 228 : _r;
		green 		= (_g <0 || _g>255) ? 237 : _g;
		blue 		= (_b <0 || _b>255) ? 130 : _b;
		alpha 		= (_a <0 || _r>1) ? 0   : _a;
		
		// RGB Integer Value
		rgb 			= 65536 * red + 256 * green + blue;

		// Hex Value
		hex			= createHexValue();
		colorName 	= (_name == null) ? hex : _name;
		colorDesc	= (_name == null) ? hex : createDescription(_name);
		
		// Normalize the RGB between 0 - 1
		redNorm		= (float) red / 255;
		greenNorm	= (float) green / 255;
		blueNorm		= (float) blue / 255;
		
		// Find the Min and Max Values of Normalized RGB
		minColor 	= Math.min(Math.min(redNorm, greenNorm), blueNorm);
		maxColor 	= Math.max(Math.max(redNorm, greenNorm), blueNorm);
		
		// Find Dominating RGB Channel 
		redMax		= (redNorm == maxColor) ? true : false;
		greenMax 	= (greenNorm == maxColor) ? true : false;
		blueMax		= (blueNorm == maxColor) ? true : false;
		
		// Calculate HSL Values - Hue Saturation Lightness
		light		= (int) Math.round((((minColor + maxColor) / 2) * 100));
		sat			= calculateSaturation();
		hue			= (int)calculateHue();
		
		// Calculate HWB Values - Hue Whiteness Blackness
		wh			= minColor;
		bl			= 1 - maxColor;
		hu			= calculateHueForHWB(); 
		
		// Calculate CMYK Values - Cyan Magenta Yellow Black
		calculateCMYK();
	}
	
	/**
	 * Get Hex Value of the RGB Integer
	 * @return
	 */
	private String createHexValue() {
		String hex = "000000";
		try {
			hex = Integer.toHexString(rgb);
		} catch(Exception ignored) {}
		switch(hex.length()) {
			case(1) : return "00000" + hex;
			case(2) : return "0000" + hex;
			case(3) : return "000" + hex;
			case(4) : return "00" + hex;
			case(5) : return "0" + hex;
			default:
				return hex;
		}
	}
	
	/**
	 * Calculate the Saturation
	 * 
	 * @return
	 */
	private int calculateSaturation() {
		if(minColor == maxColor) {
			return 0;
		} 
		if (light < 50) {
			return (int) Math.round((((maxColor-minColor) / (maxColor+minColor)) * 100));
		} else {
			return (int) Math.round((((maxColor-minColor) / (2.0-maxColor-minColor)) * 100));
		}
	}

	/**
	 * Calculate Hue
	 * @return
	 */
	private double calculateHue() {
		if(minColor == maxColor) {
			return 0;
		}
		double h = 0;
		if(redMax) {
			h = ((greenNorm-blueNorm) / (maxColor-minColor));
		} else if(greenMax) {
			h = 2.0 + ( (blueNorm - redNorm) / (maxColor-minColor) );
		} else if(blueMax) {
			h = (4.0 + (((redNorm - greenNorm) / (maxColor-minColor))));
		}
		h = h * 60;
		if(h < 0) {
			h = h + 360;	
		}
		return Math.round(h);
	}

	/**
	 * Calculate Hue for the Hue Whiteness and Blackness Color Model
	 * This the proposed standard for CSS4. 
	 * However, HTML5 doesn't support HWB.
	 * 
	 * @return double
	 */
	private double calculateHueForHWB() {
		double chroma = maxColor - minColor;
		if(chroma == 0) {
			return 0;
		}
		if (redMax) {
			return  Math.round((((greenNorm-blueNorm) / chroma) % 6) * 360);
		} else if (greenMax) {
			return Math.round(((((blueNorm - redNorm) / chroma) + 2) % 6) * 360);
		} else {
			return Math.round(((((redNorm - greenNorm) / chroma) + 4) % 6) * 360);
		}
	}
	
	/**
	 * Calculates the CMYK values of the Color
	 * <p>
	 * A Color profile establishes the boundaries of the RGB or CMYK gamut, without a
	 * color profile, the numbers expressed as RGB or CMYK has no meaning. While RGB is
	 * mainly used for electronic displays CMYK is used for print medium.
	 * <p>
	 * When all the colors of RGB combines you will get white similar to the convergence
	 * of the Rainbow colors results in white light.
	 * <p>
	 * At the same time when all the colors of CMYK combines you will get Black as it 
	 * represents the absorption of light resulting in Darkness.
	 * <p>
	 * RGB and CMYK are "device dependent", meaning that you can get different colors 
	 * with the same set of numbers.
	 */
	private void calculateCMYK() {
		// RGB to CMY
		cyan 	= 1 - redNorm;
		magenta 	= 1 - greenNorm;
		yellow 	= 1 - blueNorm;
		
		// CMY to CMYK
		double bValue 	= 1;
		
		if(cyan < bValue) bValue = cyan;
		if(magenta < bValue) bValue = magenta;
		if(yellow < bValue) bValue = yellow;
		
		// If K = 1 then reset the values to Zero
		if(bValue == 1) {
			cyan 	= 0;
			magenta 	= 0;
			yellow 	= 0;
		} else {
			cyan 	= (cyan - bValue) / (1 - bValue);
			magenta 	= (magenta - bValue) / (1 - bValue);
			yellow 	= (yellow - bValue) / (1 - bValue);
		}
		black = bValue;
	}

	/**
	 * Returns the CSS RGB Function with Alpha Value
	 * 
	 * @return
	 */
	public String rgbFunction() {
		StringBuilder sb = new StringBuilder();
		sb.append("rgb(").append(red).append(",").append(green).append(",");
		sb.append(blue).append(",").append(alpha).append(")");
		return sb.toString();
		
	}
	/**
	 * Returns Red Color Int Value
	 * 
	 * @return int
	 */
	public int red() {
		return red;
	}
	
	/**
	 * Returns the Normalized Value of Red (Value between 0 - 1)
	 * 
	 * @return float
	 */
	public float redNormalized() {
		return redNorm;
	}
	
	/**
	 * Returns Green Color Int Value
	 * 
	 * @return int
	 */
	public int green() {
		return green;
	}
	
	/**
	 * Returns the Normalized Value of Green (Value between 0 - 1)
	 * 
	 * @return float
	 */
	public float greenNormalized() {
		return greenNorm;
	}
	
	/**
	 * Returns Blue Color Int Value
	 * 
	 * @return int
	 */
	public int blue() {
		return blue;
	}
	
	/**
	 * Returns the Normalized Value of Blue (Value between 0 - 1)
	 * 
	 * @return float
	 */
	public float blueNormalized() {
		return blueNorm;
	}
	
	/**
	 * Returns Alpha Int Value
	 * 
	 * @return int
	 */
	public double alpha() {
		return alpha;
	}
	
	/**
	 * Returns the RGB Int Value
	 * @return
	 */
	public int rgb() {
		return rgb;
	}
	
	/**
	 * Returns the Hex Code for the Color
	 * Example : 7C0A02
	 * @return
	 */
	public String hex() {
		return hex;
	}
	
	/**
	 * Returns the Hex Code for the Color prefixed with #
	 * Example : #7C0A02
	 * @return
	 */
	public String hexStr() {
		return "#" + hex.trim();
	}
	
	/**
	 * Angle on the Color Wheel
	 * 
	 * @return int
	 */
	public int hue() {
		return hue;
	}
	
	/**
	 * The amount of Color / Chroma for this Color
	 * 
	 * @return int
	 */
	public int saturation() {
		return sat;
	}
	
	/**
	 * How Bright the Color is
	 * 
	 * @return int
	 */
	public int lightness() {
		return light;
	}
	
	/**
	 * Returns the Hue from HWB Color Model
	 * 
	 * @return double
	 */
	public double hwbHue() {
		return hu;
	}
	
	/**
	 * Returns the Whiness from HWB Color Model
	 * 
	 * @return double
	 */
	public double hwbWhiteness() {
		return wh;
	}
	
	/**
	 * Returns the Blackness frm HWB Color Model
	 * 
	 * @return double
	 */
	public double hwbBlackness() {
		return bl;
	}
	
	// -----------------------------------------------------------------------
	// Color Manipulations
	// -----------------------------------------------------------------------
	
	/**
	 * Returns shades and tones of the Pure Color.
	 * First 3 colors will be the Darker shades of the Pure Color
	 * Fourth Color will be the Pure Color
	 * Last 3 Colors will be the lighter shades of the Pure Color
	 * 
	 * @return Color[]
	 */
	public Color[] getShades() {
		Color c = pureColor();
		Color[] shades = new Color[7];
		shades[0] = c.darker(60);
		shades[1] = c.darker(40);
		shades[2] = c.darker(20);
		shades[3] = c;
		shades[4] = c.lighter(20);
		shades[5] = c.lighter(40);
		shades[6] = c.lighter(60);
		return shades;
	}
	
	/**
	 * Returns the Linear Gradient CSS3 Function for the Current Color
	 * 
	 * @return
	 */
	public String getLinearGradient() {
		Color c = pureColor();
		StringBuffer sb = new StringBuffer();
		sb.append("linear-gradient(to right, ");
		sb.append(c.darker(30).hexStr()).append(", ");
		sb.append(c.hexStr()).append(", ");
		sb.append(c.lighter(35).hexStr());
		sb.append(")");
		return sb.toString();
	}

	/**
	 * Returns the Radial Gradient CSS3 Function for the Current Color
	 * 
	 * @return
	 */
	public String getRadialGradient() {
		Color c = pureColor();
		StringBuffer sb = new StringBuffer();
		sb.append("radial-gradient(");
		sb.append(c.darker(30).hexStr()).append(", ");
		sb.append(c.hexStr()).append(", ");
		sb.append(c.lighter(35).hexStr());
		sb.append(")");
		return sb.toString();
	}
	
	/**
	 * Returns the CSS3 HSLA function for the Current Color
	 * 
	 * @return
	 */
	public String hsla() {
		StringBuffer sb = new StringBuffer();
		sb.append("hsla(");
		sb.append(this.hue).append(",").append(this.sat).append("%,").append(light).append("%,").append(alpha);
		sb.append(")");
		return sb.toString();
	}
	
	/**
	 * Returns the Pure Color for the Current Color <p>
	 * Saturation = 100, Lightness = 51, Hue will be Current Color Value
	 * 
	 * @return
	 */
	public Color pureColor() {
		return hsl2rgb(this.hue, 100, 51, this.alpha);
	}
	
	/**
	 * Returns the Gray Tone for the Current Color<p>
	 * Saturation = 25, Lightness = 81, Hue will be Current Color Value
	 * 
	 * @return
	 */
	public Color grayTone() {
		return hsl2rgb(this.hue, 25, 81, this.alpha);
	}
	
	/**
	 * Returns a Darker shade of the Current Color
	 * 
	 * @param float _percent
	 * @return Color
	 */
	public Color darker(float _percent) {
		float n = this.light - _percent;
		n = (n <=0) ? 1 : n;
		return hsl2rgb(this.hue, this.sat, n, this.alpha);
	}
	
	/**
	 * Returns the Lighter shade of the Current Color
	 * 
	 * @param float _percent
	 * @return Color
	 */
	public Color lighter(float _percent) {
		float n = this.light + _percent;
		n = (n >=100) ? 98 : n;
		return hsl2rgb(this.hue, this.sat, n, this.alpha);
	}
	
	/**
	 * Returns the Background Color for the Current Shade
	 * 
	 * @return Color
	 */
	public Color backgroundColor() {
		return reverse();
	}
	
	/**
	 * Returns the Foreground Color for the Current Shade
	 * 
	 * @return Color
	 */
	public Color foregroundColor() {
		return reverse();
	}
	
	/**
	 * Returns the Lighter / Darker Color for the Current Shade
	 * <p>
	 * Color Reverse Rules 
	 * <p>
	 * 1. Hue < 186, Light < 45 then Light = 96 (Towards White Color)
	 * 2. Hue between 186 & 219, Light < 60 then Light = 97
	 * 3. Hue between 220 & 286, Light < 77 then light = 98
	 * 4. Hue > 286, Light < 75 then light = 99
	 * 
	 * @return Color
	 */
	public Color reverse() {
		if(hue < 186) {
			return (light < 45) ?
				hsl2rgb(this.hue, this.sat, 96, this.alpha) :
				hsl2rgb(this.hue, this.sat, 7, this.alpha);		// Dark Color
		} else if(hue > 185 && hue < 220) {
			return (light < 60) ?
				hsl2rgb(this.hue, this.sat, 97, this.alpha) :
				hsl2rgb(this.hue, this.sat, 6, this.alpha);		// Dark Color
		} else if(hue > 219 && hue < 286) {
			return (light < 77) ?
				hsl2rgb(this.hue, this.sat, 98, this.alpha) :
				hsl2rgb(this.hue, this.sat, 5, this.alpha);		// Dark Color
		} else if(hue > 285) {
			return (light < 75) ?
				hsl2rgb(this.hue, this.sat, 99, this.alpha) :
				hsl2rgb(this.hue, this.sat, 4, this.alpha);		// Dark Color
		} else {
			return hsl2rgb(this.hue, this.sat, 3, this.alpha);	// Dark Color
		}
	}
	
	/**
	 * @deprecated
	 * @return
	 */
	private Color reverse2() {
		if(light <45) {
			return hsl2rgb(this.hue, this.sat, 97, this.alpha);
		} else if(light <58 && sat > 70) {
			return hsl2rgb(this.hue, this.sat, 97, this.alpha);
		} else {
			return hsl2rgb(this.hue, this.sat, 7, this.alpha);
		}
	}
	/**
	 * @deprecated
	 * @return
	 */
	private Color reverse1() {
		if(light <45) {
			return hsl2rgb(this.hue, this.sat, 97, this.alpha);
		} else {
			return hsl2rgb(this.hue, this.sat, 7, this.alpha);
		}
	}
	
	/**
	 * Returns Max Luminosity based on Saturation.
	 * 
	 * @param int _sat
	 * @return
	 */
	
	public static int maxLum(int _sat) {
		int x = 100 - _sat;
		if(x>0) {
			return x/2 + 50;
		}
		return 50;
	}
	
	/**
	 * Returns Max Saturation based on Luminosity.
	 * 
	 * @param _lum
	 * @return
	 */
	public static int maxSaturation(int _lum) {
		int x = 100 - _lum;
		if(x>0 && x<=50) {
			return  x*2;
		} else if (x==0) {
			return x;
		}
		return 50;
	}

	// -----------------------------------------------------------------------
	// Conversion Functions
	// -----------------------------------------------------------------------
	/**
	 * Create Color from HSL Values
	 * 
	 * @param Color color
	 * @return Color
	 */
	public static Color hsl2rgb(Color _c) { 
		return hsl2rgb(_c.red, _c.green, _c.blue, _c.alpha);
	}

	/**
	 * Convert HSL to RGB and returns the Color Object
	 * 
	 * @param _h
	 * @param _s
	 * @param _l
	 * @return Color
	 */
	public static Color hsl2rgb(float _h, float _s, float _l) {
		return hsl2rgb(_h, _s, _l, 0f);
	}
	
	/**
	 * Convert HSL to RGB and returns the Color Object
	 * 
	 * @param _h
	 * @param _s
	 * @param _l
	 * @param _a
	 * @return Color
	 */
	public static Color hsl2rgb(float _h, float _s, float _l, float _a) {
		// System.out.println("HSL2RGB \tHue="+_h+" Sat="+_s+" Lum="+_l+" Alpha="+_a);
		//  Normalizing the values between 0 - 1.
		_h = _h % 360.0f;
		_h /= 360f;
		_s /= 100f;
		_l /= 100f;

		float l1 = 0;

		if (_l < 0.5) {
			l1 = _l * (1 + _s);			// 1st Luminous Calc if Lum < 50%
		} else {
			l1 = (_l + _s) - (_s * _l);		// 1st Luminous Calc if Lum >= 50%
		}
		float l2 = 2 * _l - l1;			// 2nd Luminous Calculation

		// Do the testing for each Color Channels each with 3 Tests
		float r = Math.round(Math.max(0, threeRuleTests(l2, l1, _h + (1.0f / 3.0f))) * 255);
		float g = Math.round(Math.max(0, threeRuleTests(l2, l1, _h)) * 255);
		float b = Math.round(Math.max(0, threeRuleTests(l2, l1, _h - (1.0f / 3.0f))) * 255);

		// System.out.println("R="+r+" G="+g+" B="+b);		
		return new Color(r,g,b,_a);
	}
	/**
	 * Do all the three tests for all three Color Channels - one by one.
	 * <p>
	 * h = Represents the different color channel values of Red, Green & Blue
	 * 
	 * @param p
	 * @param q
	 * @param h
	 * @return float
	 */
	private static float threeRuleTests(float _p, float _q, float _h) {
		// If H is <0 add 1 or if its > 1 Substract 1
		if (_h < 0) _h += 1;
		if (_h > 1 ) _h -= 1;

		// Check the Rules
		if (6 * _h < 1) {						// Rule 1
			return _p + ((_q - _p) * 6 * _h);	// Calculation
		}
		if (2 * _h < 1 ) {						// Rule 2
			return  _q;							// Calculation
		}
		if (3 * _h < 2) {						// Rule 3
			return _p + ( (_q - _p) * 6 * ((2.0f / 3.0f) - _h) );
		}
		// System.out.println("P="+p);
		// Rule 4 - Return the First Luminous Calculation
   		return _p;
	}
	
	/**
	 * Convert the CSS name into words.
	 * 
	 * @param _s
	 * @return
	 */
	private String createDescription(String _s) {
		StringBuilder sb = new StringBuilder();
		for(int x = 0; x<_s.length(); x++) {
			char c = _s.charAt(x);
			if((int)c < 91) sb.append(" ");
			sb.append(c);
		}
		return sb.toString().trim();
	}
	
	/**
	 * Returns the Color Description
	 * 
	 * @return String
	 */
	public String getColorDescription() {
		return colorDesc;
	}
	
	/**
	 * Returns the Color Name or the Hex Value
	 * 
	 * @return String
	 */
	public String getColorName() {
		return colorName;
	}
	
	/**
	 * Returns the Color Name or the Hex Value.
	 * 
	 * @return String
	 */
	public String toString() {
		return colorName;
	}

	/**
	 * Returns the RGB value as hashcode.
	 * 
	 * @return int
	 */
	public int hashCode() {
		return rgb;
	}	
	
	/**
	 * Prints Required Color Values
	 * @return
	 */
	public String printColor() {
		StringBuilder s = new StringBuilder();
		s.append(colorName);
		s.append(": #").append(hex);
		s.append(" rgb(").append(red);
		s.append(",").append(green);
		s.append(",").append(blue);
		s.append(",").append(alpha);
		s.append(");");
		return s.toString();
	}
	/**
	 * Prints all the Color Values
	 * 
	 * @return String
	 */
	public String printRow() {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(3);
		StringBuilder s = new StringBuilder();
		s.append("desc=").append(colorDesc);
		s.append("|css=").append(colorName);
		s.append("|hex=#").append(hex);
		s.append("|r=").append(red);
		s.append("|g=").append(green);
		s.append("|b=").append(blue);
		s.append("|a=").append(alpha);
		s.append("|h=").append(hue);
		s.append("|s=").append(sat);
		s.append("|l=").append(light);
		s.append("|c=").append(df.format(cyan));
		s.append("|m=").append(df.format(magenta));
		s.append("|y=").append(df.format(yellow));
		s.append("|k=").append(df.format(black));
		s.append("|hu=").append(df.format(hu));
		s.append("|wh=").append(df.format(wh));
		s.append("|bl=").append(df.format(bl));
		return s.toString();
	}
	
	/**
	 * Prints the Normalized RGB values along with Hex for the lookup
	 * All the fields are separatd by Comma.
	 * Hex Code, Red Normalized Value, Green Normalized Value, Blue Normalized Value
	 * 
	 * @return String
	 */
	public String printNormalizedValues() {
		StringBuilder s = new StringBuilder();
		s.append(hex).append(",");
		s.append(redNorm).append(",");
		s.append(greenNorm).append(",");
		s.append(blueNorm);
		return s.toString();
	}
	
	/**
	 * Returns the JSON Structure for the Color
	 * 
	 * @return String
	 */
	public String printJSON() {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(3);
		StringBuilder s = new StringBuilder();
		s.append("{\"desc\": \"").append(colorDesc).append("\",");
		s.append("\"css\": \"").append(colorName).append("\",");
		s.append("\"hex\": \"#").append(hex).append("\",");
		s.append("\"r\":").append(red).append(",");
		s.append("\"g\":").append(green).append(",");
		s.append("\"b\":").append(blue).append(",");
		s.append("\"a\":").append(alpha).append(",");
		s.append("\"h\":").append(hue).append(",");
		s.append("\"s\":").append(sat).append(",");
		s.append("\"l\":").append(light).append(",");
		s.append("\"c\":").append(df.format(cyan)).append(",");
		s.append("\"m\":").append(df.format(magenta)).append(",");
		s.append("\"y\":").append(df.format(yellow)).append(",");
		s.append("\"k\":").append(df.format(black)).append(",");
		s.append("\"hu\":").append(df.format(hu)).append(",");
		s.append("\"wh\":").append(df.format(wh)).append(",");
		s.append("\"bl\":").append(df.format(bl)).append("}");
		return s.toString();
	}
	
	/**
	 * Returns TRUE if the RGB values are same.
	 */
	public boolean equals(Object o) {
		try {
			Color c = (Color)o;
			return (this.rgb == c.rgb) ? true : false;
		} catch (Exception ignored) {}
		return false;
	}
}

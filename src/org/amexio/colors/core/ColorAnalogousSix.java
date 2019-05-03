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

/**
 * ANALOGOUS COLORS
 * <p>
 * Analogous harmonies are created by selecting the colors directly 
 * adjacent to a chosen color. Frequently found in web design, analogous 
 * schemes, when paired with a complementary color for contrast, can 
 * offer great versatility.
 * 
 * Reference: https://htmlcolorcodes.com/color-picker/
 * 
 * @author Araf Karsh Hamid
 * @version 2.0
 * @date April 26, 2019
 */
public class ColorAnalogousSix extends AbstractColorMaker { 
	
	private final Color color2;
	private final Color color3;
	private final Color color4;
	private final Color color5;
	private final Color color6;
	
	public ColorAnalogousSix(Color _color) {
		super(_color);
		color2 = super.makeColor(30);
		color3 = super.makeColor(60);
		color4 = super.makeColor(90);
		color5 = super.makeColor(120);
		color6 = super.makeColor(150);
	}
	
	/**
	 * Returns the Adjacent Color (30 degree Right of the Primary Color) 
	 * in the Color Wheel
	 * 
	 * @return Color
	 */
	public Color getColor2() {
		return color2;
	}
	
	/**
	 * Returns the Adjacent Color (60 degree Right of the Primary Color) 
	 * in the Color Wheel
	 * 
	 * @return Color
	 */
	public Color getColor3() {
		return color3;
	}
	
	/**
	 * Returns the Adjacent Color (90 degree Right of the Primary Color) 
	 * in the Color Wheel
	 * 
	 * @return Color
	 */
	public Color getColor4() {
		return color4;
	}
	
	/**
	 * Returns the Adjacent Color (120 degree Right of the Primary Color) 
	 * in the Color Wheel
	 * 
	 * @return Color
	 */
	public Color getColor5() {
		return color5;
	}
	
	/**
	 * Returns the Adjacent Color (150 degree Right of the Primary Color) 
	 * in the Color Wheel
	 * 
	 * @return Color
	 */
	public Color getColor6() {
		return color6;
	}
}

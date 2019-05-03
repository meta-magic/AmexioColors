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
 * Triadic Colors
 * <p>
 * Triadic harmonies consist of three colors equidistant from one another on 
 * the color wheel. Like complementary colors, triadic schemes tend to be very 
 * bright with a high contrast and work best when one color dominates.
 * 
 * Reference: https://htmlcolorcodes.com/color-picker/
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date April 26, 2019
 */
public class ColorTriadic extends AbstractColorMaker {
	
	private final Color colorLeft;
	private final Color colorRight;
	
	public ColorTriadic(Color _color) {
		super(_color);
		colorLeft = super.makeColor(-120);
		colorRight = super.makeColor(120);
	}
	
	/**
	 * Returns the Adjacent Color (120 degree Left of the Primary Color) 
	 * in the Color Wheel
	 * 
	 * @return Color
	 */
	public Color getColorLeft() {
		return colorLeft;
	}
	
	/**
	 * Returns the Adjacent Color (120 degree Right of the Primary Color) 
	 * in the Color Wheel
	 * 
	 * @return Color
	 */
	public Color getColorRight() {
		return colorRight;
	}

}

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
 * Tetradic Colors
 * <p>
 * Tetradic color harmonies are formed by two sets of complementary colors 
 * 60 degrees apart on the color wheel. Tetradic schemes are an excellent 
 * starting point for creating color palettes; fine tune them using color 
 * shades, tints and tones.
 *  
 *  Reference: https://htmlcolorcodes.com/color-picker/
 * 
 * @author Araf Karsh Hamid
 * @version 2.0
 * @date April 26, 2019
 */

public class ColorTetradic  extends AbstractColorMaker {
	
	private final ColorDuo colorDuoLeft;
	private final ColorDuo colorDuoRight;

	
	
	public ColorTetradic(Color _color) {
		super(_color);
		colorDuoLeft = new ColorDuo(_color);
		Color rightColor = super.makeColor(60);
		colorDuoRight = new ColorDuo(rightColor);
	}
	
	/**
	 * Returns the Primary ColorDuo Colors 
	 * 
	 * @return ColorDuo
	 */
	public ColorDuo getColorDuoLeft() {
		return colorDuoLeft;
	}
	
	/**
	 * Returns the Adjacent Color (60 degree Right of the Primary Color) 
	 * in the Color Wheel
	 * 
	 * @return ColorDuo
	 */
	public ColorDuo getColorDuoRight() {
		return colorDuoRight;
	}

}

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

import org.amexio.colors.web.Colors;

/**
 * Abstract Color Maker
 * 
 * @author Araf Karsh Hamid
 * @version 2.0
 * @date April 26, 2019
 */
public abstract class AbstractColorMaker {
	
	private final Color primaryColor;
	
	/**
	 * Primary Color to start
	 * 
	 * @param _color
	 */
	public AbstractColorMaker(Color _color) {
		primaryColor = (_color == null) ? Colors.GRAY.BLACK : _color;
	}
	
	/**
	 * Returns the color based on the degree of deviation
	 * 
	 * @param color
	 * @param _degree
	 * @return Color
	 */
	public final Color makeColor(int _degree) {
		int degree = (_degree > -1) ? _degree : 0;
		float hue = primaryColor.hue() + degree;
		if (hue > 360) {
			hue = hue - 360;
		} else if ( hue < 0) {
			hue = 360 - hue;
		}
		return Color.hsl2rgb(hue, primaryColor.saturation(), primaryColor.lightness(), (float) primaryColor.alpha());
	}

	/**
	 * Returns the Input Color / Primary Color
	 * 
	 * @return Color
	 */
	public Color getPrimaryColor() {
		return primaryColor;
	}

}

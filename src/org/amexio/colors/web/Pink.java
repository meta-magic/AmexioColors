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
package org.amexio.colors.web;

import java.util.ArrayList;

import org.amexio.colors.core.Color;

/**
 * Pink Color Variables
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 24, 2018
 */

public final class Pink {
	
	public static final Color PINK = new Color(255,192,203,"Pink");
	public static final Color LIGHTPINK = new Color(255,182,193,"LightPink");
	public static final Color HOTPINK = new Color(255,105,180,"HotPink");
	public static final Color DEEPPINK = new Color(255,20,147,"DeepPink");
	public static final Color MEDIUMVIOLETRED = new Color(199,21,133,"MediumVioletRed");
	public static final Color PALEVIOLETRED = new Color(219,112,147,"PaleVioletRed");
	
	public static final ArrayList<Color> COLORS = new ArrayList<Color>();
	
	public static ArrayList<Color> build() {
		if(COLORS.size() == 0) {
			COLORS.add(PINK);
			COLORS.add(LIGHTPINK);
			COLORS.add(HOTPINK);
			COLORS.add(DEEPPINK);
			COLORS.add(MEDIUMVIOLETRED);
			COLORS.add(PALEVIOLETRED);
		}
		return COLORS;
	}
	
	public static void printStats() {
		System.out.println("Total Color Variants for Pink = "+COLORS.size());
	}

}

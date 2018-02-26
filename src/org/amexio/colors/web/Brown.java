/**
 * Copyright (c) 2018 Araf Karsh Hamid

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
 * Brown Color Variants
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 24, 2018
 */
public final class Brown {
	
	public static final Color CORNSILK = new Color(255,248,220,"CornSilk");
	public static final Color BLANCHEDALMOND = new Color(255,235,205,"BlancedAlmond");
	public static final Color BISQUE = new Color(255,228,196,"Bisque");
	public static final Color NAVAJOWHITE = new Color(255,222,173,"NavajoWhite");
	public static final Color WHEAT = new Color(245,222,179,"Wheat");
	public static final Color BURLYWOOD = new Color(222,184,135,"BurlyWood");
	public static final Color TAN = new Color(210,180,140,"Tan");
	public static final Color ROSYBROWN = new Color(188,143,143,"RosyBrown");
	public static final Color SANDYBROWN = new Color(244,164,96,"SandyBrown");
	public static final Color GOLDENROD = new Color(218,165,32,"GoldenRod");
	public static final Color DARKGOLDENROD = new Color(184,134,11,"DarkGoldenRod");
	public static final Color PERU = new Color(205,133,63,"Peru");
	public static final Color CHOCOLATE = new Color(210,105,30,"Chocolate");
	public static final Color SADDLEBROWN = new Color(139,69,19,"SaddleBrown");
	public static final Color SIENNA = new Color(160,82,45,"Sienna");
	public static final Color BROWN = new Color(165,42,42,"Brown");
	public static final Color MAROON = new Color(128,0,0,"Maroon");

	public static final ArrayList<Color> COLORS = new ArrayList<Color>();
	
	public static ArrayList<Color> build() {
		if(COLORS.size() == 0) {
			
			COLORS.add(CORNSILK);
			COLORS.add(BLANCHEDALMOND);
			COLORS.add(BISQUE);
			COLORS.add(NAVAJOWHITE);
			COLORS.add(WHEAT);
			COLORS.add(BURLYWOOD);
			COLORS.add(TAN);
			COLORS.add(ROSYBROWN);
			COLORS.add(SANDYBROWN);
			COLORS.add(GOLDENROD);
			COLORS.add(DARKGOLDENROD);
			COLORS.add(PERU);
			COLORS.add(CHOCOLATE);
			COLORS.add(SADDLEBROWN);
			COLORS.add(SIENNA);
			COLORS.add(BROWN);
			COLORS.add(MAROON);
		}
		return COLORS;
	}
	
	public static void printStats() {
		System.out.println("Total Color Variants for Brown = "+COLORS.size());
	}
}

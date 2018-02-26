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
 * Purple Color Variants
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 24, 2018
 */
public final class Purple {

	public static final Color LAVENDER = new Color(230,230,250,"Lavender");
	public static final Color THISTLE = new Color(216,191,216,"Thistle");
	public static final Color PLUM = new Color(221,160,221,"Plum");
	public static final Color VIOLET = new Color(238,130,238,"Violet");
	public static final Color ORCHID = new Color(218,112,214,"Orchid");
	public static final Color FUCHSIA = new Color(255,0,255,"Fuchsia");
	public static final Color MAGENTA = new Color(255,0,255,"Magenta");
	public static final Color MEDIUMORCHID = new Color(186,85,211,"MediumOrchid");
	public static final Color MEDIUMPURPLE = new Color(147,112,219,"MediumPurple");
	public static final Color REBECCAPURPLE = new Color(102,51,153,"RebeccaPurple");
	public static final Color BLUEVIOLET = new Color(138,43,226,"BlueViolet");
	public static final Color DARKVIOLET = new Color(148,0,211,"DarkViolet");
	public static final Color DARKORCHID = new Color(153,50,204,"DarkOrchid");
	public static final Color DARKMAGENTA = new Color(139,0,139,"DarkMagenta");
	public static final Color PURPLE = new Color(128,0,128,"Purple");
	public static final Color INDIGO = new Color(75,0,130,"Indigo");
	public static final Color SLATEBLUE = new Color(106,90,205,"SlateBlue");
	public static final Color DARKSLATEBLUE = new Color(72,61,139,"DarkSlateBlue");
	public static final Color MEDIUMSLATEBLUE = new Color(123,104,238,"MediumSlateBlue");
	
	
	public static final ArrayList<Color> COLORS = new ArrayList<Color>();
	
	/**
	 * Builds the Color Variants Array List
	 * 
	 * @return
	 */
	public static ArrayList<Color> build() {
		if(COLORS.size() == 0) {
			COLORS.add(LAVENDER);
			COLORS.add(THISTLE);
			COLORS.add(PLUM);
			COLORS.add(VIOLET);
			COLORS.add(ORCHID);
			COLORS.add(FUCHSIA);
			COLORS.add(MAGENTA);
			COLORS.add(MEDIUMORCHID);
			COLORS.add(MEDIUMPURPLE);
			COLORS.add(REBECCAPURPLE);
			COLORS.add(BLUEVIOLET);
			COLORS.add(DARKVIOLET);
			COLORS.add(DARKORCHID);
			COLORS.add(DARKMAGENTA);
			COLORS.add(PURPLE);
			COLORS.add(INDIGO);
			COLORS.add(SLATEBLUE);
			COLORS.add(DARKSLATEBLUE);
			COLORS.add(MEDIUMSLATEBLUE);
		}
		return COLORS;
	}
	
	public static void printStats() {
		System.out.println("Total Color Variants for Purple = "+COLORS.size());
	}
}

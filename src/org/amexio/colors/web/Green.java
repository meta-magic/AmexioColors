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
 * Green Color Variants
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 24, 2018
 */
public final class Green {

	public static final Color GREENYELLOW = new Color(173,255,47,"GreenYellow");
	public static final Color CHARTREUSE = new Color(127,255,0,"Chartreuse");
	public static final Color LAWNGREEN = new Color(124,252,0,"LawnGreen");
	public static final Color LIME = new Color(0,255,0,"Lime");
	public static final Color LIMEGREEN = new Color(50,205,50,"LimeGreen");
	public static final Color PALEGREEN = new Color(152,251,152,"PaleGreen");
	public static final Color LIGHTGREEN = new Color(144,238,144,"LightGreen");
	public static final Color MEDIUMSPRINGGREEN = new Color(0,250,154,"MediumSpringGreen");
	public static final Color SPRINGGREEN = new Color(0,255,127,"SpringGreen");
	public static final Color MEDIUMSEAGREEN = new Color(60,179,113,"MediumSeaGreen");
	public static final Color SEAGREEN = new Color(46,139,87,"SeaGreen");
	public static final Color FORESTGREEN = new Color(34,139,34,"ForestGreen");
	public static final Color GREEN = new Color(0,128,0,"Green");
	public static final Color DARKGREEN = new Color(0,100,0,"DarkGreen");
	public static final Color YELLOWGREEN = new Color(154,205,50,"YellowGreen");
	public static final Color OLIVEDRAB = new Color(107,142,35,"OliveDrab");
	public static final Color OLIVE = new Color(128,128,0,"Olive");
	public static final Color DARKOLIVEGREEN = new Color(85,107,47,"DarkOliveGreen");
	public static final Color MEDIUMAQUAMARINE = new Color(102,205,170,"MediumAquaMarine");
	public static final Color DARKSEAGREEN = new Color(143,188,139,"DarkSeaGreen");
	public static final Color LIGHTSEAGREEN = new Color(32,178,170,"LghtSeaGreen");
	public static final Color DARKCYAN = new Color(0,139,139,"DarkCyan");
	public static final Color TEAL = new Color(0,128,128,"Teal");
	
	public static final ArrayList<Color> COLORS = new ArrayList<Color>();
	
	/**
	 * Builds the Color Variants Array List
	 * 
	 * @return
	 */
	public static ArrayList<Color> build() {
		if(COLORS.size() == 0) {
			COLORS.add(GREENYELLOW);
			COLORS.add(CHARTREUSE);
			COLORS.add(LAWNGREEN);
			COLORS.add(LIME);
			COLORS.add(LIMEGREEN);
			COLORS.add(PALEGREEN);
			COLORS.add(LIGHTGREEN);
			COLORS.add(MEDIUMSPRINGGREEN);
			COLORS.add(SPRINGGREEN);
			COLORS.add(MEDIUMSEAGREEN);
			COLORS.add(SEAGREEN);
			COLORS.add(FORESTGREEN);
			COLORS.add(GREEN);
			COLORS.add(DARKGREEN);
			COLORS.add(YELLOWGREEN);
			COLORS.add(OLIVEDRAB);
			COLORS.add(OLIVE);
			COLORS.add(DARKOLIVEGREEN);
			COLORS.add(MEDIUMAQUAMARINE);	
			COLORS.add(DARKSEAGREEN);
			COLORS.add(LIGHTSEAGREEN);
			COLORS.add(DARKCYAN);
			COLORS.add(TEAL);
		}
		return COLORS;
	}
	
	public static void printStats() {
		System.out.println("Total Color Variants for Green = "+COLORS.size());
	}
}

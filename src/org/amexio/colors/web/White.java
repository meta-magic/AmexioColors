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
 * White Color Variants
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 24, 2018
 */
public final class White {

	public static final Color WHITE = new Color(255,255,255,"White");
	public static final Color SNOW = new Color(255,250,250,"Snow");
	public static final Color HONEYDEW = new Color(240,255,240,"HoneyDew");
	public static final Color MINTCREAM = new Color(245,255,250,"MintCream");
	public static final Color AZURE = new Color(240,255,255,"Azure");
	public static final Color ALICEBLUE = new Color(240,248,255,"AliceBlue");
	public static final Color GHOSTWHITE = new Color(248,248,255,"GhostWhite");
	public static final Color WHITESMOKE = new Color(245,245,245,"WhiteSmoke");
	public static final Color SEASHELL = new Color(255,245,238,"SeaShell");
	public static final Color BEIGE = new Color(245,245,220,"Beige");
	public static final Color OLDLACE = new Color(253,245,230, "OldLace");
	public static final Color FLORALWHITE = new Color(255,250,240,"FloralWhite");
	public static final Color IVORY = new Color(255,255,240,"Ivory");
	public static final Color ANTIQUEWHITE = new Color(250,235,215,"AntiqueWhite");
	public static final Color LINEN = new Color(250,240,230,"Linen");
	public static final Color LAVENDERBLUSH = new Color(255,240,245,"LavenderBlush");
	public static final Color MISTYROSE = new Color(255,228,225,"MistyRose");
	
	public static final ArrayList<Color> COLORS = new ArrayList<Color>();
	
	/**
	 * Builds the Color Variants Array List
	 * 
	 * @return
	 */
	public static ArrayList<Color> build() {
		if(COLORS.size() == 0) {
			COLORS.add(WHITE);
			COLORS.add(SNOW);
			COLORS.add(HONEYDEW);
			COLORS.add(MINTCREAM);
			COLORS.add(AZURE);
			COLORS.add(ALICEBLUE);
			COLORS.add(GHOSTWHITE);
			COLORS.add(WHITESMOKE);
			COLORS.add(SEASHELL);
			COLORS.add(BEIGE);
			COLORS.add(OLDLACE);
			COLORS.add(FLORALWHITE);
			COLORS.add(IVORY);
			COLORS.add(ANTIQUEWHITE);
			COLORS.add(LINEN);
			COLORS.add(LAVENDERBLUSH);
			COLORS.add(MISTYROSE);
		}
		return COLORS;
	}
	
	public static void printStats() {
		System.out.println("Total Color Variants for White = "+COLORS.size());
	}
	
}

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
 * Gray Color Variants
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 24, 2018
 */
public final class Gray {

	public static final Color GAINSBORO = new Color(220,220,220,"GainsBoro");
	public static final Color LIGHTGRAY = new Color(211,211,211,"LightGray");
	public static final Color SILVER = new Color(192,192,192,"Silver");
	public static final Color DARKGRAY = new Color(169,169,169,"DarkGray");
	public static final Color GRAY = new Color(128,128,128,"Gray");
	public static final Color DIMGRAY = new Color(105,105,105,"DimGray");
	public static final Color LIGHTSLATEGRAY = new Color(119,136,153,"LightSlateGray");
	public static final Color SLATEGRAY = new Color(112,128,144,"SlateGray");
	public static final Color DARKSLATEGRAY = new Color(47,79,79,"DarkSlateGray");
	public static final Color BLACK = new Color(0,0,0,"Black");
	
	public static final ArrayList<Color> COLORS = new ArrayList<Color>();
	
	/**
	 * Builds the Color Variants Array List
	 * 
	 * @return
	 */
	public static ArrayList<Color> build() {
		if(COLORS.size() == 0) {
			COLORS.add(GAINSBORO);
			COLORS.add(LIGHTGRAY);
			COLORS.add(SILVER);
			COLORS.add(DARKGRAY);
			COLORS.add(GRAY);
			COLORS.add(DIMGRAY);
			COLORS.add(LIGHTSLATEGRAY);
			COLORS.add(SLATEGRAY);
			COLORS.add(DARKSLATEGRAY);
			COLORS.add(BLACK);
		}
		return COLORS;
	}
	
	public static void printStats() {
		System.out.println("Total Color Variants for Gray = "+COLORS.size());
	}
}

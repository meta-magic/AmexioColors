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
 * Yellow Color Variants
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 24, 2018
 */
public final class Yellow {

	public static final Color GOLD = new Color(255,215,0,"Gold");
	public static final Color YELLOW = new Color(255,255,0,"Yellow");
	public static final Color LIGHTYELLOW = new Color(255,255,224,"LightYellow");
	public static final Color LEMONCHIFFON = new Color(255,250,205,"LemonChiffon");
	public static final Color LIGHTGOLDENRODYELLOW = new Color(250,250,210,"LightGoldenRodYellow");
	public static final Color PAPAYAWHIP = new Color(255,239,213,"PapayaWhip");
	public static final Color MOCCASIN = new Color(255,228,181,"Moccasin");
	public static final Color PEACHPUFF = new Color(255,218,185,"PeachPuff");
	public static final Color PALEGOLDENROD = new Color(238,232,170,"PaleGoldenRod");
	public static final Color KHAKI = new Color(240,230,140,"Khaki");
	public static final Color DARKKHAKI = new Color(189,183,107,"DarkKhaki");
	
	public static final ArrayList<Color> COLORS = new ArrayList<Color>();
	
	/**
	 * Builds the Color Variants Array List
	 * 
	 * @return
	 */
	public static ArrayList<Color> build() {
		if(COLORS.size() == 0) {
			COLORS.add(GOLD);
			COLORS.add(YELLOW);
			COLORS.add(LIGHTYELLOW);
			COLORS.add(LEMONCHIFFON);
			COLORS.add(LIGHTGOLDENRODYELLOW);
			COLORS.add(PAPAYAWHIP);
			COLORS.add(MOCCASIN);
			COLORS.add(PEACHPUFF);
			COLORS.add(PALEGOLDENROD);
			COLORS.add(KHAKI);
			COLORS.add(DARKKHAKI);
		}
		return COLORS;
	}
	
	public static void printStats() {
		System.out.println("Total Color Variants for Yellow = "+COLORS.size());
	}
	
}

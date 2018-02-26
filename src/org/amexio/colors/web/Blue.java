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
 * Blue Color Variants
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 24, 2018
 */
public final class Blue {

	public static final Color AQUA = new Color(0,255,255,"Aqua");
	public static final Color CYAN = new Color(0,255,255,"Cyan");
	public static final Color LIGHTCYAN = new Color(224,255,255,"LightCyan");
	public static final Color PALETURQUOISE = new Color(175,238,238,"PaleTurquoise");
	public static final Color AQUAMARINE = new Color(127,255,212,"AquaMarine");
	public static final Color TURQUOISE = new Color(64,224,208,"Turquoise");
	public static final Color MEDIUMTURQUOISE = new Color(72,209,204,"MediumTurquoise");
	public static final Color DARKTURQUOISE = new Color(0,206,209,"DarkTurquoise");
	public static final Color CADETBLUE	= new Color(95,158,160,"CadetBlue");
	public static final Color STEELBLUE = new Color(70,130,180,"SteelBlue");
	public static final Color LIGHTSTEELBLUE = new Color(176,196,222,"LightSteelBlue");
	public static final Color POWDERBLUE = new Color(176,224,230,"PowderBlue");
	public static final Color LIGHTBLUE = new Color(173,216,230,"LightBlue");
	public static final Color SKYBLUE = new Color(135,206,235,"SkyBlue");
	public static final Color LIGHTSKYBLUE = new Color(135,206,250,"LightSkyBlue");
	public static final Color DEEPSKYBLUE = new Color(0,191,255,"DeepSkyBlue");
	public static final Color DODGERBLUE = new Color(30,144,255,"DodgerBlue");
	public static final Color CORNFLOWERBLUE = new Color(100,149,237,"CornFlowerBlue");
	public static final Color MEDIUMSLATEBLUE = new Color(123,104,238,"MediumSlateBlue");
	public static final Color ROYALBLUE = new Color(65,105,225,"RoyalBlue");
	public static final Color BLUE = new Color(0,0,255,"Blue");
	public static final Color MEDIUMBLUE = new Color(0,0,205,"MediumBlue");
	public static final Color DARKBLUE = new Color(0,0,139,"DarkBlue");
	public static final Color NAVY = new Color(0,0,128,"Navy");
	public static final Color MIDNIGHTBLUE = new Color(25,25,112,"MidNightBlue");
	
	public static final ArrayList<Color> COLORS = new ArrayList<Color>();
	
	/**
	 * Builds the Blue Color Variants Array List.
	 * 
	 * @return
	 */
	
	public static ArrayList<Color> build() {
		if(COLORS.size() == 0) {
			COLORS.add(AQUA);
			COLORS.add(CYAN);
			COLORS.add(LIGHTCYAN);
			COLORS.add(PALETURQUOISE);
			COLORS.add(AQUAMARINE);
			COLORS.add(TURQUOISE);
			COLORS.add(MEDIUMTURQUOISE);
			COLORS.add(DARKTURQUOISE);
			COLORS.add(CADETBLUE);
			COLORS.add(STEELBLUE);
			COLORS.add(LIGHTSTEELBLUE);
			COLORS.add(POWDERBLUE);
			COLORS.add(LIGHTBLUE);
			COLORS.add(SKYBLUE);
			COLORS.add(LIGHTSKYBLUE);
			COLORS.add(DEEPSKYBLUE);
			COLORS.add(DODGERBLUE);
			COLORS.add(CORNFLOWERBLUE);
			COLORS.add(MEDIUMSLATEBLUE);
			COLORS.add(ROYALBLUE);
			COLORS.add(BLUE);
			COLORS.add(MEDIUMBLUE);
			COLORS.add(DARKBLUE);
			COLORS.add(NAVY);
			COLORS.add(MIDNIGHTBLUE);
		}
		return COLORS;
	}
	
	public static void printStats() {
		System.out.println("Total Color Variants for Blue = "+COLORS.size());
	}
}

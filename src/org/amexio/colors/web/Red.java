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
 * Red Color Variants
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 24, 2018
 */

public final class Red {
	
	public static final Color INDIANRED = new Color(205,92,92, "IndianRed");
	public static final Color LIGHTCORAL = new Color(240,128,128,"LightCoral");
	public static final Color SALMON	= new Color(250,128,114,"Salmon");
	public static final Color DARKSALMON	= new Color(233,150,122,"DarkSalmon");
	public static final Color LIGHTSALMON = new Color(255,160,122,"LightSalmon");
	public static final Color CRIMSON = new Color(220,20,60, "Crimson");
	public static final Color RED = new Color(255,0,0, "Red");
	public static final Color FIREBRICK = new Color(178,34,34, "FireBrick");
	public static final Color DARKRED = new Color(139,0,0, "DarkRed");

	public static final ArrayList<Color> COLORS = new ArrayList<Color>();
	
	/**
	 * Builds the Color Variants Array List
	 * 
	 * @return
	 */
	public static ArrayList<Color> build() {
		if(COLORS.size() == 0) {
			COLORS.add(INDIANRED);
			COLORS.add(LIGHTCORAL);
			COLORS.add(SALMON);
			COLORS.add(DARKSALMON);
			COLORS.add(LIGHTSALMON);
			COLORS.add(CRIMSON);
			COLORS.add(RED);
			COLORS.add(FIREBRICK);
			COLORS.add(DARKRED);
		}
		return COLORS;
	}
	
	public static void printStats() {
		System.out.println("Total Color Variants for Red = "+COLORS.size());
	}
}

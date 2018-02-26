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
import org.amexio.colors.web.*;

/**
 * Color Constants - 140 HTML Web Colors
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 23, 2018
 */
public final class Colors {
	
	public static final ArrayList<Color> ColorList = new ArrayList<Color>();
	
	// Primary Colors
	public static final Color R 			= Red.RED;
	public static final Color G 			= Green.GREEN;
	public static final Color B 			= Blue.BLUE;

	// Color Variants with CSS Compatible Names
	public static Red RED;
	public static Pink PINK;
	public static Orange ORANGE;
	public static Yellow YELLOW;
	public static Purple PURPLE;
	public static Green GREEN;
	public static Blue BLUE;
	public static Brown BROWN;
	public static White WHITE;
	public static Gray GRAY;
	
	public static ArrayList<Color> build() {
		if(ColorList.size() == 0) {
			ColorList.addAll(Red.build());
			ColorList.addAll(Pink.build());
			ColorList.addAll(Orange.build());
			ColorList.addAll(Yellow.build());
			ColorList.addAll(Purple.build());
			ColorList.addAll(Green.build());
			ColorList.addAll(Blue.build());
			ColorList.addAll(Brown.build());
			ColorList.addAll(White.build());
			ColorList.addAll(Gray.build());
		}
		return ColorList;
	}
	
	public static void printRows() {
		if(ColorList.size() == 0) {
			build();
		}
		for(Color c: ColorList) {
			System.out.println(c.printRow());
		}
	}
	
	public static void printJSONs() {
		if(ColorList.size() == 0) {
			build();
		}
		for(Color c: ColorList) {
			System.out.println(c.printJSON());
		}
	}
	
	public static void printNormalizedValues() {
		if(ColorList.size() == 0) {
			build();
		}
		for(Color c: ColorList) {
			System.out.println(c.printNormalizedValues());
		}
	}

}

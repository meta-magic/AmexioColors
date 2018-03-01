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
package org.amexio.examples.colors;

import org.amexio.colors.core.Color;
import org.amexio.colors.web.Colors;

/**
 * List all All the Color Codes
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 24, 2018
 */
public class ListColorCodes {

	public static void main(String[] args) {
		
		Colors.build();
		// Colors.printRows();
		// Colors.printJSONs();
		Colors.printNormalizedValues();

		// System.out.println(new Color(0,0,0,0.87f).printRow());
		// System.out.println(Color.hsl2rgb(6, 56, 10,0).printRow());
		// System.out.println(new Color(40,14,11).foregroundColor().printRow());
		// System.out.println(new Color(222,145,82).printJSON());
		// System.out.println(new Color(222,145,82).printNormalizedValues());
	}

}

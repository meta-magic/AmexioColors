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
package org.amexio.colors.core;

/**
 * Color Set Algo Constant
 * 
 * @author Araf Karsh Hamid
 * @version 2.0
 * @date April 27, 2019
 */
public class ColorAlgoConstants {
	
	/**
	 * Color Algorithm IDs
	 */
	public static final int COLOR_DEFAULT				= 0;
	public static final int COLOR_ANALOGOUS 			= 1;
	public static final int COLOR_ANALOGOUS_SIX			= 2;
	public static final int COLOR_ANALOGOUS_DUO		 	= 3;
	public static final int COLOR_NEUTRAL				= 4;
	public static final int COLOR_DUO					= 5;
	public static final int COLOR_TRIADIC				= 6;
	public static final int COLOR_TRIADIC_SIX			= 7;
	public static final int COLOR_TETRADIC				= 8;
	
	/**
	 * Color Algorithm Names
	 */
	public static final String[] ALGO_NAMES				= { "Classic Dual Color", "Color Analogous", "Color Analogous Six",
															"Color Analogous Duo", "Color Neutral", "Color Duo",
															"Color Triadic", "Color Triadic Six", "Color Tetradic" 
														  };

}

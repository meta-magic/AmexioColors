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
package org.amexio.colors.examples;

import org.amexio.colors.core.Color;
import org.amexio.colors.web.Colors;

/**
 * Colors Examples
 * 
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date February 22, 2018
 */
public class RunTests {

	public static void main(String[] args) {
		// String hex = "FF5733";
	
		// example1(hex);
		// rgb();	
		// print(new Color(24,98,118)); // 192,66,27 - HSL
		// print(new Color("008080")); // 180,100,25 - HSL
		
		// Testing Hex Value
		
		System.out.println("Testing the Hex Value in Color Object");
		foreground(new Color(40,14,11)); // #280e0b - HSL = 6,56,10 | RGB = 40,14,11
		foreground(new Color("#280e0b")); // #280e0b - HSL = 6,56,10 | RGB = 40,14,11
		
		/**
		System.out.println("Test=1 | Foreground Color ..");
		foreground(new Color(40,14,11)); // #280e0b - HSL = 6,56,10

		System.out.println("\nTest=2 | Foreground Color ....");
		foreground(new Color(249,231,159)); // #F9E79F  - 48, 89%, 80%

		System.out.println("\nTest=3 | Foreground Color......");
		foreground(new Color(3,8,43)); // #03082b  - 232, 88%, 9%
		
		System.out.println("\nTest=4 | Darker Functions.... ");
		Color c = new Color(122,40,31);
		print(c);
		print(c.darker(20));
		
		System.out.println("\nTest=5 | Lighter Functions.... ");
		c = new Color(122,40,31);
		print(c);
		print(c.lighter(50));
		
		*/
		
		// Color c2 = Colors.RED.DARKRED;
		
		
		
		// print(Color.hsl2rgb(6, 10, 95));
		// print(new Color(255,230,227));
		// print(Color.hsl2rgb(6, 100, 95));
		// print(new Color(40,14,11));				// HSL = 6, 58, 10
		// print(Color.hsl2rgb(6, 58, 90,1));			// RGB = 244, 218, 215
		
		//print(Color.hsl2rgb(193, 67, 28));			// RGB = 24, 98, 118
	}
	
	public static void foreground(Color color) {
		print(color);
		print(color.foregroundColor());
	}
	
	public static void hslConversions() {
		System.out.println("HSL 2 RGB Conversions\n");
		
		System.out.println("HSL 2 RGB HSL = 0,0,40 expected RGB=102,102,102");
		print(Color.hsl2rgb(0, 0, 40,0));
		System.out.println("HSL 2 RGB HSL = 192,66,27 expected RGB=24,98,118");
		print(Color.hsl2rgb(192, 66, 27,0));
		System.out.println("HSL 2 RGB HSL = 180,100,25 expected RGB=0,128,128");
		print(Color.hsl2rgb(180, 100, 25,0));
	}
	
	public static void example1(String _hexValue) {
		Color c = new Color(_hexValue);
		System.out.println("Int-Value="+c.rgb()+" |R="+c.red()
					+" |G="+c.green()+" |B="+c.blue());
		System.out.println("Color-HexValue="+c.hex());	
	}
	
	public static void rgb() {
		
		print(Colors.R);
		print(Colors.G);
		print(Colors.B);
		
	}
	
	public static void print(Color c) {
		// System.out.println("Int="+c.rgb()+"\t Hex="+c.hex()+"\t |R="+c.red()+" G="+c.green()+" |B="+c.blue());
		// System.out.println("Int="+c.rgb()+"\t Hex="+c.hex()+"\t |H="+c.hue()+" S="+c.saturation()+" |L="+c.lightness());
		System.out.println(c.printRow());
	}
	
	public static void test4() {
		System.out.println("Max Lum="+Color.maxLum(25)+" For Sat=25");
		System.out.println("Max Lum="+Color.maxLum(50)+" For Sat=50");
		System.out.println("Max Lum="+Color.maxLum(75)+" For Sat=75");
		System.out.println("Max Lum="+Color.maxLum(100)+" For Sat=100");

		System.out.println("Max Sat="+Color.maxSaturation(25)+" For Lum=25");
		System.out.println("Max Sat="+Color.maxSaturation(50)+" For Lum=50");
		System.out.println("Max Sat="+Color.maxSaturation(65)+" For Lum=65");
		System.out.println("Max Sat="+Color.maxSaturation(75)+" For Lum=75");
		System.out.println("Max Sat="+Color.maxSaturation(82)+" For Lum=82");
		System.out.println("Max Sat="+Color.maxSaturation(91)+" For Lum=91");
		System.out.println("Max Sat="+Color.maxSaturation(100)+" For Lum=100");
	}
	
}

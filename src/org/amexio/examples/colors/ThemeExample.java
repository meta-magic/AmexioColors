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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.amexio.colors.core.Color;
import org.amexio.colors.io.ThemeConfig;
import org.amexio.colors.themes.AmexioThemeBuilder;

public class ThemeExample {
	
	public static void main(String[] args) throws IOException {
		
		
		// Theme Light Blue
		AmexioThemeBuilder builder = new AmexioThemeBuilder(
		 		new ThemeConfig(0, "no-file", "#4ddfe8", "#81D4F9")
		 				);
		// AmexioThemeBuilder builder = new AmexioThemeBuilder();
		System.out.println(builder.printSCSS());
		
		// speedTest(10000);
		
	}
	
	public static void speedTest(int counter) {
		System.out.println("Theme File Generation Started! ...");
		long start = System.currentTimeMillis();
		for(int x=0; x<counter; x++) {
			generateTheme();
		}
		long stop = System.currentTimeMillis();
		long time = stop - start;
		double timeSeconds = (double) time / 1000;
		double oneTheme = (double) time / counter;
		System.out.println("Time Taken   = "+time+" milli seconds");
		System.out.println("Time Taken   = "+timeSeconds+" seconds");
		System.out.println("Total Themes = "+counter);
		System.out.println("For 1 Theme  = "+oneTheme+" milli seconds");
		System.out.println("Theme File Generation Completed.");
	}
	
	public static void generateTheme() {
		String file = "/Users/arafkarsh/AmexioColors/theme-init.scss";
		PrintWriter out = null;
		try {
			out = new PrintWriter(
								new BufferedWriter(new FileWriter(file)));
			AmexioThemeBuilder builder = new AmexioThemeBuilder(new ThemeConfig());
			String data = builder.printSCSS();
			out.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(out != null) {
				out.close();
			}
		}
	}

}

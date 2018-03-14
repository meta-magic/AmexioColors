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
package org.amexio.colors.io;

import java.util.ArrayList;

/**
 * Theme Selector JSON Builder
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date
 */
public class ThemeSelectorData {
	
	private static final String NL = "";
	
	private final ArrayList<ThemeConfig> themes;
	private final int themesPerRow;
	
	/**
	 * Default Themes Per Row = 3
	 * 
	 * @param _themes
	 */
	public ThemeSelectorData(ArrayList<ThemeConfig> _themes) {
		this(_themes, 3);
	}
	
	/**
	 * 
	 * @param _themes
	 * @param _themesPerRow
	 */
	public ThemeSelectorData(ArrayList<ThemeConfig> _themes, int _themesPerRow) {
		themes = (_themes != null) ? _themes : new ArrayList<ThemeConfig>();
		themes.sort(new ThemeConfig());
		themesPerRow = (_themesPerRow < 1) ? 1 : _themesPerRow;
	}
	
	/**
	 * Returns the Themes Config List
	 * @return
	 */
	public ArrayList<ThemeConfig> themes() {
		return themes;
	}

	/**
	 * Returns the JSON String
	 * 
	 * @return
	 */
	public String buildJSON() {
		StringBuilder sb = new StringBuilder();
		sb.append("[").append(NL);
		int cellCount = 0;
		int rowCount = 0;
		int prevRowCount = 1;
		for(ThemeConfig theme : themes) {
			cellCount++;
			// Build the Theme Rows
			if(cellCount == 1) {
				rowCount++;
				if(rowCount > prevRowCount) {
					sb.append(",").append(NL);
				}
				sb.append("[").append(NL);
			}
			if(cellCount > 1 && cellCount <= themesPerRow) {
				sb.append(",").append(NL);
			}
			sb.append(theme.toJSON());
			if(cellCount == themesPerRow) {
				sb.append(NL).append("]");
				cellCount = 0;
				prevRowCount = rowCount;
			}
		}
		if(cellCount < themesPerRow) {
			sb.append(NL).append("]");
		}
		sb.append(NL).append("]").append(NL);
		return sb.toString();
	}
	
	public String buildAPIJSON() {
		StringBuilder sb = new StringBuilder();
		sb.append("{").append(NL);
		sb.append("\"properties\": [").append(NL);
		boolean first = true;
		for(ThemeConfig theme : themes) {
			if(!first) sb.append(",").append(NL);
			sb.append(theme.toAPIDocsJSON());
			first = false;
		}
		sb.append(NL).append("]").append(NL);
		sb.append("}").append(NL);
		return sb.toString();
	}
}

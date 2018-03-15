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

import org.amexio.colors.themes.AmexioLicense;

/**
 * Sass to Css Builder (Creates the Shell Script)
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date
 */
public final class SassToCssBuilder {
	
	private static final String NL = System.getProperty("line.separator");
	
	private final ArrayList<ThemeConfig> themes;
	
	/**
	 * Create the Builder with a Collection of Theme Config
	 * @param _themes
	 */
	public SassToCssBuilder(ArrayList<ThemeConfig> _themes) {
		themes = (_themes != null) ? _themes : new ArrayList<ThemeConfig>();
		themes.sort(new ThemeConfig());
	}
	
	/**
	 * Returns the Themes Config List
	 * @return
	 */
	public ArrayList<ThemeConfig> themes() {
		return themes;
	}
	
	/**
	 * Build the Sass to Css Conversion Script
	 * 
	 * @return
	 */
	public String buildScript() {
		StringBuilder sb = new StringBuilder();
		sb.append("#!/bin/bash").append(NL);
		sb.append(AmexioLicense.COPYRIGHT_HASH).append(NL);
		// sass mda/at-md-royalblue-dodgerblue.scss:css/at-md-royalblue-dodgerblue.css;
		int x=0;
		for(ThemeConfig theme : themes) {
			x++;
			sb.append("sass mda/").append(theme.getThemeBootFile());
			sb.append(":css/").append(theme.getCssFileName()).append(";").append(NL);
			if(x % 5 == 2) {
				// Print a NL after every 5 lines
				sb.append(NL);
			}
		}
		return sb.toString();
	}
}

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
package org.amexio.colors.themes;

/**
 * Theme Boot File. 
 * 
 * This file will load all the related theme Files. 
 * 
 * 01. ../mda/init.scss
 * 02. ../def/common.scss
 * 03. ../def/..forminputs.scss
 * 04. ../def/..enterprise.scss
 * 05. ../def/..data.scss
 * 06. ../def/..layouts.scss
 * 07. ../def/..nav.scss
 * 08. ../def/..panes.scss
 * 09. ../def/..animation.scss
 * 10. ../def/..media.query.scss
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date
 */
public final class AmexioThemeBoot {
	
	private static final String NL = System.getProperty("line.separator");

	/**
	 * Amexio Theme Boot Instructions
	 */
	public static final String themeInitData = "" + NL 
			+"/** Initialze Theme variables ------------ */" + NL 
			+ "@import \"../mda/"; 
			
	public static final String themeBootData = "" + NL 
			+"/** Initialze HTML variables ------------ */" + NL 
			+ "@import \"../def/common.scss\";" + NL + NL
			
			+"/** Initialze Component variables ------------ */" + NL 
			+ "@import \"../def/amexio.forminputs.scss\";" + NL 
			+ "@import \"../def/amexio.enterprise.scss\";" + NL 
			+ "@import \"../def/amexio.data.scss\";" + NL 
			+ "@import \"../def/amexio.nav.scss\";" + NL 
			
			+"/** Initialze Panels and Layouts variables ------------ */" + NL 
			+ "@import \"../def/amexio.panes.scss\";" + NL 
			+ "@import \"../def/amexio.layouts.scss\";" + NL + NL
			
			+"/** Initialze Animation variables ------------ */" + NL 
			+ "@import \"../def/amexio.animation.scss\";" + NL + NL
			
			+"/** Initialze Responsive Design variables ------------ */" + NL 
			+ "@import \"../def/amexio.media.query.scss\";";
	
	/**
	 * Get Complete Theme Boot instructions
	 * 
	 * @return String
	 */
	public static String getThemeBootData(String _fileName) {
		StringBuilder sb = new StringBuilder();
		sb.append(AmexioLicense.COPYRIGHT);
		sb.append(themeInitData).append(_fileName).append("\";");
		sb.append(NL).append(NL);
		sb.append(themeBootData);
		sb.append(AmexioLicense.AMEXIO_SUPPORT);
		return sb.toString();
	}
}

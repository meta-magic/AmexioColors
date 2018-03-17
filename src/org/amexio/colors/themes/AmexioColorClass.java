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
package org.amexio.colors.themes;

import org.amexio.colors.core.Color;
import org.amexio.colors.web.Colors;

/**
 * Amexio Colors CSS Definition
 * <p>
 * Usage in Amexio Component
 * <p>
 * <amexio-progress-bar [current-value]="'50'" [infinite]="false” [amexio-color]=“'amexio-red'"></amexio-progress-bar>
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date
 */
public final class AmexioColorClass {
	
	public static final String NL = System.getProperty("line.separator");
	
	private final String className;
	private final Color backgroundColor;
	private final Color fontColor;

	/**
	 * Create a Amexio Color CSS Class Definition
	 * 
	 * @param _class
	 * @param _bgColor
	 * @param _fontColor
	 */
	public AmexioColorClass(String _class, Color _bgColor, Color _fontColor) {
		className		= (_class != null) ? _class : "no-class-name-defined";
		backgroundColor = (_bgColor != null) ? _bgColor : Colors.GRAY.BLACK;
		fontColor		= (_fontColor != null) ? _fontColor : Colors.WHITE.WHITE;
	}
	
	/**
	 * Returns the Background Color
	 * @return
	 */
			
	public Color backgroundColor() {
		return backgroundColor;
	}
	
	/**
	 * Returns the Font Color
	 * @return
	 */
	public Color fontColor() {
		return fontColor;
	}
	
	/**
	 * Returns the CSS Class Name
	 * @return
	 */
	public String className() {
		return className;
	}
	
	/**
	 * Returns the CSS Class Name
	 */
	public String toString() {
		return className;
	}
	
	/**
	 * Returns the Class Name hashcode.
	 */
	public int hashCode() {
		return className.hashCode();
	}

	/**
	 * Returns TRUE if two Class Names are same.
	 */
	public boolean equals(Object o) {
		try {
			AmexioColorClass c = (AmexioColorClass)o;
			return c.className.equalsIgnoreCase(this.className);
		} catch (Exception ignored) {}
		return false;
	}
	/**
	 * Prints the CSS Class Definition
	 * @return
	 */
	public String printCSS() {
		StringBuilder sb = new StringBuilder();
		sb.append("/** Amexio Colors --- ").append(NL);
		sb.append("   ").append(backgroundColor.printColor()).append(NL);
		sb.append("   ").append(fontColor.printColor()).append(NL);
		sb.append("*/").append(NL);
		sb.append(".").append(className.trim()).append(" {").append(NL);
		// sb.append("\t").append("background-color: ").append(backgroundColor.rgbFunction()).append(";").append(NL);
		// sb.append("\t").append("color: ").append(fontColor.rgbFunction()).append(";").append(NL);
		sb.append("\t").append("background-color: ").append(backgroundColor.hexStr()).append(";").append(NL);
		sb.append("\t").append("color: ").append(fontColor.hexStr()).append(";").append(NL);
		sb.append("}").append(NL);
		return sb.toString();
	}
}

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
package org.amexio.colors.io;

import java.util.Comparator;
import java.util.StringJoiner;

import org.amexio.colors.web.Colors;

/**
 * Theme Configuration Object
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date
 */
public final class ThemeConfig implements Comparable<ThemeConfig>, Comparator<ThemeConfig> {
	private static final String NL = System.getProperty("line.separator");
	
	private final String fileName;
	private final String themeInitFile;
	private final String themeBootFile;
	private final String themeCssFile;
	private final String themeImageName;
	private final String color1;
	private final String color2;
	private final String color3;
	private final String color4;
	private final String color5;
	private final String color6;
	private final String themeName;

	private double version = 3.0;
	private boolean isMaterial = true;
	
	/**
	 * 
	 */
	public ThemeConfig() {
		this("invalid-theme-file","#990000","#ff0000");
	}
	/**
	 * Theme Data Reader (Row)
	 * 1. Theme Init File Name
	 * 2. Primary Color
	 * 
	 * @param _file
	 * @param _c1
	 */
	public ThemeConfig(String _file, String _c1) {
		this(_file, _c1, null, null, null, null, null);
	}
	
	/**
	 * Theme Data Reader (Row)
	 * 1. Theme Init File Name
	 * 2. Primary Color
	 * 3. Secondary Color
	 * 
	 * @param _file
	 * @param _c1
	 * @param _c2
	 */
	public ThemeConfig(String _file, String _c1, String _c2) {
		this(_file, _c1, _c2, null, null, null, null);
	}
	
	/**
	 * Theme Data Reader (Row)
	 * 1. Theme Init File Name
	 * 2. Primary Color
	 * 3. Secondary Color
	 * 4. Teritiary Color
	 * 5. Fourth Color
	 * 
	 * @param _file
	 * @param _c1
	 * @param _c2
	 * @param _c3
	 * @param _c4
	 */
	public ThemeConfig(String _file, String _c1, String _c2, 
			String _c3, String _c4) {
		this(_file, _c1, _c2, _c3, _c4, null, null);
	}
	
	/**
	 * Theme Data Reader (Row)
	 * 1. Theme Init File Name
	 * 2. Primary Color
	 * 3. Secondary Color
	 * 4. Teritiary Color
	 * 5. Fourth Color
	 * 6. Fifth COlor
	 * 7. Sixth Color
	 * 
	 * @param _file
	 * @param _c1
	 * @param _c2
	 * @param _c3
	 * @param _c4
	 * @param _c5
	 * @param _c6
	 */
	public ThemeConfig(String _file, String _c1, String _c2, String _c3,
			String _c4, String _c5, String _c6) {
		fileName			= setFileName(_file);
		themeCssFile		= makeThemeCssFile();
		themeInitFile	= makeInitFileName();
		themeBootFile	= makeBootFileName();
		themeName		= createThemeName();
		themeImageName	= makeImageFileName();
		color1			= _c1;
		color2		  	= _c2;
		color3		  	= (_c3 != null) ? _c3 :  Colors.ORANGE.CORAL.hexStr();
		color4		  	= (_c4 != null) ? _c4 :  Colors.GREEN.MEDIUMSPRINGGREEN.hexStr();
		color5		  	= (_c5 != null) ? _c5 :  Colors.WHITE.WHITESMOKE.hexStr();
		color6		  	= (_c6 != null) ? _c6 :  Colors.WHITE.WHITE.hexStr();
	} 
	
	/**
	 * Set the Theme File Name
	 * @param _fileName
	 * @return
	 */
	private String setFileName(String _fileName) {
		if(_fileName == null || _fileName.length() == 0) {
			return "no-name";
		}
		return _fileName.trim();
	}
	
	/**
	 * Creates the Theme CSS name
	 * @return
	 */
	private String makeThemeCssFile() {
		return "at-md-" + fileName.toLowerCase();
	}
	
	/**
	 * Theme Image File Name
	 * @return
	 */
	private String makeImageFileName() {
		return "AT-MD-" + themeName.replace(" ", "-") + ".jpg";
	}
	
	/**
	 * Make Init File Name
	 * @return
	 */
	private String makeInitFileName() {
		return "at-md-" + fileName.toLowerCase() + "-init.scss";
	}

	/**
	 * Make Boot File Name
	 * @return
	 */
	private String makeBootFileName() {
		return "at-md-" + fileName + ".scss";
	}

	/**
	 * Create the Theme Name
	 * @return
	 */
	private String createThemeName() {
		char[] c = fileName.trim().replaceAll("-", " ").toCharArray();
		int y = 0;
		for(int x=0; x<c.length; x++) {
			if(x==0 || x==y) c[x] = (char) (c[x] - 32);
			if(c[x] == 32) y = x +1;
		}
		return new String(c);
	}
	/**
	 * Set the Theme Version
	 * @param _version
	 * @return
	 */
	public ThemeConfig setVersion(double _version) {
		if(_version > 0.0) {
			version = _version;
		}
		return this;
	}
	
	/**
	 * Sets the Design Type 
	 * TRUE = Material Design
	 * FALSE = Amexio Design
	 * 
	 * @param _type
	 * @return
	 */
	public ThemeConfig setDesignType(boolean _type) {
		isMaterial = _type;
		return this;
	}
	
	/**
	 * Sets the Theme Design Type to Material Design
	 * @return
	 */
	public ThemeConfig setMaterialDesignType() {
		isMaterial = true;
		return this;
	}
	
	/**
	 * Sets the Theme Design Type to Amexio Design
	 * @return
	 */
	public ThemeConfig setAmexioDesignType() {
		isMaterial = false;
		return this;
	}
	
	/**
	 * Returns TRUE if the Design Type = Material Design
	 * @return
	 */
	public boolean isMaterial() {
		return isMaterial;
	}
	
	/**
	 * Returns the Design Type
	 * @return
	 */
	public String designType() {
		return (isMaterial) ? "Material Design" : "Amexio Design";
	}
	
	/**
	 * Returns the Version
	 * @return
	 */
	public double getVersion() {
		return version;
	}
	
	/**
	 * Returns Theme Input Name
	 * @return
	 */
	public String getThemeInputName() { return fileName; }
	
	/**
	 * Returns the Theme Init File Name
	 * @return
	 */
	public String getThemeInitFile() { return themeInitFile; }
	
	/**
	 * Returns the Theme Boot File
	 * @return
	 */
	public String getThemeBootFile() { return themeBootFile; }

	/**
	 * Returns the Theme Material Selector Data File Name
	 * @return
	 */
	public String getThemeMaterialFileName() { return "material.json"; }
	
	/**
	 * Returns the Theme Name
	 * @return
	 */
	public String getThemeName() { return themeName; }
	
	/**
	 * Return the Primary Color
	 * @return
	 */
	public String getColor1() { return color1; }
	
	/**
	 * Return the Secondary Color
	 * @return
	 */
	public String getColor2() { return color2; }

	/**
	 * Return Teritiary Color
	 * @return
	 */
	public String getColor3() { return color3; }
	
	/**
	 * Return the Fourth Color
	 * @return
	 */
	public String getColor4() { return color4; }
	
	/**
	 * Return the Fifth Color
	 * @return
	 */
	public String getColor5() { return color5; }
	
	/**
	 * Return the 6th Color
	 * @return
	 */
	public String getColor6() { return color6; }
	
	/**
	 * Returns the Hash Code of the Theme Input File Name
	 */
	public int hashCode() {
		return fileName.hashCode();
	}
	
	/**
	 * Sort on Theme Name
	 */
	@Override
	public int compareTo(ThemeConfig _theme) {
		return (_theme == null) ? 0 : this.themeName.compareTo(_theme.themeName);
	}
	
	/**
	 * Compare Two ThemeConfig Objects
	 */
	@Override
	public int compare(ThemeConfig _tc1, ThemeConfig _tc2) {
		return (_tc1 == null) ? 0 : _tc1.compareTo(_tc2);
	}
	
	/**
	 * Theme Data
	 */
	public String toString() {
		StringJoiner sj = new StringJoiner(",");
		sj.add(fileName).add(color1).add(color2);
		sj.add(designType()).add(""+getVersion());
		return sj.toString();
	}
	
	/**
	 * Builds the JSON Structure for Theme Selector
	 * 
	 * @return
	 */
	public String toJSON() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t\t{").append(NL);
		sb.append("\t\t\"themeName\": \"").append(this.themeName).append("\",").append(NL);
		sb.append("\t\t\"themeCssFile\": \"").append(this.themeCssFile).append("\",").append(NL);
		sb.append("\t\t\"link\": \"").append(this.themeImageName).append("\"").append(NL);
		sb.append("\t\t}");
		return sb.toString();
	}
}

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

import java.util.ArrayList;

import org.amexio.colors.io.ThemeConfig;
import org.amexio.colors.io.ThemeConfigHueSort;
import org.amexio.colors.io.ThemeConfigRGBSort;
import org.amexio.colors.io.ThemeFileWriter;
import org.amexio.colors.io.ThemeSelectorData;
import org.amexio.colors.io.ThemesDataReader;

/**
 * Amexio Theme Factory produces complete set of theme files.
 * 
 * @author Araf Karsh Hamid
 * @version 1.0
 * @date March 1, 2018
 */
public class AmexioThemeFactory {

	private final ThemesDataReader themesData;
	private final ThemeFileWriter themeWriter;
	private ThemeSelectorData selectorData;
	private AmexioThemeBuilder themeBuilder;
	
	/**
	 * Theme File Factory
	 * 
	 * @param _inputFile
	 * @param _destination
	 */
	public AmexioThemeFactory(String _inputFile, String _destination) {
		themesData = new ThemesDataReader(_inputFile, _destination);
		themeWriter = new ThemeFileWriter(_destination);
		
	}
	
	/**
	 * Create all the Themes based on the input from Theme Data File
	 * @return
	 */
	public boolean createThemes() {
		if(themesData.processFile()) {
			ArrayList<ThemeConfig> themes = themesData.getThemes();
			selectorData = new ThemeSelectorData(themes);
			for(ThemeConfig theme : themes) {
				themeBuilder = new AmexioThemeBuilder(theme);
				themeWriter.generateFile(theme.getThemeBootFile(), 
						AmexioThemeBoot.getThemeBootData(theme.getThemeInitFile()));
				themeWriter.generateFile(theme.getThemeInitFile(), 
						themeBuilder.printSCSS());
			}
			themeWriter.generateFile("material.json", selectorData.buildJSON());
			themeWriter.generateFile("themes.json", selectorData.buildAPIJSON());
			selectorData = new ThemeSelectorData(themes,4);
			themeWriter.generateFile("themes-api-showcase.json", selectorData.buildJSON());
			selectorData.themes().sort(new ThemeConfigHueSort());
			themeWriter.generateFile("themes-api-showcase-hue.json", selectorData.buildJSON());
			return true;
		}
		return false;
	}
	
	/**
	 * Generate all the Themes
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		AmexioThemeFactory factory = new AmexioThemeFactory("Themes-Data.txt",
										"/Users/arafkarsh/AmexioColors/mda-new-7/");
		if(factory.createThemes()) {
			System.out.println("Theme Generation Process Completed...");
		} else {
			System.out.println("Unable to find the file");
		}

	}

}

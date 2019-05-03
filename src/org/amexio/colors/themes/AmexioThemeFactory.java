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

import org.amexio.colors.io.SassToCssBuilder;
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
 * @updated on April 10, 2019
 */
public class AmexioThemeFactory {

	private final ThemesDataReader themesInputReader;
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
		themesInputReader = new ThemesDataReader(_inputFile, _destination);
		themeWriter = new ThemeFileWriter(_destination);
		
	}
	
	/**
	 * Create all the Themes based on the input from Theme Data File
	 * 
	 * @updated on April 10, 2019
	 * @return
	 */
	public boolean createThemes() {
		if(themesInputReader.processFile()) {
			ArrayList<ThemeConfig> themes = themesInputReader.getThemes();
			selectorData = new ThemeSelectorData(themes);
			// Loop thru the Theme Config
			for(ThemeConfig theme : themes) {
				// Write Theme By Theme
				themeBuilder = new AmexioThemeBuilder(theme);
				themeWriter.generateFile(theme.getThemeBootFile(), 
						AmexioThemeBoot.getThemeBootData(theme.getThemeInitFile()));
				themeWriter.generateFile(theme.getThemeInitFile(), 
						// Updated: changed the method call from printSCSS()
						// to printAllData() to have both CSS and SCSS info.
						themeBuilder.printAllData());	
				// Print CSS3 Variables as JSON File
				themeWriter.generateFile(theme.getThemeJSONFile(), themeBuilder.printJSONData());	
			}
			// Write All themes  MetaData into a file.
			themeWriter.generateFile("material.json", selectorData.buildJSON());
			themeWriter.generateFile("themes.json", selectorData.buildAPIJSON());
			themeWriter.generateFile("amexioColors.scss", AmexioColors.printCSS());
			selectorData = new ThemeSelectorData(themes,3);
			themeWriter.generateFile("themes-api-showcase.json", selectorData.buildJSON());
			selectorData.themes().sort(new ThemeConfigHueSort());
			themeWriter.generateFile("themes-api-showcase-hue.json", selectorData.buildJSON());
			SassToCssBuilder sass2Css = new SassToCssBuilder(themes);
			themeWriter.generateFile("sass2css.sh", sass2Css.buildScript());
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
										"/Users/arafkarsh/AmexioColors/2019/mda-12/");
		if(factory.createThemes()) {
			System.out.println("Theme Generation Process Completed...");
		} else {
			System.out.println("Unable to find the file");
		}

	}

}

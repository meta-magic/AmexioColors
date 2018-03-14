
<img src="https://image.ibb.co/cZS6ax/Amexio_Colors_Logo_FF.jpg" alt="Amexio Colors" align="center">

<h1 align="center">
# Amexio Colors API v1.0
</h1>

### Getting Started

To install the Amexio Colors:

```bash
npm install -g amexio-colors
```
To Generate Amexio Material Design Themes

```bash
mkdir newThemes
cd newThemes
echo "// Amexio Themes v0.0 " >> Themes-Data.txt
echo "// Design-Type : Material Design " >> Themes-Data.txt
echo "// Theme-Version : 4.0 " >> Themes-Data.txt
echo "army-olive,#4B5320,#708238" >> Themes-Data.txt
echo "ash-stone-black,#544C4A,#877F7D" >> Themes-Data.txt
ac Theme-DataFiles outputDirectory
```

## Understanding various Color formats

 RGB  = Red Green Blue<br>
 HSL  = Hue Saturation Lightness<br>
 HWB  = Hue Whiteness Blackness<br>
 CMYK = Cyan Magenta Yellow Black<br>
 
 A Color profile establishes the boundaries of the RGB or CMYK gamut, without a
 color profile, the numbers expressed as RGB or CMYK has no meaning. While RGB is
 mainly used for electronic displays CMYK is used for print medium.
  
 When all the colors of RGB combines you will get white similar to the convergence
 of the Rainbow colors resulting in white light.
  
 At the same time when all the colors of CMYK combines you will get Black as it 
 represents the absorption of light resulting in Darkness.
  
 RGB and CMYK are "device dependent", meaning that you can get different colors 
 with the same set of numbers.
  
 ## How we arrived at building this API
 
 <img src="https://image.ibb.co/dmrJNc/Amexio_Color_Stats.jpg" alt="Amexio Color History" align="center">
 
 ## Color is the Magical Object in Amexio Color API
 
 Color is an immutable object with RGB with Alpha, HSL, RGB Normalized Values 
 (to be used in Machine Learning), Hex Values and Color Channel identification. 
  
 It also has the following Conversion Alogrithms.
 
 * RGB to HSL
 * RGB to HWB
 * RGB to CMYK
 * RGB to NCol (Natural Colors - To be implemented)
 
 * HSL to RGB
  
 ### Functions available in Color API
 
 * Pure Color of the Current Color (Saturation = 100, Lightness = 51)
 * Gray Tone of the Current Color (Saturation = 25, Lightness = 81)
 * Finding Foreground Color for the Current Color
 * Finding Background Color for the Current Color
 * Darken the Current Color
 * Lighten the Current Color
 
 ## Amexio Theme Builder API
 
 Theme Builder uses the the above mentioned functions to understand the color patterns and 
 automatically derive the color patterns and color combinations for the Primary Color 
 given as an input to the Theme Builder. 
 
 ## Amexio Color Factory API
 
 Color Factory API will focus on creating Color combinations based on the following Color Patterns
 
 ### Color Duo
 
 Colors that are directly opposite one another on the color wheel are known as complementary colors. 
 Complementary colors have a high contrast and can be very effective as accent colors when paired with 
 a more neutral palette.
 
 ### Triadic Colors
  
 Triadic harmonies consist of three colors equidistant from one another on the color wheel. Like 
 complementary colors, triadic schemes tend to be very bright with a high contrast and work best 
 when one color dominates.
 
 ### Tetradic Colors
 
 Tetradic color harmonies are formed by two sets of complementary colors 60 degrees apart on the 
 color wheel. Tetradic schemes are an excellent starting point for creating color palettes; fine 
 tune them using color shades, tints and tones.
 
 ###  Analogus Colors
 
 Analogous harmonies are created by selecting the colors directly adjacent to a chosen color. 
 Frequently found in web design, analogous schemes, when paired with a complementary color for 
 contrast, can offer great versatility.
 
 ### Neutral Colors
 
 Neutral schemes, like analogous harmonies, are formed by taking the colors on either side of 
 a chosen color but at half the distance. While analogous schemes typically use colors 30 degrees 
 apart, neutral harmonies use colors 15 degrees apart.
 
 ## License

Copyright © [MetaMagic Global Inc](http://www.metamagicglobal.com/), 2017-18. [Amexio Angular EXtensions](http://www.amexio.tech). All rights reserved.

Licensed under the [Apache 2.0](http://www.amexio.org/metamagic-showcase/license.html)  License.

**Enjoy!**
 

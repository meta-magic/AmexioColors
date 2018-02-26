# Amexio Colors

  
 A Color profile establishes the boundaries of the RGB or CMYK gamut, without a
 color profile, the numbers expressed as RGB or CMYK has no meaning. While RGB is
 mainly used for electronic displays CMYK is used for print medium.
  
 When all the colors of RGB combines you will get white similar to the convergence
 of the Rainbow colors resulting in white light.
  
 At the same time when all the colors of CMYK combines you will get Black as it 
 represents the absorption of light resulting in Darkness.
  
 RGB and CMYK are "device dependent", meaning that you can get different colors 
 with the same set of numbers.
  
 RGB  = Red Green Blue
 HSL  = Hue Saturation Lightness
 HWB  = Hue Whiteness Blackness
 CMYK = Cyan Magenta Yellow Black
  
 ## Color is the Magical Object in Amexio Color API
 
 Color is an immutable object with RGB with Alpha, HSL, RGB Normalized Values 
 (to be used in Machine Learning), Hex Values and Color Channel identification. 
  
 It also has the following Conversion Alogrithms.
 
 * RGB to HSL
 * RGB to HWB
 * RGB to CMYK
 * RGB to NCol (Natural Colors - To be implemented)
 
 * HSL to RGB
  
 ### Functions available in Color
 
 * Pure Color of the Current Color (Saturation = 100, Lightness = 51)
 * Gray Tone of the Current Color (Saturation = 25, Lightness = 81)
 * Finding Foreground Color for the Current Color
 * Finding Background Color for the Current Color
 * Darken the Current Color
 * Lighten the Current Color
 
 ## Amexio Theme Builder
 Theme Builder uses the the above mentioned functions to understand the color patterns and 
 automatically derive the color patterns and color combinations for the Primary Color 
 given as an input to the Theme Builder. 
 
 
 
 

# LoadingVectorAsset
How to load a Vector Asset in Android



This example shows how to load a vector asset containig the property android:fillColor in a Gradient

android:fillColor
Specifies the color used to fill the path. May be a color or, for SDK 24+, a color state list or a gradient color (See GradientColor and GradientColorItem). If this property is animated, any value set by the animation will override the original value. No path fill is drawn if this property is not specified.

Using android:fillColor in a Gradient is just supported in Android API 24+ (OS 7.0+) so we need to create a versión for minor versions into /drawable and for new versions supporting this property into /drawable-v24

[![introducir la descripción de la imagen aquí][1]][1]

  [1]: https://i.stack.imgur.com/6d3jl.png
  
  
# How it looks!

[![Strawberry][2]][2]


  [2]: https://i.stack.imgur.com/zJwzi.png


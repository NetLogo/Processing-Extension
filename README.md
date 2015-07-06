# Processing-Extension
This repository contains the budding Processing Extension for NetLogo. <a href="http:/processing.org>Processing</a> is a Java based language that's great for creating cool visualizations. Our hope is that this extension will let users build cool visualizations of their NetLogo models.
# How to use it
1. Get the Processing Extension on to your computer. We suggest forking the code, so you can make changes that won't conflict with the master branch.
2. Copy/paste your sketch into the NetLogoProcessing.java file.
3. Build the extension .jar and run it!

# Primitives
The Processing sketch has just four primitives.
## show / close
`nlp:show` / `nlp:close` will open or close your Processing sketch.

## call
`nlp:call "method-name" [arguments]`
You ue `call` to call methods in your Processing sketch. For instance, if you want to call your draw method (which is void), use `nlp:call "draw"[]`.

## draw
`nlp:draw` redraws your sketch. We separated this out so that you are in control of when your sketch uses CPU to redraw. You will often want to call it after you have done anything that changed the state of your sketch.

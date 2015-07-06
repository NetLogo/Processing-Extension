package main.org.nlogo.extensions.nlp;

import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PGraphicsJava2D;

/*
 * Abstract class for doing Processing in NetLogo. Extend this class
 * and fill in your code
 *
 */
public class NetLogoProcessing extends PApplet {

	private static final long serialVersionUID = 7587604932372737852L;

    public NetLogoProcessing(){
        super();
    }

    public void loadSketch(String path){
        String[] stringArray = new String[] {path};
//        this.runSketch(stringArray);
    }

	
	protected PGraphics makeGraphics(int iwidth, int iheight,
			String irenderer, String ipath,
			boolean iprimary) {

		PGraphicsJava2D pg = new PGraphicsJava2D();
		pg.setParent(this);
		pg.setPrimary(true);
		pg.setPath(null);
		pg.setSize(iwidth, iheight);
		return pg;
	}

}
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
	
	/*
	 * Copy/paste your code in below here. 
	 * Just like in regular Processing your code MUST include:
	 * void setup()
	 * void draw()
	 * 
	 */
    
    
	public void setup(){
		this.size(500,500);
		this.background(0);
		noLoop();
	}
	
	public void draw(){
		float r = random(255);
		float g = random(255);
		float b = random(255);
		background(r,g,b);
	}
	
	public void blue(){
		background(0,0,255);
	}
	
	public void red(){
		background(255,0,0);
	}

}
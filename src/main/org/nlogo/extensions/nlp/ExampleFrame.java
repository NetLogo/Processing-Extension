package main.org.nlogo.extensions.nlp;


import java.awt.BorderLayout;

import javax.swing.JFrame;

import processing.core.PApplet;

public class ExampleFrame extends JFrame {
	 /**
	 * 
	 */
	private static final long serialVersionUID = -1574741235087050861L;
	private NetLogoProcessing nlp;
	
	public ExampleFrame(String sketchName) {
         super("NetLogo to Procesing Extension Frame");
         setLayout(new BorderLayout());
         nlp = new NetLogoProcessing();
         nlp.loadSketch(sketchName);
         add(nlp, BorderLayout.CENTER);
         nlp.init();
         this.setSize(600,600);
         this.setVisible(true);
     }
	
	public void kill(){
		nlp().dispose();
		this.dispose();
	}
	
	public NetLogoProcessing nlp(){
		return nlp;
	}
	
 }
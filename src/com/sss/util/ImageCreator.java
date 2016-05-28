package com.sss.util;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class ImageCreator extends JPanel {
	
	
    BufferedImage image;
    
    int imageAdjustment = 0;
    
    
  public ImageCreator() {
	 
	  this("", 75);
  }
  
  public ImageCreator(String filename, int imageAdjustment) {
	  try {
	    	super.setLayout(new BorderLayout());
//	    	 URL url = ImageCreator.class.getClassLoader().getResource("com/sss/image/sssLogo.jpg");
//	    	 image = ImageIO.read(url);
	    	 
//	    	 InputStream iStr = getClass().getClassLoader().getResourceAsStream("com/sss/image/sssLogo.jpg");
//		  	image = ImageIO.read(iStr);
	    	
	    	 String current = System.getProperty("user.dir");
	    	 image = ImageIO.read(new File(current + "/image/sssLogo.jpg"));
		  	
	    	this.imageAdjustment = imageAdjustment;
	    } catch (IOException ie) {
	    	
	    }
	  
  }
  
  public ImageCreator(BufferedImage image, int imageAdjustment) {
	  try {
	    	this.image = image;
	    	this.imageAdjustment = imageAdjustment;
	    } catch (Exception ie) {
	    }
	  
  }
  
  public ImageCreator(InputStream filename, int imageAdjustment) {
	  try {
	    	image = ImageIO.read(filename);
	    	this.imageAdjustment = imageAdjustment;
	    } catch (IOException ie) {
	    }
	  
  }
  

  /**
 * @return the image
 */
public BufferedImage getImage() {
	return image;
}

public void paint(Graphics g) {
	Dimension screenSize = FrameCreator.screenSize;
    g.drawImage( image, (screenSize.width) / 3 - imageAdjustment, FrameCreator.STANDARD_HEIGHT, null);
  }

}
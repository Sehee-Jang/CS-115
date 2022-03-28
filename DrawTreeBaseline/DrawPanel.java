package DrawTreeBaseline;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.JPanel;
import java.awt.geom.*;

/**
 * Class used to create a DrawPanel where shapes will be drawn by the programmer (via code).
 * 
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2019-11-26
 * @Minor modifications by Jeff Light
 * @since 2019-12-01
 */
public class DrawPanel extends JPanel {
	//Attributes
	private static final long serialVersionUID = 6311020027600344213L;
	
	//Landscape Colors
	private final String LIGHT_SKY_BLUE = "87CEFA";
	private final String MIDNIGHT_BLUE = "191970";
	private final String SNOW3 = "CDC9C8";
	private final String WHITE = "FFFFFF";
	private final String MY_WHITE_SMOKE = "F5F5F5";
	private final String LAWN_GREEN = "7CFC00";
	private final String MEDIUM_SPRING_GREEN = "00FA9A";
	private final String SPRING_GREEN = "00FF7F";
	
	//Tree Colors
	private final String BROWN = "A52A2A";
	private final String DARK_GREEN = "006400";
	private final String FOREST_GREEN = "228B22";
	private final String GRAY = "808080";
	private final String GREEN = "008000";
	
	//House Colors
	private final String DARK_SLATE_GRAY = "2F4F4F";
	private final String FIREBRICK = "B22222";
	private final String INDIAN_RED = "CD5C5C";
	private final String MAROON = "800000";
	private final String MOCCASIN = "FFE4B5";
	private final String RED = "FF0000";
	private final String SADDLE_BROWN = "8B4513";
	private final String SIENNA = "A0522D";
	private final String SLATE_GRAY = "708090";
	private final String PERU = "CD853F";
	private final String WHITE_SMOKE = "F5F5F5";
	private final String BURLYWOOD = "DEB887";
	private final String LIGHTGRAY = "E5E9EA";
	private final String HOUSEBEIGE = "E6E0CA";
	private final String ROOFGRAY = "656B6B";
	private final String ROOFRED = "C05950";
	private final String ORANGE = "FB7752";
	private final String DOOR_BLUE = "5BA9A3";
	private final String DOOR_BROWN = "cb8b40";
	
	//FlOWER Colors
	private final String LIGHTYELLOW = "#F9CB8F";
	private final String DARKYELLOW = "#856136";
	
	//MICKEY Colors
	private final String headColor = "#2b2929";
	
	public DrawPanel() {
		this.setPreferredSize(new Dimension(1600, 900));	//Sets the dimensions of the DrawPanel.  Change this if your screen doesn't support this size.
		this.setOpaque(true);
		this.setBackground(Color.WHITE);			//Sets the background of the DrawPanel LIGHT_GRAY.  You may change this if desired.
	}
	/**
	 * Overrides the JComponent.paintComponent method.
	 * EVERYTHING that gets drawn to the Component (which sits on the content frame of the JFrame) is drawn in this method.
	 * Draw12a all your objectsDraw here.
	 * Automatically called by the event handler whenever the screen needs to be redrawn.
	 * DO NOT CALL THIS METHOD MANUALLY
	 * 
	 * @param	g	//All drawing in Java must go through a Graphics object
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;			//Allows us to draw using both the Graphics class methods and the Graphics2D class methods

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	//Makes drawn shapes and fonts clearer

		//DrawTree landscape
		g2.setColor(Color.decode("#" + LIGHT_SKY_BLUE));
		g2.fillRect(0,0,this.getWidth(),this.getHeight());
		
		//Draw Mountains
		Mountain mt1 = new Mountain(g2, -100, 450, 1, "MEDIUM");
		mt1.draw();
				
		Mountain mt2 = new Mountain(g2, 150, 450, 1, "LARGE");
		mt2.draw();
		
		Mountain mt3 = new Mountain(g2, 400, 400, 1, "LARGE");
		mt3.draw();
		
		Mountain mt4 = new Mountain(g2, 800, 450, 1, "LARGE");
		mt4.draw();
		
		Mountain mt5 = new Mountain(g2, 1100, 500, 1, "LARGE");
		mt5.draw();
		
		Mountain mt6 = new Mountain(g2, 1300, 420, 1, "LARGE");
		mt6.draw();
		
		Mountain mt7 = new Mountain(g2, 680, 450, 1, "SMALL");
		mt7.draw();
		
		Mountain mt8 = new Mountain(g2, 980, 450, 1, "MEDIUM");
		mt8.draw();
		
		Mountain mt9 = new Mountain(g2, 650, 450, 1, "MEDIUM");
		mt9.draw();
		
		Mountain mt10 = new Mountain(g2, 1200, 550, 1, "MEDIUM");
		mt10.draw();
		
		Mountain mt11 = new Mountain(g2, 50, 450, 1, "SMALL");
		mt11.draw();
		
		Mountain mt12 = new Mountain(g2, 310, 450, 1, "MEDIUM");
		mt12.draw();
		
		Mountain mt13 = new Mountain(g2, 280, 450, 1, "SMALL");
		mt13.draw();
		
		Mountain mt14 = new Mountain(g2, 1100, 450, 1, "SMALL");
		mt14.draw();
		
		Mountain mt15 = new Mountain(g2, 600, 360, 1, "SMALL");
		mt15.draw();
		
		
		
		//Draw Lawn
		g2.setColor(Color.decode("#" + SPRING_GREEN));
		g2.fillOval((-600), 350, this.getWidth() + 1200, 700);
	
		House h3 = new House(g2, 500, 350, 1, "SMALL", "turnON", "OPEN", HOUSEBEIGE, LIGHTGRAY, PERU, DOOR_BROWN);
		h3.draw();
		
		House h4 = new House(g2, 1100, 330, 1, "SMALL", "turnOff", "CLOSED", SIENNA, BURLYWOOD, SIENNA, DOOR_BROWN);
		h4.draw();

		//Draw Trees
		Tree t1 = new Tree(g2, 105, 400, 1, 3, BROWN , DARK_GREEN, "SQUAT");
		t1.draw();
		
		Tree t11 = new Tree(g2, 600, 400, 1, 3, BROWN , GRAY, "NORMAL");
		t11.draw();
		
		Tree t12 = new Tree(g2, 1000, 350, 1, 5, BROWN , GRAY, "NORMAL");
		t12.draw();
		
		Tree t2 = new Tree(g2, 195, 375, 1, 5, BROWN , GRAY, "SKINNY");
		t2.draw();
		
		Tree t3 = new Tree(g2, 295, 450, 1, 4, BROWN , FOREST_GREEN,"NORMAL");
		t3.draw();
		
		Tree t4 = new Tree(g2, 900, 450, 1, 2, BROWN , GRAY,"NORMAL");
		t4.draw();
		
		Tree t5 = new Tree(g2, 1305, 400, 1, 4, BROWN , GREEN,"NORMAL");
		t5.draw();
		
		Tree t6 = new Tree(g2, 1405, 380, 1, 3, BROWN , FOREST_GREEN,"NORMAL");
		t6.draw();
		
		Tree t7 = new Tree(g2, 1540, 640, 1, 5, BROWN , GRAY,"BIG");
		t7.draw();
		
		Tree t8 = new Tree(g2, 1490, 670, 1, 4, BROWN , DARK_GREEN,"BIG");
		t8.draw();
		
		Tree t9 = new Tree(g2, 800, 400, 1, 4, BROWN , FOREST_GREEN,"SKINNY");
		t9.draw();
		
		//Draw Houses
		House h1 = new House(g2, 1200, 700, 1, "LARGE", "turnON", "OPEN", PERU, LIGHTGRAY, ROOFGRAY, DOOR_BROWN);
		h1.draw();
		
		House h2 = new House(g2, 180, 550, 1, "MEDIUM", "turnOff", "CLOSED", HOUSEBEIGE, LIGHTGRAY, ORANGE, DOOR_BROWN);
		h2.draw();
		
		Tree t13 = new Tree(g2, 30, 760, 1, 3, BROWN , DARK_GREEN,"BIG");
		t13.draw();
		
		Tree t10 = new Tree(g2, 100, 800, 1, 4, BROWN , FOREST_GREEN,"BIG");
		t10.draw();
		
		
		
		//Draw Flowers
		Flower f1 = new Flower(g2, 500, 500, 1, MOCCASIN, SIENNA);
		f1.draw();
		
		Flower f2 = new Flower(g2, 250, 800, 1, ORANGE, SIENNA);
		f2.draw();	
		
		Flower f3 = new Flower(g2, 600, 700, 1, ORANGE, MOCCASIN);
		f3.draw();
		
		Flower f4 = new Flower(g2, 800, 500, 1, ORANGE, SIENNA);
		f4.draw();
		
		Flower f5 = new Flower(g2, 180, 440, 1, MOCCASIN, SIENNA);
		f5.draw();
		
		Flower f6 = new Flower(g2, 750, 800, 1, MOCCASIN, SIENNA);
		f6.draw();
		
		Flower f7 = new Flower(g2, 1400, 430, 1, MOCCASIN, SIENNA);
		f7.draw();
		
		Flower f8 = new Flower(g2, 1150, 600, 1, ORANGE, MOCCASIN);
		f8.draw();
		
		Flower f9 = new Flower(g2, 680, 360, 1, ORANGE, MOCCASIN);
		f9.draw();

		//Draw Mickey
		Mickey m1 = new Mickey(g2, 600, 500, 1, "WOMAN", "MEDIUM");
		m1.draw();
		
		Mickey m2 = new Mickey(g2, 400, 300, 1, "MAN", "SMALL");
		m2.draw();
		
		Mickey m3 = new Mickey(g2, 900, 600, 1, "MAN", "BIG");
		m3.draw();
		
		Mickey m4 = new Mickey(g2, 50, 400, 1, "WOMAN", "SMALL");
		m4.draw();
		
		
		//Draw Pooh
		Pooh p1 = new Pooh(g2, 300, 550, 1, "BIG", "FRONT");
		p1.draw();

		Pooh p2 = new Pooh(g2, 900, 300, 1, "SMALL", "BACK");
		p2.draw();
		
		Pooh p3 = new Pooh(g2, 1100, 400, 1, "MEDIUM", "SIDE");
		p3.draw();
		
		Pooh p4 = new Pooh(g2, 330, 315, 1, "SMALL", "FRONT");
		p4.draw();
		
		Pooh p5 = new Pooh(g2, 1220, 400, 1, "MEDIUM", "SIDE2");
		p5.draw();

		
	}//end of method paintComponent(Graphics)

}//end of class DrawPanel
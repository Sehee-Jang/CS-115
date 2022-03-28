package Draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.JPanel;
import java.awt.geom.*;

/**
 * Class used to create a DrawPanel where shapes will be drawn by the programer (via code).
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

	public DrawPanel() {
		this.setPreferredSize(new Dimension(1600, 900));	//Sets the dimensions of the DrawPanel.  Change this if your screen doesn't support this size.
		this.setOpaque(true);
		this.setBackground(Color.WHITE);					//Sets the background of the DrawPanel WHITE.  You may change this if desired.
	}
	/**
	 * Overrides the JComponent.paintComponent method.
	 * EVERYTHING that gets drawn to the Component (which sits on the content frame of the JFrame) is drawn in this method.
	 * Draw all your objectsDraw here.
	 * Automatically called by the event handler whenever the screen needs to be redrawn.
	 * DO NOT CALL THIS METHOD MANUALLY
	 * 
	 * @param	g	//All drawing in Java must go through a Graphics object
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;			//Allows us to draw using both the Graphics class methods and the Graphics2D class methods

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	//Makes drawn shapes and fonts clearer

		
		/*
		 * Use this section to write your code.
		 * Draw at least 6 shapes in BOTH draw and fill formats using methods found in the Graphics class and/or the Graphics2D class.
		 * In other words, if you draw an empty rectangle, you should also draw a filled rectangle.  That counts as one (1) shape.
		 * The empty and filled versions of the shape should be at different orientations.
		 * One of the shapes MUST be a triangle.
		 * Each shape should be a different color.  An empty and a filled rectangle may be the same color, but they must be a different color from an empty and filled triangle.
		 * At least one of the colors should NOT be a standard color from the COLOR palette.
		 * Each empty shape should have a different stroke size.
		 * Be sure all shapes are located such that they can all be seen.
		 */
		
		//Draw Rectangles
		g2.setColor(Color.RED);
		g2.setStroke(new BasicStroke(1));
		g2.drawRect(50, 50, 200, 100);
		g2.fillRect(300, 50, 100, 200);
		
		//Draw Ovals
		g2.setColor(Color.GREEN);
		g2.setStroke(new BasicStroke(2));
		g2.drawOval(450, 50, 200, 100);
		g2.fillOval(700, 50, 100, 200);
		
		//Draw an Empty Triangle
		g2.setColor(Color.BLUE);
		g2.setStroke(new BasicStroke(3));
		int[] x1 = {900, 1000, 1100};
		int[] y1 = {250, 50, 250};
		g2.drawPolygon(x1, y1, 3);
			
		//Draw a Filled Triangle
		int[] x2 = {1200, 1200, 1400};
		int[] y2 = {50, 250, 150};
		g2.fillPolygon(x2, y2, 3);

		//Draw an Empty Round Rectangle
		g2.setColor(Color.decode("#008A2F"));
		g2.setStroke(new BasicStroke(4));
		RoundRectangle2D.Double myRec = new RoundRectangle2D.Double(50, 400, 200, 100, 30, 30);
		g2.draw(myRec);
		
		//Draw a Filled Round Rectangle
		RoundRectangle2D.Double myRec2 = new RoundRectangle2D.Double(300, 400, 200, 100, 30, 30);
		Double centerX = myRec2.getCenterX();
		Double centerY = myRec2.getCenterY();
		g2.rotate(90, centerX, centerY);
		g2.fill(myRec2);
		
		g2.rotate(-90, centerX, centerY); //reset the rotate
		
		//Draw an Empty Circle
		g2.setColor(Color.decode("#87CEFA"));
		g2.setStroke(new BasicStroke(5));
		g2.drawOval(550, 380, 150, 150);
		
		//Draw a Filled Circle
		g2.fillOval(750, 380, 150, 150);
		
		
		//Draw an Empty Octagon
		g2.setColor(Color.decode("#CE8540"));
		g2.setStroke(new BasicStroke(6));
		int[] x3 = {1000, 1070, 1140, 1210, 1210, 1140, 1070, 1000};
		int[] y3 = {400, 330, 330, 400, 470, 540, 540, 470};
		g2.drawPolygon(x3, y3, 8);
		
		//Draw a Filled Octagon
		int[] x4 = {1300, 1370, 1440, 1510, 1510, 1440, 1370, 1300};
		int[] y4 = {400, 330, 330, 400, 470, 540, 540, 470};
		g2.fillPolygon(x4, y4, 8);
		
	}//end of method paintComponent(Graphics)

}//end of class DrawPanel
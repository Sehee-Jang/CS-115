package DrawTreeBaseline;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

public class Flower extends LandscapeObject{
	//Attributes
	private Color petalColor;
	private Color centerColor;
	private int petalWidth = 10;
	private int petalHeight = 10;
	
	
	//Constructor
	public Flower(Graphics2D g2, int x, int y, double scale, String petalColor, String centerColor) {
		super(g2, x, y, scale);
		this.petalColor = new Color(Integer.parseInt(petalColor,16));
		this.centerColor = new Color(Integer.parseInt(centerColor,16));
	}

	// Method
	public void draw() {
		applyScale();
		drawFlower();
//		drawPetal();
//		drawCenter();
	}// end of draw()


	public void applyScale() {
		petalWidth = petalWidth * 3;
		petalHeight = petalHeight * 3;	
	}// end of applyScale()

	public void drawFlower() {
		
		//Draw Petals
		g2.setColor(petalColor);
		g2.fillOval(currentX, currentY, petalWidth/2, petalHeight/2);
		g2.fillOval(currentX, currentY + petalWidth/2, petalWidth/2, petalHeight/2);
		g2.fillOval(currentX + petalWidth/2, currentY, petalWidth/2, petalHeight/2);
		g2.fillOval(currentX + petalWidth/2, currentY + petalHeight/2, petalWidth/2, petalHeight/2);
		
		
		//Draw a Filled Round Rectangle
		g2.setColor(centerColor);
		RoundRectangle2D.Double flowerCenter = new RoundRectangle2D.Double(currentX + petalWidth/3, currentY + petalHeight/3, petalWidth/3, petalHeight/3, 5, 5);
		Double centerX = flowerCenter.getCenterX();
		Double centerY = flowerCenter.getCenterY();
		g2.rotate(40, centerX, centerY);
		g2.fill(flowerCenter);
		g2.rotate(-40, centerX, centerY);

	}

	
}// end of Flower() class

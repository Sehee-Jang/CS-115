package DrawTreeBaseline;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class House extends LandscapeObject {

	//Attributes
	private String light = "";
	private String shape = "";
	private String door = "";
	private Color houseColor1;
	private Color houseColor2;
	private Color roofColor;
	private Color doorColor;
	private int houseWidth = 80;
	private int houseHeight = 80;
	private int roofWidth = 120;
	private int roofHeight = 80;
	private int doorWidth = 20;
	private int doorHeight = 30;
	private int windowWidth = 12;
	private int windowHeight = 15;
	private BasicStroke houseStroke = new BasicStroke(10);
	private BasicStroke Stroke = new BasicStroke(3);
	
	//Constructor
	public House(Graphics2D g2, int x, int y, double scale, String shape, String light, String door, String s_houseColor1, String s_houseColor2, String s_roofColor, String s_doorColor) {
		super(g2, x, y, scale);
		this.shape = shape;
		this.light = light;
		this.door = door;
		this.houseColor1 = new Color(Integer.parseInt(s_houseColor1,16));
		this.houseColor2 = new Color(Integer.parseInt(s_houseColor2,16));
		this.roofColor = new Color(Integer.parseInt(s_roofColor,16));
		this.doorColor = new Color(Integer.parseInt(s_doorColor,16));

		
	}// end of House(Graphics2D g2, int x, int y, double scale)

	
	//Methods
	@Override
	public void draw() {
		applyScale();
		drawHouse();
		drawRoof();
		drawWindow();
		drawDoor();
		
	}// end of draw()

	@Override
	public void applyScale() {
		
		switch(this.shape) {
		case "SMALL":
			houseWidth = (int)(houseWidth * 1);
			houseHeight = (int)(houseHeight * 1);
			roofWidth = (int)(roofWidth * 1);
			roofHeight = (int)(roofHeight * 1);
			doorWidth = (int)(doorWidth * 1);
			doorHeight = (int)(doorHeight * 1);
			windowWidth = (int)(windowWidth * 1);
			windowHeight = (int)(windowHeight * 1);
			break;
		case "MEDIUM":
			houseWidth = (int)(houseWidth * 1.5);
			houseHeight = (int)(houseHeight * 1.5);
			roofWidth = (int)(roofWidth * 1.5);
			roofHeight = (int)(roofHeight * 1.5);
			doorWidth = (int)(doorWidth * 1.5);
			doorHeight = (int)(doorHeight * 1.5);
			windowWidth = (int)(windowWidth * 1.5);
			windowHeight = (int)(windowHeight * 1.5);
			break;
		case "LARGE":
			houseWidth = (int)(houseWidth * 4);
			houseHeight = (int)(houseHeight * 4);
			roofWidth = (int)(roofWidth * 4);
			roofHeight = (int)(roofHeight * 4);
			doorWidth = (int)(doorWidth * 4);
			doorHeight = (int)(doorHeight * 4);
			windowWidth = (int)(windowWidth * 4);
			windowHeight = (int)(windowHeight * 4);
			break;
		default:
			System.out.printf("Internal Error: Invalid House Shape: %s\n", shape);
		}//end of switch
	}// end of applyScale()
	
	
	private void drawHouse() {
		g2.setColor(houseColor1);	
		int[] x1 = {currentX, currentX + (houseWidth/2), currentX + houseWidth, currentX + houseWidth, currentX};
		int[] y1 = {currentY, currentY - (houseHeight/2), currentY, currentY + (houseHeight/2), currentY + (houseHeight/2)};
		g2.fillPolygon(x1, y1, 5);
		
		g2.setColor(houseColor2);	
		int[] x2 = {currentX + (houseWidth/20), currentX + (houseWidth/2), currentX + houseWidth - (houseWidth/20), currentX + houseWidth - (houseWidth/20), currentX + (houseWidth/20)};
		int[] y2 = {currentY + (houseHeight/25), currentY - (houseHeight/2) + (houseHeight/12), currentY + (houseHeight/25), currentY + (houseHeight/2) - (houseHeight/20), currentY + (houseHeight/2) - (houseHeight/20)};
		g2.fillPolygon(x2, y2, 5);
	}// end of drawHouse()
	
	
	private void drawRoof() {
		g2.setColor(roofColor);
		g2.setStroke(houseStroke);
		g2.drawLine(currentX - (houseWidth/20), currentY + (houseHeight/20), currentX + (houseWidth/2) + (houseWidth/20), currentY - (houseHeight/2) - (houseHeight/20));
		g2.drawLine(currentX + (houseWidth/2) - (houseWidth/20), currentY - (houseHeight/2) - (houseHeight/20), currentX + houseWidth + (houseWidth/20), currentY + (houseHeight/20));
	}// end of drawRoof()
	
	private void drawDoor() {
		switch (door) {
		case "CLOSED" :
			g2.setColor(doorColor);
			g2.fillRect(currentX + (houseWidth/2) - (houseWidth/8), currentY + (houseHeight/13), doorWidth, doorHeight);
			
			//Draw lines for door
			g2.setStroke(Stroke);
			g2.setColor(Color.DARK_GRAY);
			g2.drawLine(currentX + (houseWidth/2) - (houseWidth/8), currentY + (houseHeight/13), currentX + (houseWidth/2) + (houseWidth/8), currentY + (houseHeight/13));
			g2.drawLine(currentX + (houseWidth/2) + (houseWidth/8), currentY + (houseHeight/13), currentX + (houseWidth/2) + (houseWidth/8), currentY + (houseHeight/2) - (houseHeight/15));
			g2.drawLine(currentX + (houseWidth/2) + (houseWidth/8), currentY + (houseHeight/2) - (houseHeight/15), currentX + (houseWidth/2) - (houseWidth/8), currentY + (houseHeight/2) - (houseHeight/15));
			g2.drawLine(currentX + (houseWidth/2) - (houseWidth/8), currentY + (houseHeight/2) - (houseHeight/15), currentX + (houseWidth/2) - (houseWidth/8), currentY + (houseHeight/13));
			g2.drawLine(currentX + (houseWidth/4) + (houseWidth/4), currentY + (houseHeight/13), currentX + (houseWidth/4) + (houseWidth/4), currentY + (houseHeight/2) - (houseHeight/15));

			// Draw Knobs
			g2.setColor(Color.DARK_GRAY);
			g2.fillOval(currentX + (houseWidth/4) + (houseWidth/5), currentY + (houseHeight/4), doorWidth/10, doorHeight/10);
			g2.fillOval(currentX + (houseWidth/2) + (houseWidth/20), currentY + (houseHeight/4), doorWidth/10, doorHeight/10);
			break;
			
		case "OPEN" :
			g2.setColor(Color.decode("#f5d731"));
			g2.fillRect(currentX + (houseWidth/4) + (houseWidth/9), currentY + (houseHeight/13), doorWidth, doorHeight);
			
			// Draw Doors
			g2.setColor(Color.DARK_GRAY);
			int [] x1 = {currentX + (houseWidth/2) + (houseWidth/10), currentX + (houseWidth/2) + (houseWidth/6), currentX + (houseWidth/2) + (houseWidth/6), currentX + (houseWidth/2) + (houseWidth/10)};
			int [] y1 = {currentY + (houseHeight/14), currentY + (houseHeight/10), currentY + (houseHeight/2), currentY + (houseHeight/2) - (houseHeight/20)};
			g2.fillPolygon(x1, y1, 4);

			int [] x2 = {currentX + (houseWidth/4) + (houseWidth/9), currentX + (houseWidth/2) - (houseWidth/5), currentX + (houseWidth/2) - (houseWidth/5), currentX + (houseWidth/4) + (houseWidth/9)};
			int [] y2 = {currentY + (houseHeight/14), currentY + (houseHeight/10), currentY + (houseHeight/2), currentY + (houseHeight/2) - (houseHeight/20)};
			g2.fillPolygon(x2, y2, 4);
			
			// Draw lines for door
			g2.setStroke(Stroke);
			g2.setColor(Color.black);
			g2.drawLine(currentX + (houseWidth/2) + (houseWidth/10), currentY + (houseHeight/14), currentX + (houseWidth/2) + (houseWidth/6), currentY + (houseHeight/10));		
			g2.drawLine(currentX + (houseWidth/2) + (houseWidth/6), currentY + (houseHeight/10), currentX + (houseWidth/2) + (houseWidth/6), currentY + (houseHeight/2));		
			g2.drawLine(currentX + (houseWidth/2) + (houseWidth/6), currentY + (houseHeight/2), currentX + (houseWidth/2) + (houseWidth/10), currentY + (houseHeight/2) - (houseHeight/20));
			g2.drawLine(currentX + (houseWidth/2) + (houseWidth/10), currentY + (houseHeight/2) - (houseHeight/20), currentX + (houseWidth/2) + (houseWidth/10), currentY + (houseHeight/14));
			
			g2.drawLine(currentX + (houseWidth/2) + (houseWidth/10), currentY + (houseHeight/14), currentX + (houseWidth/4) + (houseWidth/9), currentY + (houseHeight/14));
			g2.drawLine(currentX + (houseWidth/2) + (houseWidth/10), currentY + (houseHeight/2) - (houseHeight/20), currentX + (houseWidth/4) + (houseWidth/9), currentY + (houseHeight/2) - (houseHeight/20));
		
			g2.drawLine(currentX + (houseWidth/4) + (houseWidth/9), currentY + (houseHeight/14), currentX + (houseWidth/2) - (houseWidth/5), currentY + (houseHeight/10));
			g2.drawLine(currentX + (houseWidth/2) - (houseWidth/5), currentY + (houseHeight/10), currentX + (houseWidth/2) - (houseWidth/5), currentY + (houseHeight/2));
			g2.drawLine(currentX + (houseWidth/2) - (houseWidth/5), currentY + (houseHeight/2), currentX + (houseWidth/4) + (houseWidth/9), currentY + (houseHeight/2) - (houseHeight/20));
			g2.drawLine(currentX + (houseWidth/4) + (houseWidth/9), currentY + (houseHeight/2) - (houseHeight/20), currentX + (houseWidth/4) + (houseWidth/9), currentY + (houseHeight/14));
			break;
		}// end of switch
		
	}// end of drawDoor()
	

	private void drawWindow() {
		switch (light){
		case "turnON" :
			g2.setColor(Color.decode("#f5d731"));
			g2.fillRect(currentX + (houseWidth/10), currentY + (houseHeight/14), windowWidth, windowHeight);
			g2.fillRect((int) (currentX + (houseWidth/2) + (houseWidth*0.23)), currentY + (houseHeight/14), windowWidth, windowHeight);
			break;
		case "turnOff" :
			g2.setColor(Color.DARK_GRAY);
			g2.fillRect(currentX + (houseWidth/10), currentY + (houseHeight/14), windowWidth, windowHeight);
			g2.fillRect((int) (currentX + (houseWidth/2) + (houseWidth*0.23)), currentY + (houseHeight/14), windowWidth, windowHeight);
			break;
		}// end of switch
		
		//Left Window
		g2.setStroke(Stroke);
		g2.setColor(Color.BLACK);
		// Left Window Outlines
		g2.drawLine(currentX + (houseWidth/10), currentY + (houseHeight/14), (int) (currentX + (houseWidth*0.25)), currentY + (houseHeight/14));
		g2.drawLine((int) (currentX + (houseWidth*0.25)), currentY + (houseHeight/14), (int) (currentX + (houseWidth*0.25)), currentY + (houseHeight/4));
		g2.drawLine((int) (currentX + (houseWidth*0.25)), currentY + (houseHeight/4), currentX + (houseWidth/10), currentY + (houseHeight/4));
		g2.drawLine(currentX + (houseWidth/10), currentY + (houseHeight/4), currentX + (houseWidth/10), currentY + (houseHeight/14));
		// Left Window inLines
		g2.drawLine((int) (currentX + (houseWidth*0.18)), currentY + (houseHeight/14), (int) (currentX + (houseWidth*0.18)), currentY + (houseHeight/4));
		g2.drawLine(currentX + (houseWidth/10), currentY + (houseHeight/6), (int) (currentX + (houseWidth*0.25)), currentY + (houseHeight/6));
//		g2.drawLine(currentX + 25, currentY+ 40, currentX + 55, currentY + 40);
		
		// Right Window
		g2.setStroke(Stroke);
		// Right Window Outlines
		g2.drawLine((int) (currentX + (houseWidth/2) + (houseWidth*0.23)), currentY + (houseHeight/14), (int) (currentX + (houseWidth/2) + (houseWidth*0.38)), currentY + (houseHeight/14));
		g2.drawLine((int) (currentX + (houseWidth/2) + (houseWidth*0.38)), currentY + (houseHeight/14), (int) (currentX + (houseWidth/2) + (houseWidth*0.38)), currentY + (houseHeight/4));
		g2.drawLine((int) (currentX + (houseWidth/2) + (houseWidth*0.38)), currentY + (houseHeight/4), (int) (currentX + (houseWidth/2) + (houseWidth*0.23)), currentY + (houseHeight/4));
		g2.drawLine((int) (currentX + (houseWidth/2) + (houseWidth*0.23)), currentY + (houseHeight/4), (int) (currentX + (houseWidth/2) + (houseWidth*0.23)), currentY + (houseHeight/14));
		// Right Window inLines	
		g2.drawLine((int) (currentX + (houseWidth/2) + (houseWidth*0.3)), currentY + (houseHeight/14), (int) (currentX + (houseWidth/2) + (houseWidth*0.3)), currentY + (houseHeight/4));
		g2.drawLine((int) (currentX + (houseWidth/2) + (houseWidth*0.23)), currentY + (houseHeight/6), (int) (currentX + (houseWidth/2) + (houseWidth*0.38)), currentY + (houseHeight/6));
//		g2.drawLine(currentX + 145, currentY+ 25, currentX + 175, currentY + 25);
//		g2.drawLine(currentX + 145, currentY+ 40, currentX + 175, currentY + 40);
	}
	// end of drawWindow()
	
}// end of class House

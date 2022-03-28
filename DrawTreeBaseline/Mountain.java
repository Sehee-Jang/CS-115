package DrawTreeBaseline;

import java.awt.Color;
import java.awt.Graphics2D;

public class Mountain  extends LandscapeObject{

	//Attributes
	private int levels;
	private String shape = "";
	private Color mountainColor;																	
	private int mountainWidth = 200;								
	private int mountainHeight = 250;	
	
	//Constructor
	public Mountain(Graphics2D g2, int x, int y, double scale, String shape) {
		super(g2, x, y, scale);
		this.shape = shape;
	}
	
	//Methods
	public void draw() {
		applyScale();
		drawMountain();
	}

	public void applyScale() {
		switch(this.shape) {
		case "SMALL":
			mountainWidth = (int)(mountainWidth * .8);
			mountainHeight = (int)(mountainHeight * .8);
			g2.setColor(Color.decode("#2c7f0f"));
			break;
		case "MEDIUM":
			mountainWidth = (int)(mountainWidth * 1.2);
			mountainHeight = (int)(mountainHeight * 1.2);
			g2.setColor(Color.decode("#eb9a5e"));
			break;
		case "LARGE":
			mountainWidth = (int)(mountainWidth * 1.5);
			mountainHeight = (int)(mountainHeight * 1.5);
			g2.setColor(Color.decode("#528c0d"));
			break;
		default:
			System.out.printf("Internal Error: Invalid Mountain Shape: %s\n", shape);
		}//end of switch
	}
	
	public void drawMountain() {
		g2.setColor(mountainColor);
		int [] x = {currentX, currentX + (mountainWidth/2), currentX + mountainWidth};
		int [] y = {currentY, currentY - mountainHeight, currentY};
		g2.fillPolygon(x, y, 3);
	}
}// end of Mountain

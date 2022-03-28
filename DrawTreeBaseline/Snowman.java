package DrawTreeBaseline;

import java.awt.Color;
import java.awt.Graphics2D;

public class Snowman extends LandscapeObject{

	//Attributes
	private Color bodyColor;
	private int headWidth = 20;
	private int headHeight = 20;
	private int bodyWidth = 40;
	private int bodyHeight = 40;
	
	//Constructor
	public Snowman(Graphics2D g2, int x, int y, double scale, String bodyColor) {
		super(g2, x, y, scale);
		this.bodyColor = new Color(Integer.parseInt(bodyColor,16));
		// TODO Auto-generated constructor stub
	}

	
	//Methods
	public void draw() {
		drawFace();
		drawBody();
	}// end of draw()


	public void applyScale() {
		headWidth = headWidth * 2;
		headHeight = headHeight * 2;
		bodyWidth = bodyWidth * 2;
		bodyHeight = bodyHeight * 2;				
	}// end of applyScale()
	
	public void drawFace() {
		g2.fillOval(currentX, currentY, headWidth, headHeight);
	}
	public void drawBody() {
		g2.fillOval(currentX, currentY, bodyWidth, bodyHeight);
	}
}// end of Snowman class

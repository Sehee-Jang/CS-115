package DrawTreeBaseline;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

public class Mickey extends LandscapeObject{
	//Attributes
	private String gender = "";
	private String shape = "";
	private int hatWidth = 50;
	private int hatHeight = 50;
	private int headWidth = 100;
	private int headHeight = 100;
	private int bodyWidth = 100;
	private int bodyHeight = 100;
	private int petalWidth = 20;
	private int petalHeight = 20;
	private BasicStroke Stroke = new BasicStroke(1);
	private BasicStroke DressStroke = new BasicStroke(4);
	
	
	//Constructor
	public Mickey(Graphics2D g2, int x, int y, double scale, String gender, String shape) {
		super(g2, x, y, scale);
		this.gender = gender;
		this.shape = shape;
	}// end of Constructor

	//Methods
	public void draw() {
		applyScale();
		drawBody();
		drawHead();
	}// end of draw()
	
	public void applyScale() {
			
		switch(this.shape) {
		case "SMALL":
			headWidth = (int)(headWidth * .5);
			headHeight = (int)(headHeight * .5);
			hatWidth = (int)(hatWidth * .5);
			hatHeight = (int)(hatHeight * .5);
			bodyWidth = (int)(bodyWidth * .5);
			bodyHeight = (int)(bodyHeight * .5);
			petalWidth = (int)(petalWidth *.5);
			petalHeight = (int)(petalHeight *.5);
			break;
		case "MEDIUM":
			headWidth = (int)(headWidth * .83);
			headHeight = (int)(headHeight * .83);
			hatWidth = (int)(hatWidth * .83);
			hatHeight = (int)(hatHeight * .83);
			bodyWidth = (int)(bodyWidth * .83);
			bodyHeight = (int)(bodyHeight * .83);
			petalWidth = (int)(petalWidth * .83);
			petalHeight = (int)(petalHeight * .83);
			break;
		case "BIG":
			headWidth = (int)(headWidth * 1.5);
			headHeight = (int)(headHeight * 1.5);
			hatWidth = (int)(hatWidth * 1.5);
			hatHeight = (int)(hatHeight * 1.5);
			bodyWidth = (int)(bodyWidth * 1.5);
			bodyHeight = (int)(bodyHeight * 1.5);
			petalWidth = (int)(petalWidth *1.5);
			petalHeight = (int)(petalHeight *1.5);
			break;
		default:
			System.out.printf("Internal Error: Invalid Tree Shape: %s\n", shape);
		}//end of switch
	}// end of applyScale()

	private void drawHead() {
		//Draw Face
		g2.setColor(Color.DARK_GRAY);
		g2.fillOval(currentX, currentY, headWidth, headHeight);
		
		//Draw Ears
		g2.setColor(Color.DARK_GRAY);
		g2.fillOval(currentX - (headWidth/5), currentY - (headHeight/5), headWidth/2, headHeight/2);
		g2.fillOval(currentX + headWidth - (headWidth/3), currentY - (headHeight/5), headWidth/2, headHeight/2);
		
		//Draw Decoration
		switch(this.gender) {
		case "MAN":
			g2.setColor(Color.decode("#ebd95e"));
			int [] x = {currentX + (hatWidth/4), currentX + (hatWidth/5), currentX + (hatWidth/2) + (hatWidth/2)};
			int [] y = {currentY + (hatHeight/2) - (hatHeight/5), currentY - hatHeight, currentY - (hatHeight/8) + (hatHeight/5)};
			g2.fillPolygon(x, y, 3);
			g2.setColor(Color.WHITE);
			g2.fillOval(currentX + (hatWidth/7), currentY -hatHeight, hatWidth/6, hatHeight/6);
			g2.setColor(Color.decode("#ebd95e"));
			g2.drawOval(currentX + (hatWidth/7), currentY -hatHeight, hatWidth/6, hatHeight/6);
			break;
		case "WOMAN":
			g2.setColor(Color.RED);
			g2.fillOval(currentX, currentY, petalWidth/2, petalHeight/2);
			g2.fillOval(currentX, currentY + petalWidth/2, petalWidth/2, petalHeight/2);
			g2.fillOval(currentX + petalWidth/2, currentY, petalWidth/2, petalHeight/2);
			g2.fillOval(currentX + petalWidth/2, currentY + petalHeight/2, petalWidth/2, petalHeight/2);
			//Draw Flower Center
			g2.setColor(Color.WHITE);
			RoundRectangle2D.Double flowerCenter = new RoundRectangle2D.Double(currentX + petalWidth/3, currentY + petalHeight/3, petalWidth/3, petalHeight/3, 5, 5);
			Double centerX = flowerCenter.getCenterX();
			Double centerY = flowerCenter.getCenterY();
			g2.rotate(40, centerX, centerY);
			g2.fill(flowerCenter);
			g2.setColor(Color.BLACK);
			g2.setStroke(Stroke);
			g2.draw(flowerCenter);
			g2.rotate(-40, centerX, centerY); // Return rotate
			
			break;
		default:
			System.out.printf("Internal Error: Invalid Tree Shape: %s\n", shape);
		}// end of switch
						
		//Face
		g2.setColor(Color.WHITE);
		g2.fillOval(currentX + (headWidth/6), currentY + 10, headWidth/3, headHeight/2);
		g2.fillOval(currentX + (headWidth/2), currentY + 10 , headWidth/3, headHeight/2);
		g2.fillOval(currentX + (headWidth/10), currentY + (headHeight/2), (int) (headWidth*.8), headHeight/3);
		
		//EYES
		g2.setColor(Color.DARK_GRAY);
		g2.fillOval(currentX + (headWidth/3), currentY + (headHeight/4), headWidth/8, headHeight/4); 
		g2.fillOval(currentX + (headWidth/3) + (headWidth/5), currentY + (headHeight/4), headWidth/8, headHeight/4);
		
		//Nose
		g2.fillOval(currentX + (headWidth/3), currentY + (headHeight/2), headWidth/3, headHeight/6);
		
		//MOUTH
		g2.drawArc(currentX + (headWidth/4), currentY + (headHeight/2), headWidth/2, headHeight/4, 0, -180);
		}// end of drawHead()	
	
	private void drawBody() {
		//LEFT HAND
		g2.setColor(Color.DARK_GRAY);
		RoundRectangle2D.Double Lhand = new RoundRectangle2D.Double(currentX, currentY + (headHeight*0.8), bodyWidth/2.5, bodyHeight/3, 60, 60);
		Double LcenterX = Lhand.getCenterX();
		Double LcenterY = Lhand.getCenterY();
		g2.rotate(87, LcenterX, LcenterY);
		g2.fill(Lhand);
		g2.rotate(-87, LcenterX, LcenterY); //reset the rotate
		
		//RIGHT HAND
		g2.setColor(Color.DARK_GRAY);
		RoundRectangle2D.Double Rhand = new RoundRectangle2D.Double(currentX + headWidth - (headWidth*0.4), currentY + (headHeight*0.8), bodyWidth/2.5, bodyHeight/3, 60, 60);
		Double RcenterX = Rhand.getCenterX();
		Double RcenterY = Rhand.getCenterY();
		g2.rotate(70, RcenterX, RcenterY);
		g2.fill(Rhand);
		g2.rotate(-70, RcenterX, RcenterY); //reset the rotate
				
		//BODY
		g2.setColor(Color.DARK_GRAY);
		g2.fillOval(currentX + (headWidth/10), currentY + headHeight - (headHeight/3), (int) (bodyWidth*.8), (int) (bodyHeight*.9));

		//Cloth
		switch(this.gender) {
		case "MAN":
			g2.setColor(Color.RED);
			g2.fillArc(currentX + (headWidth/10), currentY + (bodyHeight/2) + (bodyHeight/10), (int) (bodyWidth*.8), bodyHeight, 0, -180);
			break;
		case "WOMAN":
			//Draw Skirt
			g2.setColor(Color.RED);
			int [] x = {currentX-(bodyWidth/20), currentX + (bodyWidth/2), currentX + (bodyWidth/2) + (bodyWidth/2) + (bodyWidth/20)};
			int [] y = {currentY + headHeight + (bodyHeight/2), currentY, currentY + headHeight + (bodyHeight/2)};
			g2.fillPolygon(x, y, 3);
			
			//Draw Shirt
			g2.setColor(Color.WHITE);
			g2.fillArc(currentX + (headWidth/10), currentY + (bodyHeight/2) + (bodyHeight/10), (int) (bodyWidth*.8), bodyHeight, 0, 180);
			
			//Draw Suspender
			g2.setColor(Color.RED);
			g2.setStroke(DressStroke);
			g2.drawLine(currentX + (headWidth/4), currentY + (headHeight/2), currentX + (headWidth/4), (int) (currentY + (headHeight*1.5)));
			g2.drawLine(currentX + (headWidth/4) + (headWidth/2), currentY + (headHeight/2), currentX + (headWidth/4) + (headWidth/2), (int) (currentY + (headHeight*1.5)));
			break;
		default:
			System.out.printf("Internal Error: Invalid Tree Shape: %s\n", shape);
		}// end of switch
		
		//LEGS
		g2.setColor(Color.YELLOW);
		g2.fillOval(currentX + (headWidth/10), currentY + (headHeight/3) + (headHeight/8) + (bodyHeight), bodyWidth/3, bodyHeight/4);
		g2.fillOval(currentX + (headWidth/3) + (headWidth/4), currentY + (headHeight/3) + (headHeight/8) + (bodyHeight), bodyWidth/3, bodyHeight/4);		
	}// end of drawBody()


	
}// end of Class Mickey

package DrawTreeBaseline;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

public class Pooh extends LandscapeObject{
	//Attributes
	private String shape = "";
	private String direc = "";
	private int headWidth = 80;
	private int headHeight = 80;
	private int bodyWidth = 100;
	private int bodyHeight = 100;
	private int petalWidth = 20;
	private int petalHeight = 20;
	private BasicStroke Stroke = new BasicStroke(1);
	
	
	//Constructor
	public Pooh(Graphics2D g2, int x, int y, double scale, String shape, String direc) {
		super(g2, x, y, scale);
		this.shape = shape;
		this.direc = direc;
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
			bodyWidth = (int)(bodyWidth * .5);
			bodyHeight = (int)(bodyHeight * .5);
			petalWidth = (int)(petalWidth *.5);
			petalHeight = (int)(petalHeight *.5);
			break;
		case "MEDIUM":
			headWidth = (int)(headWidth * 1);
			headHeight = (int)(headHeight * 1);
			bodyWidth = (int)(bodyWidth * 1);
			bodyHeight = (int)(bodyHeight * 1);
			petalWidth = (int)(petalWidth *1);
			petalHeight = (int)(petalHeight *1);
			break;
		case "BIG":
			headWidth = (int)(headWidth * 1.5);
			headHeight = (int)(headHeight * 1.5);
			bodyWidth = (int)(bodyWidth * 1.5);
			bodyHeight = (int)(bodyHeight * 1.5);
			petalWidth = (int)(petalWidth *1.5);
			petalHeight = (int)(petalHeight *1.5);
			break;
		default:
			System.out.printf("Internal Error: Invalid Pooh Shape: %s\n", shape);
		}//end of switch
	}// end of applyScale()

	private void drawHead() {
		switch(this.direc) {
		case "FRONT":
			ears();
			face();
			eyes();
			nose();
			mouth();
			break;		
		case "BACK":
			ears();
			face();
			break;
		case "SIDE":	
			face();
			earSide();
			eyeSide();
			noseSide();
			break;
		case "SIDE2":	
			face();
			earSide2();
			eyeSide2();
			noseSide2();
			break;
		default:
			System.out.printf("Internal Error: Invalid Pooh direc: %s\n", direc);
		}// end of switch
		
		}// end of drawHead()	
	
	private void drawBody() {
		switch(this.direc) {
		case "FRONT":
			hands();
			body();
			legs();
			break;		
		case "BACK":
			hands();
			legs();
			body();	
			break;
		case "SIDE":
			legSide();
			body();
			handSide();
			break;
		case "SIDE2":
			legSide2();
			body();
			handSide2();
			break;
		default:
			System.out.printf("Internal Error: Invalid Pooh direc: %s\n", direc);
		}// end of switch
		
	}// end of drawBody()

	private void eyes() {
		g2.setColor(Color.BLACK);
		g2.fillOval(currentX + (headWidth/4), (int) (currentY + (headHeight/2.5)), headWidth/8, headHeight/8); 
		g2.fillOval(currentX + (headWidth/2) + (headWidth/8), (int) (currentY + (headHeight/2.5)), headWidth/8, headHeight/8);	
	}// end of eyes
	
	private void eyeSide() {
		g2.setColor(Color.BLACK);
		g2.fillOval(currentX + (headWidth/2) + (headWidth/4), (int) (currentY + (headHeight/2.5)), headWidth/8, headHeight/8);	
	}// end of eyeSide()
	
	private void eyeSide2() {
		g2.setColor(Color.BLACK);
		g2.fillOval(currentX + (headWidth/5), (int) (currentY + (headHeight/2.5)), headWidth/8, headHeight/8);	
	}// end of eyeSide2()
	
	private void nose() {
		g2.fillOval((int) (currentX + (headWidth/2.5)), (int) (currentY + (headHeight/1.8)), headWidth/5, headHeight/8);
	}// end of nose()
	
	private void noseSide() {
		g2.fillOval((int) (currentX + (headWidth*0.9)), (int) (currentY + (headHeight/1.8)), headWidth/8, headHeight/7);
	}// end of noseSide()
	
	private void noseSide2() {
		g2.fillOval(currentX - (headWidth/25), (int) (currentY + (headHeight/1.8)), headWidth/8, headHeight/7);
	}// end of noseSide2()
	
	private void ears() {
		g2.setColor(Color.decode("#FAA510"));
		g2.fillOval(currentX, currentY - (headHeight/6), headWidth/3, headHeight/3);
		g2.fillOval(currentX + headWidth - (headWidth/3), currentY - (headHeight/6), headWidth/3, headHeight/3);
		
		g2.setColor(Color.BLACK);
		g2.drawOval(currentX, currentY - (headHeight/6), headWidth/3, headHeight/3);
		g2.drawOval(currentX + headWidth - (headWidth/3), currentY - (headHeight/6), headWidth/3, headHeight/3);
	}// end of ears()
	
	
	private void mouth() {
		g2.drawArc(currentX + (headWidth/4), currentY + (headHeight/2), headWidth/2, headHeight/4, 0, -180);	
	}// end of mouth()
	
	private void earSide() {
		g2.setColor(Color.decode("#FAA510"));
		g2.fillOval(currentX + (headWidth/3), currentY - (headHeight/6), headWidth/3, headHeight/3);
		g2.setColor(Color.BLACK);
		g2.drawOval(currentX + (headWidth/3), currentY - (headHeight/6), headWidth/3, headHeight/3);
		
		g2.setColor(Color.decode("#FAA510"));
		g2.fillOval((int) (currentX + (headWidth/3.5)), currentY - (headHeight/8), headWidth/3, headHeight/3);
		g2.setColor(Color.BLACK);
		g2.drawOval((int) (currentX + (headWidth/3.5)), currentY - (headHeight/8), headWidth/3, headHeight/3);
	}// end of earSide()
	
	private void earSide2() {
		g2.setColor(Color.decode("#FAA510"));
		g2.fillOval((int) (currentX + (headWidth/3.5)), currentY - (headHeight/6), headWidth/3, headHeight/3);
		g2.setColor(Color.BLACK);
		g2.drawOval((int) (currentX + (headWidth/3.5)), currentY - (headHeight/6), headWidth/3, headHeight/3);
	
		g2.setColor(Color.decode("#FAA510"));
		g2.fillOval(currentX + (headWidth/4), currentY - (headHeight/8), headWidth/3, headHeight/3);
		g2.setColor(Color.BLACK);
		g2.drawOval(currentX + (headWidth/4), currentY - (headHeight/8), headWidth/3, headHeight/3);
		
	}// end of earSide2()
	
	private void face() {
		g2.setColor(Color.decode("#FAA510"));
		g2.fillOval(currentX, currentY, headWidth, headHeight);	
			
		g2.setColor(Color.BLACK);
		g2.drawOval(currentX, currentY, headWidth, headHeight);
	}// end of face()
	
	private void hands() {
		//LEFT HAND
		g2.setColor(Color.decode("#FAA510"));
		RoundRectangle2D.Double Lhand = new RoundRectangle2D.Double(currentX - (headHeight/6), currentY + (headHeight*0.9), bodyWidth/2, bodyHeight/3, 60, 60);
		Double LcenterX = Lhand.getCenterX();
		Double LcenterY = Lhand.getCenterY();
		g2.rotate(87, LcenterX, LcenterY);
		g2.fill(Lhand);
		g2.setColor(Color.BLACK);
		g2.draw(Lhand);
		g2.rotate(-87, LcenterX, LcenterY); //reset the rotate
		
		//RIGHT HAND
		g2.setColor(Color.decode("#FAA510"));
		RoundRectangle2D.Double Rhand = new RoundRectangle2D.Double(currentX + (headHeight*0.6), currentY + (headHeight*0.9), bodyWidth/2, bodyHeight/3, 60, 60);
		Double RcenterX = Rhand.getCenterX();
		Double RcenterY = Rhand.getCenterY();
		g2.rotate(70, RcenterX, RcenterY);
		g2.fill(Rhand);
		g2.setColor(Color.BLACK);
		g2.draw(Rhand);
		g2.rotate(-70, RcenterX, RcenterY); //reset the rotate
	}// end of hands()
	
	private void handSide() {
		g2.setColor(Color.decode("#FAA510"));
		RoundRectangle2D.Double Rhand = new RoundRectangle2D.Double(currentX + (headHeight*0.2), currentY + (headHeight*0.9), bodyWidth/2, bodyHeight/3, 60, 60);
		Double RcenterX = Rhand.getCenterX();
		Double RcenterY = Rhand.getCenterY();
		g2.rotate(70, RcenterX, RcenterY);
		g2.fill(Rhand);
		g2.setColor(Color.BLACK);
		g2.draw(Rhand);
		g2.rotate(-70, RcenterX, RcenterY); //reset the rotate
	}// end of handSide()
	
	private void handSide2() {
		g2.setColor(Color.decode("#FAA510"));
		RoundRectangle2D.Double Rhand = new RoundRectangle2D.Double(currentX + (headHeight*0.2), currentY + (headHeight*0.9), bodyWidth/2, bodyHeight/3, 60, 60);
		Double RcenterX = Rhand.getCenterX();
		Double RcenterY = Rhand.getCenterY();
		g2.rotate(90, RcenterX, RcenterY);
		g2.fill(Rhand);
		g2.setColor(Color.BLACK);
		g2.draw(Rhand);
		g2.rotate(-90, RcenterX, RcenterY); //reset the rotate
	}// end of handSide2()
	
	private void body() {
		g2.setColor(Color.decode("#FAA510"));
		g2.fillOval(currentX, currentY + headHeight - (headHeight/3), (int) (bodyWidth*.8), (int) (bodyHeight*.9));

		g2.setColor(Color.BLACK);
		g2.drawOval(currentX, currentY + headHeight - (headHeight/3), (int) (bodyWidth*.8), (int) (bodyHeight*.9));

		//CLOTH
		g2.setColor(Color.decode("#FC0312"));
		g2.fillArc(currentX, currentY + (bodyHeight/2), (int) (bodyWidth*.8), (int) (bodyHeight*.9), 0, 180);
		
		g2.setColor(Color.BLACK);
		g2.drawArc(currentX, currentY + (bodyHeight/2), (int) (bodyWidth*.8), (int) (bodyHeight*.9), 0, 180);
	}// end of body()
	
	private void legs() {
		g2.setColor(Color.decode("#FAA510"));
		g2.fillOval(currentX, currentY + (headHeight/3)+ (bodyHeight), bodyWidth/3, bodyHeight/4);
		g2.fillOval(currentX + (headWidth/3) + (headWidth/4), currentY + (headHeight/3) + (bodyHeight), bodyWidth/3, bodyHeight/4);		
	
		g2.setColor(Color.BLACK);
		g2.drawOval(currentX, currentY + (headHeight/3)+ (bodyHeight), bodyWidth/3, bodyHeight/4);
		g2.drawOval(currentX + (headWidth/3) + (headWidth/4), currentY + (headHeight/3) + (bodyHeight), bodyWidth/3, bodyHeight/4);		
	}// end of legs()
	
	private void legSide() {	
		g2.setColor(Color.decode("#FAA510"));
		g2.fillOval(currentX + (bodyWidth/4), currentY + (bodyWidth/3)+ (bodyHeight), bodyWidth/3, bodyHeight/4);
		g2.setColor(Color.BLACK);
		g2.drawOval(currentX + (bodyWidth/4), currentY + (bodyWidth/3)+ (bodyHeight), bodyWidth/3, bodyHeight/4);
	
		g2.setColor(Color.decode("#FAA510"));
		g2.fillOval(currentX + (bodyWidth/5), currentY + (bodyWidth/3)+ (bodyHeight), bodyWidth/3, bodyHeight/4);
		g2.setColor(Color.BLACK);
		g2.drawOval(currentX + (bodyWidth/5), currentY + (bodyWidth/3)+ (bodyHeight), bodyWidth/3, bodyHeight/4);
	}// end of legSide()
	
	
	private void legSide2() {
		g2.setColor(Color.decode("#FAA510"));
		g2.fillOval(currentX + (bodyWidth/5), currentY + (bodyWidth/3)+ (bodyHeight), bodyWidth/3, bodyHeight/4);
		g2.setColor(Color.BLACK);
		g2.drawOval(currentX + (bodyWidth/5), currentY + (bodyWidth/3)+ (bodyHeight), bodyWidth/3, bodyHeight/4);
		
		g2.setColor(Color.decode("#FAA510"));
		g2.fillOval(currentX + (bodyWidth/4), currentY + (bodyWidth/3)+ (bodyHeight), bodyWidth/3, bodyHeight/4);
		g2.setColor(Color.BLACK);
		g2.drawOval(currentX + (bodyWidth/4), currentY + (bodyWidth/3)+ (bodyHeight), bodyWidth/3, bodyHeight/4);
	}// end of legSide2()
	
}// end of Class Pooh



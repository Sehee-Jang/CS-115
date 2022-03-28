package Classroom;

public class Shirt {
	
	enum Size {
		XSAMLL,
		SMALL,
		MEDIUM,
		LARGE,
		XL,
		XXL
	}// end of ENUM Size
	
	//Attributes
	String color;
	Size shirtSize;
	
	//Constructors
	public Shirt(String c, Size s) {
		color = c;
		shirtSize = s;
	}// end of Constructors
	
	//methods
	public String getColor() {
		return color;
	}// end of getColor
	
	public Size getShirtSize() {
		return shirtSize;
	}// end of getShirtSize
	
	public void setColor(String c) {
		color = c;
	}// end of setColor(String)
	
	public void setshirtSize(Size s) {
		shirtSize = s;
	}// end of SetshirtSize(String)
	
	public String toString() {
		String answer = String.format("New Shirt:  Color#%s     Size: %s", color, shirtSize.name());
		return answer;
	}
	
	Shirt s = new Shirt("Green", Size.XL);
}// end of Shirt

	
package week2;

public class Calculator {
	// Attributes
	private double result;
	private char operator;

	// Constructor
	public Calculator() {
		result = 0.0;
		operator = '0';
	}// end of constructor Calculator()

	// Method
	public Double getResult() {
		return result;
	}// end of getResult()

	// Mutators
	public void add(double num1, double num2) {
		result = num1 + num2;
		
	}// end of add()

	public void subtract(double num1, double num2) {
		result = num1 - num2;
	}// end of add()

	public void multiply(double num1, double num2) {
		result = num1 * num2;
	}// end of add()

	public void divide(double num1, double num2) {
		result = num1 / num2;
	}// end of add()
	
}//end of class

package week2;

import java.util.Scanner;

public class Calculator2 {
	// Attributes
	private double result;
	private char operator;

	// Constructor
	public Calculator2() { 
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
	
	private void setOperator(char operator) {
		this.operator = operator;
	}
	
	private char getOperator() {
		return operator;
	}
	
	public void calc() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the operator (+, -, *, /): ");
		char inChar = in.nextLine().charAt(0);
		
		System.out.printf("%nPlease enter the first number: ");
		String input1 = in.nextLine();
		Double num1 = Double.parseDouble(input1);
		
		System.out.printf("%nPlease enter the second number: ");
		String input2 = in.nextLine();
		Double num2 = Double.parseDouble(input2);

		if(inChar == '+') {
			setOperator(inChar);
			add(num1, num2);
		} else if(inChar == '-') {
			setOperator(inChar);
			subtract(num1, num2);
		} else if(inChar == '*') {
			setOperator(inChar);
			multiply(num1, num2);
		} else {
			setOperator(inChar);
			divide(num1, num2);
		}//end of if/else

		System.out.printf("%nAnswer: %.1f", result);

		in.close();
	}//end of calc()
}//end of class

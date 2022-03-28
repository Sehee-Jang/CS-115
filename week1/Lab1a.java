/*
 * Program: Final Exam 2
 * Name: Sehee Jang
 * Date: Jan 11 2020
 * Instructor: Jeffrey Light
 * Description: 
 */
package week1;

import java.util.Scanner;
import java.util.ArrayList;


public class Lab1a {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner sIn = new Scanner(System.in); //Input Scanner for String
		String ans = "";
		int num = 0;
		boolean loopC = true;

		// Describe the program to user
		System.out.println("In this program, you will ask the user to enter a list of numbers.\n"
				+ "The program will then find the sum of the numbers and determine which of the numbers is the largest.");

		while (loopC) {
			System.out.print("Please enter a number or just hit enter to finish: "); // ask user to enter a number
			ans = sIn.nextLine();

			if (ans.equals("")) {
				loopC = false; //If the user just hits enter, leave the program. 
			} else {
				try {
					num = (int) Integer.parseInt(ans);
					numbers.add(num);
				} catch (Exception e) {
					System.out.println("Invalid response. Please enter a valid whole number.\n");
				}
			}
		} // end of while
		
		System.out.println("The sum of the list of numbers is: " + addNumbers(numbers));
		System.out.println("The largest number in the list is: " + largestNumber(numbers));
		
		sIn.close(); // close the scanner
	} // end of main

	public static int addNumbers(ArrayList<Integer> numbers) {
		int totalValue = 0;
		for (int i = 0; i < numbers.size(); i++) {
			totalValue = totalValue + numbers.get(i);
		}
		return totalValue; // return the result of sumValues
	} // end of sumValues
	
	public static int largestNumber(ArrayList<Integer> numbers) {
		int result = 0;															
		for (int i = 0; i < numbers.size(); i++) {								
			result = (int) Math.max(result, numbers.get(i)); 
		}
		return result; // return the result of largest					
	} // end of largest

} // end of class

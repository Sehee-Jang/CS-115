package Classroom;

import java.util.ArrayList;
import java.util.Collections;
import Classroom.w6_Hireable.payGrade;
import java.util.Scanner;


public class w6_RunPayRoll2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<w6_Employee> employees = new ArrayList<w6_Employee>();

		w6_PartTime p1 = new w6_PartTime("Mary", 45309, 16, payGrade.ENTRY, 14.50, 65);
		w6_PartTime p2 = new w6_PartTime("Bob", 45310, 42, payGrade.ENTRY, 18.75, 80);
		w6_PartTime p3 = new w6_PartTime("Valya", 45311, 29, payGrade.ENTRY,  6000, 80);

		w6_Salaried s1 = new w6_Salaried("Henry", 55654, 64, payGrade.MASTER,  45100, .00);
		w6_Salaried s2 = new w6_Salaried("Prya", 55654, 24, payGrade.STANDARD, 157300, .10);
		w6_Salaried s3 = new w6_Salaried("Erik", 55654, 23, payGrade.SENIOR, 85400, .02);
		w6_Salaried s4 = new w6_Salaried("Grace", 55654, 32, payGrade.STANDARD, 66950, .03);
		
		employees.add(p1);
		employees.add(p2);
		employees.add(p3);

		employees.add(s1);
		employees.add(s2);
		employees.add(s3);
		employees.add(s4);
		
/*		02/12/21
		for(w6_Employee e : employees) {
			System.out.println(e);
		}
*/

		for(w6_Employee e : employees) {
			 if (e instanceof w6_Salaried){
				 System.out.println(e.getName());
				 System.out.println(((w6_Salaried) e).getSalary());
			 } else if (e instanceof w6_PartTime) {
				 System.out.println(e.getName());
				 System.out.println(((w6_PartTime) e).getHourlyWage());			 
			 }
			 System.out.println(e);
		}// end of for loop
			
		if(s1.isSameAs(s2)) {
			System.out.println("They are the SAME!");
		} else {
			System.out.println("They are different.");
		}
		
/*02/09/11		
		boolean valid = false;
		while(!valid) {
			System.out.println("Please enter a pay grade for employee s2: ");
			String answer = in.nextLine();
			
			for (w6_Hireable.payGrade value : w6_Hireable.payGrade.values()) {
				if (answer.equalsIgnoreCase(value.name())) {
					valid = true;
				}// end of if
			}// end of for
			if(!valid) {
				System.out.printf("%s is not a valid pay grade. Please choose from ENTRY, STANDARD, SENIOR, or MASTER.\n", answer);	
			}// end of if not valid
		}// end of for while !valid
*/
		
/*
		if(p1.compareTo(p2) == 1) {
			System.out.println("p1 is greater than p2.");
		}else if (p1.compareTo(p2) == -1) {
			System.out.println("p2 is greater than p1.");
		}
*/
		Collections.sort(employees); //sort ArrayList
		
		System.out.println("Now they are sorted\n\n\n");
		for(w6_Employee e : employees) {
			System.out.println(e);
		}
		
/*
 * ex01
 *		for (Employee e : employees) {
 *			System.out.printf("%-15s%.2f%n", e.getName(), e.calculatePayCheck());
 *		} // end of for
 *		
 *  ex02
 *		for (Employee e : employees) {
 *			System.out.println(e);
 *		} // end of for
 */
	}// end of main()
}// end of RunPayRpll

package Classroom;

import java.util.ArrayList;
import java.util.Collections;
import Classroom.w7_Hireable.payGrade;
import java.util.Scanner;


public class w7_RunPayRoll {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<w7_Employee> employees = new ArrayList<w7_Employee>();

		w7_PartTime p1 = new w7_PartTime("Mary", 16, payGrade.ENTRY, 14.50, 65);
		w7_PartTime p2 = new w7_PartTime("Bob", 42, payGrade.ENTRY, 18.75, 80);
		w7_PartTime p3 = new w7_PartTime("Valya", 29, payGrade.ENTRY,  6000, 80);

		w7_Salaried s1 = new w7_Salaried("Henry", 64, payGrade.MASTER,  45100, .00);
		w7_Salaried s2 = new w7_Salaried("Prya", 24, payGrade.STANDARD, 157300, .10);
		w7_Salaried s3 = new w7_Salaried("Erik", 23, payGrade.SENIOR, 85400, .02);
		w7_Salaried s4 = new w7_Salaried("Grace", 32, payGrade.STANDARD, 66950, .03);
		
		employees.add(p1);
		employees.add(p2);
		employees.add(p3);

		employees.add(s1);
		employees.add(s2);
		employees.add(s3);
		employees.add(s4);
		


		for(w7_Employee e : employees) {
			 if (e instanceof w7_Salaried){
				 System.out.println(e.getName());
				 System.out.println(((w7_Salaried) e).getSalary());
			 } else if (e instanceof w7_PartTime) {
				 System.out.println(e.getName());
				 System.out.println(((w7_PartTime) e).getHourlyWage());			 
			 }
			 System.out.println(e);
		}// end of for loop
			
		if(s1.isSameAs(s2)) {
			System.out.println("They are the SAME!");
		} else {
			System.out.println("They are different.");
		}

		Collections.sort(employees); //sort ArrayList
		
		System.out.println("Now they are sorted\n\n\n");
		for(w7_Employee e : employees) {
			System.out.println(e);
		}
		
	}// end of main()
}// end of RunPayRpll

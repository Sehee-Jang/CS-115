package Classroom;

import java.util.ArrayList;

public class RunPayRoll {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();

		PartTime p1 = new PartTime("Mary", 45309, 16, 14.50, 65);
		PartTime p2 = new PartTime("Bob", 45310, 42, 18.75, 80);
		PartTime p3 = new PartTime("Valya", 45311, 29, 6000, 80);

		Salaried s1 = new Salaried("Henry", 55654, 64, 45100, .00);
		Salaried s2 = new Salaried("Prya", 55654, 24, 157300, .10);
		Salaried s3 = new Salaried("Erik", 55654, 23, 85400, .02);
		Salaried s4 = new Salaried("Grace", 55654, 32, 66950, .03);
		
		employees.add(p1);
		employees.add(p2);
		employees.add(p3);

		employees.add(s1);
		employees.add(s2);
		employees.add(s3);
		employees.add(s4);
/*
		for (Employee e : employees) {
			System.out.printf("%-15s%.2f%n", e.getName(), e.calculatePayCheck());
		} // end of for
*/		
		for (Employee e : employees) {
			System.out.println(e);
		} // end of for
		
	}// end of main()
}// end of RunPayRpll

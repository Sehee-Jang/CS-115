package Classroom;

import java.util.ArrayList;
import java.util.Scanner;

public class EnrollPatient {

	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		ArrayList<Person> patients = new ArrayList<Person>();
		String input;

		boolean done = false;

		while (!done) {

			System.out.print("\n\n\nPlease enter a patient's name or <Enter> when done: ");
			String name = in.nextLine();
			if (name.equals("")) {
				done = true;
			} else {

				System.out.printf("%nPlease enter enter %s's age: ", name);
				input = in.nextLine();
				int age = Integer.parseInt(input);

				System.out.printf("%nPlease enter enter %s's height: ", name);
				input = in.nextLine();
				double height = Double.parseDouble(input);

				System.out.printf("Name: %s       Age: %d      Height: %.2f", name, age, height);
				Person p1 = new Person(name, age, height);
				patients.add(p1);
			} // end of if/else
		} // end of while

		for(Person p : patients) {
			System.out.printf("Name: %s       Age: %d      Height: %.2f%n", p.getName(), p.getAge(), p.getHeight());
		}
		System.out.println("Thanks for playing!");
	}// end of main()

}// end of class

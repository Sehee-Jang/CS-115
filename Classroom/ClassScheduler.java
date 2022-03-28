package Classroom;

import java.util.ArrayList;

public class ClassScheduler {
	
	public static void main(String[] args) {
		Class cs115 = new Class("CS 105", "001"); // CourseName, Section (class.Class)

		System.out.println(cs115.getClassSize());
		
		Student s1 = new Student("Sally", 22, 68, 3.9, "Math"); //public Student(String n, int a, double h, double g, String m)
		// Add student in cs115 class
		if (cs115.addStudent(s1)) {
			System.out.printf("Student '%s' added.%n", s1.getName());
		};
		
		Student s2 = new Student("Matthew", 34, 72, 3.7, "CS");
		if (cs115.addStudent(s2)) {
			System.out.printf("Student '%s' added.%n", s2.getName());
		};
		
		Student s3 = new Student("Ruby", 22, 69, 4.0, "CS");
		if (cs115.addStudent(s3)) {
			System.out.printf("Student '%s' added.%n", s3.getName());
		};
		
		Student s4 = new Student("Bob", 29, 74, 3.2, "CS");
		if (cs115.addStudent(s4)) {
			System.out.printf("Student '%s' added.%n", s4.getName());
		};
		
		System.out.println("\n\n");
		/* 01
		for(int i = 0; i < cs115.getClassSize(); i++) { // [0, 1, 2, 3]
			System.out.println(cs115.getClassRoster().get(i).getName());
		}// end of for
		
		
		//02 for each loop
		for(Student s : cs115.getClassRoster()) { // [s1, s2, s3, s4]
			System.out.println(s.getName());
		}
		*/
		
		ArrayList<String> cats = new ArrayList<String>();
		
		cats.add("Fluffy");
		cats.add("Ginger");
		cats.add("MooBear");
		cats.add("Ugly");
		
		for(int i = 0; i < cats.size(); i++) { // [0, 1, 2, 3]
			System.out.println(cats.get(i));
		}
		
		System.out.println("\n");
		
		for(String cat : cats) { // [Fluffy, Ginger, MooBear, Ugly]
			System.out.println(cat); // cat is not a number in this case.
		}
		
		
	} // end of main

}// end of class ClassScheduler

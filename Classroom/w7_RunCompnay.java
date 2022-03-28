package Classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import Classroom.w7_Hireable.payGrade;

public class w7_RunCompnay {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	ArrayList<w7_Employee> employees = new ArrayList<w7_Employee>();

	//Create Employees
	w7_PartTime p1 = new w7_PartTime("Mary", 16, payGrade.ENTRY, 14.50, 65);
	w7_PartTime p2 = new w7_PartTime("Bob", 42, payGrade.ENTRY, 18.75, 80);
	w7_PartTime p3 = new w7_PartTime("Valya", 29, payGrade.ENTRY,  12.42, 80);

	w7_Salaried s1 = new w7_Salaried("Henry", 64, payGrade.MASTER,  45100, .15);
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
	

	
	HashMap<String, w7_Employee> accounts = new HashMap<String, w7_Employee>();
	accounts.put("ACME", s1);
	accounts.put("Home Depot",  s2);
	accounts.put("KFC",  s3);
	accounts.put("Walmart", s4);
	accounts.put("Lowes",  s2);
	
	System.out.println(accounts);
	
	System.out.println("\n");
	
	System.out.println(accounts.keySet()); // [Home Depot, Walmart, Lowes, ACME, KFC]

	System.out.println("\n");
	
	for(String key : accounts.keySet()) { //keySet Array of key
		System.out.println(key);
		System.out.println(accounts.get(key)); // value
		System.out.println(accounts.get(key).getName()); // whole employee object
		System.out.printf("The accounts %s is ownd by %s.\n", key, accounts.get(key).getName().charAt(2));
		in.nextLine();
	}
/*s	
	HashMap<Integer, String> people = new HashMap<Integer, String>();
	
	people.put(100, "Bob");
	people.put(22, "Larry");
	people.put(36, "Jenny");
	
	System.out.println(people);
	
	people.put(22, "Jeff");
	
	System.out.println(people);
	System.out.println(people.get(22));
	System.out.println(people.keySet());
*/	
	//RunPayRoll(in, employees);
	
	}//end of main()
	
	
	
	public static void RunPayRoll(Scanner in, ArrayList<w7_Employee> employees) {
		Collections.sort(employees);
		
		System.out.println("Now they are sorted\n\n\n");
		for(w7_Employee e : employees) {
			System.out.println(e);
		}//end of for()
		
		//Pause
		in.nextLine();
	}
}
/*
	public static void CreateInvoice() {
		
		//Create Employees
		w7_Salaried s1 = new w7_Salaried("Henry", 64, payGrade.MASTER, 45100, .00);
		w7_Salaried s2 = new w7_Salaried("Prya", 24, payGrade.STANDARD, 157300, .10);
		w7_Salaried s3 = new w7_Salaried("Erik", 23, payGrade.SENIOR, 25400, .02);
		w7_Salaried s4 = new w7_Salaried("Grace", 32, payGrade.STANDARD, 66950, .03);
		
		w7_Invoice i1 = new_Invoice("ACME Server Installation", s2);
	}// end of CreateInvoice
*/
/**
 * Module: 
 * Assignment:
 * @author SeheeJang
 * @since 02/11/2021
 */
package Classroom;

import java.util.ArrayList;
import Classroom.w6_Hireable.payGrade;

public abstract class w6_Employee implements w6_Hireable, Comparable<w6_Employee>, w6_SameEmployee<w6_Employee>{
	// Attributes
	private String name;
	private int ID;
	private int age;
	private String hireDate;
	private boolean exemptStatus;
	private payGrade grade;
	private ArrayList<Sale> sales; 

	// Constructors
	public w6_Employee() {
		name = "";
		ID = 0;
		age = 0;
		grade = payGrade.ENTRY; //(EnumName.Value)
	}// end of Constructors

	public w6_Employee(String name, int ID, int age, payGrade g) {
		this.name = name;
		this.ID = ID;
		this.age = age;
		this.sales = new ArrayList<Sale>();
		this.grade = g;
	}// end of Constructor Employee(String, int)

	// Methods
	public String getName() {
		return name;
	}// end of getName()

	public int getID() {
		return ID;
	}// end of getID()

	public int getAge() {
		return age;
	}// end of getAge()
	
	public String getHireDate() {
		return hireDate;
	}// end of getHireDate()
	
	public boolean getExemptStatus() {
		return exemptStatus;
	}// end of getExemptStatus()
	
	public void getExempStatus(boolean e) {
		return;
	}// end of getExemptStatus()

	public void setName(String n) {
		name = n;
	}// end of setName()

	public int setID(int id) {
		ID = id;
		return ID;
	}// end of setName()

	public int setAge(int a) {
		age = a;
		return age;
	}// end of setAge
	
	public void setHireDate(String d) {
		return;
	}// end of getHireDate()
/*
	public int compareTo(w6_Employee other) {
		if(this.age > other.age) {
			return 1;
		}else if(this.age < other.age) {
			return -1;
		}else {
			return 0;
		}
	}// end of compareTo()
*/	
	public int compareTo(w6_Employee other) {
		if(this.age > other.age) {
			return 1;
		}else if(this.age < other.age) {
			return -1;
		}else {
			return 0;
		}
	}// end of compareTo()
	
	
/*
	public boolean isSmaeAs(Object otherObject) {
		w6_Employee other = (w6_Employee) otherObject;
		if(this.ID == other.getID()) {
			return true;
		}
		return false;
	}
 * */
	
	public boolean isSameAs(w6_Employee other) {
		if(this.ID == other.getID()) {
			return true;
		}
		return false;
	}
	
	public abstract double calculatePayCheck();
	
	public abstract String toString();
}// end of class Employee

package Classroom;

import java.util.ArrayList;

public abstract class Employee implements w5_Hireable{
	// Attributes
	private String name;
	private int ID;
	private int age;
	private String hireDate;
	private boolean exemptStatus;
	private ArrayList<Sale> sales;

	// Constructors
	public Employee() {
		name = "";
		ID = 0;
	}// end of Constructors

	public Employee(String name, int ID, int age) {
		this.name = name;
		this.ID = ID;
		this.age = age;
		this.sales = new ArrayList<Sale>();
	}// end of Constructor Employee(String, int)

	// Methods
	public String getName() {
		return name;
	}// end of getName

	public int getID() {
		return ID;
	}// end of getID

	public int getAge() {
		return age;
	}// end of getAge
	
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
	}// end of setName

	public int setID(int id) {
		ID = id;
		return ID;
	}// end of setName

	public int setAge(int a) {
		age = a;
		return age;
	}// end of setAge
	
	public void setHireDate(String d) {
		return;
	}// end of getHireDate()

	public abstract double calculatePayCheck();
	
	public abstract String toString();
}// end of class Employee

package Classroom;

import Classroom.w6_Hireable.payGrade;

public class w6_Salaried extends w6_Employee {
	//Attributes
	private double salary;
	private double commissionPercent;
	
	//Constructors
	public w6_Salaried(String name, int ID, int age, payGrade g, double s, double c) {
		super (name, ID, age, g);
		salary = s;
		commissionPercent = c;
	}
	
	//Methods
	public double getSalary() {
		return salary;
	}//end of getSalary
	
	public double getCommissionPercent() {
		return commissionPercent;
	}//end of getCommissionPercent
	
	public void setSalary(double s) {
		salary = s;
	}//end of setSalary
	
	public void setCommissionPercent(double c) {
		commissionPercent = c;
	}//end of setCommissionPercent
	
	public double calculateCommission(double regPay) {
		return regPay * commissionPercent;
	}//end of calculateCommission
	
	public double calculatePayCheck() {
		double regPay = (salary/2080) * 80;
		double commission = calculateCommission(regPay);
		return regPay + commission;
	}// end of calculatePayCheck
	
	public String toString() {
		//System.out.toString();
		String s1 = String.format("Name: %-10s  ID: %d  Age: %d %n", getName(), getID(), getAge());
		String s2 = String.format("Salary: %-10.2f  Commision Percent: %.2f%n%n", salary, commissionPercent);
		
		String output = s1 + s2;
		return (output);
	}// end of toString()
	
}

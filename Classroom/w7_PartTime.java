package Classroom;

import Classroom.w7_Hireable.payGrade;

public class w7_PartTime extends w7_Employee{
	//Attributes
	private double hourlyWage;
	private double hoursWorked;
	
	//Constructors
	public w7_PartTime(String name, int age, payGrade g, double wage, double hours) {
		super(name, age, g);
		hourlyWage = wage;
		hoursWorked = hours;
	}
	
	//Methods
	public double getHourlyWage()	{
		return hourlyWage;
	}//end of getHourlyWage
	
	public double getHoursWorked() {
		return hoursWorked;
	}//end of getHoursWorked
	
	public void setHourlyWage(double wage) {
		hourlyWage = wage;
	}//end of setHourlyWage
	
	public void setHoursWorked(double hours) {
		hoursWorked = hours;
	}//end of setHourlyWage
	
	public double calculatePayCheck() {
		return hourlyWage * hoursWorked;
	}//end of calculatePayCheck()
	
	public String toString() {
		//System.out.toString();
		String s1 = String.format("Name: %-10s  ID: %-10d  NexdId: %-10d Age: %d %n", getName(), getID(), getNextID(), getAge());
		String s2 = String.format("Wage: %-10.2f  Hours Worked: %.2f%n%n", hourlyWage, hoursWorked);
		
		String output = s1 + s2;
		return (output);
	}// end of toString()

}//end of class PartTime

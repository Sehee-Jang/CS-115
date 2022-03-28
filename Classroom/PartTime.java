package Classroom;

public class PartTime extends Employee{
	//Attributes
	private double hourlyWage;
	private double hoursWorked;
	
	//Constructors
	public PartTime(String name, int ID, int age, double wage, double hours) {
		super(name, ID, age);
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
		String s1 = String.format("Name: %-10s  ID: %d %n", getName(), getID());
		String s2 = String.format("Wage: %-10.2f  Hours Worked: %.2f%n%n", hourlyWage, hoursWorked);
		
		String output = s1 + s2;
		return (output);
	}// end of toString()

}//end of class PartTime

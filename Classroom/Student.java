package Classroom;

public class Student extends Person{
	//Attributes
	private double GPA;
	private String major;
	
	//Constructors
	public Student() {
		super();
		GPA = 0.0;
		major = "";
	}//end of constructor Student()
	
	public Student(String n, int a, double h, double g, String m) {
		super(n, a, h);
		GPA = g;
		major = m;
	}//end of constructor Student()
	
	//Methods
	public double getGPA() {
		return GPA;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setGPA(double g) {
		GPA = g;
	}
	
	public void setMajor(String m) {
		major = m;
	}

}//end of class Student

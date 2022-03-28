package Classroom;

public class PartTimeStudent extends Student {
	private int hours;
	public PartTimeStudent(String n, int a, double h, double g, String m, int hr) {
		super(n, a, hr, g, m);
		hours = hr;
	}
}

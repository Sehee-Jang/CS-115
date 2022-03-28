package Classroom;

public class Person {
	//Attributes
	private String name;
	private int age;
	private double height;
	
	//Constructors
	public Person() {
		name = "";
		age = 0;
		height = 0.0;
	}//end of constructor Person()
	
	public Person(String n, int a, double h) {
		name = n;
		age = a;
		height = h;
	}//end of constructor Person(String, int, double)
	
	//Methods
	public String getName() {
		return name;
	}//end of getNAme
	
	public int getAge() {
		return age;
	}//end of getAge()

	public double getHeight() {
		return height;
	}//end of getHeight()
	
	
	public void setName(String n) {
		name = n;
	}//end of setName(String)
	
	public void setAge(int a) {
		age = a;
	}//end of setAge(int)
	
	public void setHeight(double h) {
		height = h;
	}//end of setHeight(double)
}// end of class Person



//Pretend this is in main()
/*
 Scanner in = new Scanner(System.in);
 
 Person p1 = new Person();
 
 Person p2 = new Person("Bob", 45, 75.0);
 
 System.out.println(p1.getName()) // It will print out Bob
 */

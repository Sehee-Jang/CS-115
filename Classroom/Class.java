package Classroom;

import java.util.ArrayList;

public class Class {
	// Attributes
	private String courseName;
	private String section;
	private ArrayList<Student> roster;

	// Constructors
	public Class(String cn, String s) {
		courseName = cn;
		section = s;
		roster = new ArrayList<Student>();
	}// end of constructor(String, String)

	// Methods
	public boolean addStudent(Student s) { //return boolean
		if(roster.size()<=2) { //size가 2보다 작거나 같을때 add
			roster.add(s);
			return true;
		} else {
			System.out.println("Class full."); //아니면 문구 프린트
			return false;
		}		
	}// end of addStudent()
	
	public int getClassSize() {
		return roster.size();
	}// end of getClassSize()
	
	public ArrayList<Student> getClassRoster(){
		return roster;
	}// end of getClassRoster

}// end of Class

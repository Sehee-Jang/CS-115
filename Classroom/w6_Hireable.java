package Classroom;

public interface w6_Hireable {
	
	enum  payGrade{
		ENTRY,
		STANDARD,
		SENIOR,
		MASTER
	}// end of enum payGrade

	public String getHireDate();
	
	public void setHireDate(String d);
	
	public boolean getExemptStatus();
	
	public void getExempStatus(boolean e);
	
}// end of interface

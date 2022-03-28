package RealEstate;

public abstract class Property {
	// Attributes
	private String streetAddress;
	private String zip;
	private double listPrice;
	private double appraisalPrice;
	
	// Constructors
	public Property() {
		streetAddress = "";
		zip = "";
	}
	
	public Property(String sA, String Z) {
		streetAddress = sA;
		zip = Z;
	}
		
	// Method
	public String getStreetAddress() {
		return streetAddress;
		
	}// end of getStreetAddress()
	
	public String setStreetAddress(String A) {
		return streetAddress = A;
	}// end of setStreetAddress(String A)
	
	public String getZip() {
		return zip;
	}// end of getZip()
	
	public String setZip(String Z) {
		return zip = Z;
	}// end of setZip(int Z)
		
	public double getListPrice() {
		return listPrice;
	}// end of getListPrice()
	
	public double setListPrice(double P) {
		return listPrice = P;
	}// end of setListPrice()
	
	public double getApraisalPrice() {
		return appraisalPrice;
	}// end of getApraisalPrice()
	
	protected double setAppraisalPrice(double AP) {
		return appraisalPrice = AP;
	}
	
	public abstract double calculateAppraisalPrice();
}// end of class Property




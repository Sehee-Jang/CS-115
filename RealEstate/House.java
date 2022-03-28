package RealEstate;

public class House extends Residential {
	//Attribute
	private double yardAcres;
	
	// Constructor
	public House() {
		super();
		yardAcres = 0.0;
	}// end of House
	
	public House(String sA, String Z, int bed, int bath, double ft, double Ac) {
		super(sA, Z, bed, bath, ft);
		yardAcres = Ac;
	}// end of House(double Ac)
	
	// Method
	public double getYardAcres() {
		return yardAcres;
	}// end of getYardAcres()
	
	public  double setYardAcres(double Ac) {
		return yardAcres = Ac;
	}// end of setYardAcres

	@Override
	public double calculateAppraisalPrice() {
		return (97f * getSize()) + (10000f * getBeds()) + (12000f * getBaths()) + (460000f * getYardAcres());
		
	}
	
	@Override
	public String toString() {
		String str = "\n------------------------------------------------------------------------------------\n";
		
		str += String.format("Residence Type: House   Address: %-18s Zip Code: %5s\n", getStreetAddress(), getZip());
		str += "------------------------------------------------------------------------------------\n";
		str += String.format("Sq Footage: %.2f\nBedrooms: %d\nBathrooms: %d\nYard Size (Acres): %.2f\n", getSize(), getBeds(), getBaths(), getYardAcres());
		str += "------------------------------------------------------------------------------------\n";
		str += String.format("Appraisal Price: $%,.2f\n", calculateAppraisalPrice());
		str += String.format("List Price: $%,.2f\n", getListPrice());
		str += "------------------------------------------------------------------------------------\n\n";
		
		return str;
	}// end of toString
	
}// end of class

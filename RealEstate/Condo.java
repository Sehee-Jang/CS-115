package RealEstate;

public class Condo extends Residential {
	// Attribute
	private int floorLvl;
	
	// Constructors
	public Condo() {
		super();
		floorLvl = 0;
	}// end of Condo
	
	public Condo(String sA, String Z, int bed, int bath, double ft, int fL) {
		super(sA, Z, bed, bath, ft);
		floorLvl = fL;
	}// end of Condo(int fL)
	
	//Methods
	public int getFloorLvl() {
		return floorLvl;
	}// end of getFloorLvl
	
	public int setFloorLvl(int fL) {
		return floorLvl = fL;
	}// end of setFloorLvl

	@Override
	public double calculateAppraisalPrice() {
		return (88f * getSize()) + (8000f * getBeds()) + (10000f * getBaths()) + ((floorLvl - 1) * 5000f);
		
	}

	@Override
	public String toString() {
		String str = "\n-----------------------------------------------------------------------------------\n";
		
		str += String.format("Residence Type: Condo   Address: %-18s Zip Code: %5s\n", getStreetAddress(), getZip());
		str += "------------------------------------------------------------------------------------\n";
		str += String.format("Sq Footage: %.2f\nBedrooms: %d\nBathrooms: %d\nFloor: %d\n", getSize(), getBeds(), getBaths(), getFloorLvl());
		str += "------------------------------------------------------------------------------------\n";
		str += String.format("Appraisal Price: $%,.2f\n", calculateAppraisalPrice());
		str += String.format("List Price: $%,.2f\n", getListPrice());
		str += "------------------------------------------------------------------------------------\n\n";
		
		return str;
	}// end of toString
	
}// end of class

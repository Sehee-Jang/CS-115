package week3;

public class Sundae extends IceCream {
	// Attributes
	private String toppingName;
	private double toppingPrice;
	private String setPackaging;
	
	// Constructors
	public Sundae() {
		super();
		toppingName = "";
		toppingPrice = 0.0;
		setPackaging ("");
	} // end of constructor Sundae{}
	
	public Sundae(String n, int sC, double pps, String tn, double tp) {
		super(n, sC, pps);
		toppingName = tn;
		toppingPrice = tp;
		setPackaging ("Boat");
	} // end of constructor Sundae()
	
	//Methods
	public String getToppingName() {
		return toppingName;
	}
	
	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingName(String tn) {
		toppingName = tn;
	}
	
	public void setToppingPrice(double tp) {
		toppingPrice = tp;
	}
	
	public double calculateCost() {
		super.calculateCost();
		return super.calculateCost() + toppingPrice;
	}
	 
	@Override
	public String toString() {
		//System.out.toString();
		String l1 = String.format("%s (%s)", getName(), getPackaging());
		String l2Pt1 = String.format("%d scoops of %s @ $%.2f/scoop", getScoopCount(), super.getName() ,getPricePerScoop());
		String l2Pt2 = String.format("%-10stoppoing @ $%.2f.:", getToppingName(), getToppingPrice());
		String l2Pt3 = String.format("$%.2f", calculateCost());
		String l2Pt4 = String.format("[Tax:$%.2f]", calculateTax());		
		String outputVar = String.format("%s\n\t%-45s\n\t%-30s%s%17s\n", l1, l2Pt1, l2Pt2, l2Pt3, l2Pt4);
		return outputVar;
	}// end of toString()
}


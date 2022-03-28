package week3;

public class IceCream extends DessertItem {
	// Attributes
	private int scoopCount;
	private double pricePerScoop;
	private String setPackaging;
	private double calculateCost;
	// Constructors
	public IceCream() {
		super();
		scoopCount = 0;
		pricePerScoop = 0.0;
		setPackaging ("");
	} // end of constructor IceCream{}
	
	public IceCream(String n, int sC, double pps) {
		super(n);
		scoopCount = sC;
		pricePerScoop = pps;
		setPackaging ("Bowl");
	} // end of constructor IceCream()
	
	//Methods 
	public int getScoopCount() {
		return scoopCount;
	}
	
	public double getPricePerScoop() {
		return pricePerScoop;
	}

	public void setScoopCount(int sC) {
		scoopCount = sC;
	}
	
	public void setPricePerScoop(double pps) {
		pricePerScoop = pps;
	}
	
	public double calculateCost() {
		return scoopCount * pricePerScoop;
	}
	 
	@Override
	public String toString() {
		//System.out.toString();
		String l1 = String.format("%s (%s)", getName(), getPackaging());
		String l2Pt1 = String.format("%d scoops  $%.2f/scoop:", getScoopCount(), getPricePerScoop());
		String l2Pt2 = String.format("$%.2f", calculateCost());
		String l2Pt3 = String.format("[Tax:$%.2f]", calculateTax());		
		String outputVar = String.format("%s\n\t%-30s%s%17s\n", l1, l2Pt1, l2Pt2, l2Pt3);
		return outputVar;
	}// end of toString()
}


package week3;

public class Candy extends DessertItem implements SameItem<Candy> {
	// Attributes
	private double candyWeight;
	private double pricePerPound;
	private String setPackaging;
	
	// Constructors
	public Candy() {
		super();
		candyWeight = 0.0;
		pricePerPound = 0.0;
		setPackaging("");
	} // end of constructor Candy{}
	
	public Candy(String n, double cW, double ppp) {
		super(n);
		candyWeight = cW;
		pricePerPound = ppp;
		setPackaging ("Bag");
	} // end of constructor Candy()
	
	//Methods
	public double getCandyWeight() {
		return candyWeight;
	}
	
	public double getPricePerPound() {
		return pricePerPound;
	}

	public void setCandyWeight(double cW) {
		candyWeight = cW;
	}
	
	public void setPricePerPound(double ppp) {
		pricePerPound = ppp;
	}
	 
	public double calculateCost() {
		return candyWeight * pricePerPound;
	}

	public boolean isSameAs(Candy other) {
		if(this.getName() == other.getName() && this.getPricePerPound() == other.getPricePerPound()) {	
				return true;
		}// end of if
		return false;
	}// end of isSameAs(Cookie other)
	
	/*
	public boolean isSameAs(Candy other) {
		if(this.getName() == other.getName()) {
			if(this.getPricePerPound() == other.getPricePerPound()) {
				return true;
			}// end of if for getPricePerPound()
		}// end of if for getName()
		return false;
	}// end of isSameAs(Cookie other)
	*/
	
	@Override
	public String toString() {
		//System.out.toString();
		String l1 = String.format("%s (%s)", getName(), getPackaging());
		String l2Pt1 = String.format("%.2f lbs.@  $%.2f/lb.: ", getCandyWeight(), getPricePerPound());
		String l2Pt2 = String.format("$%.2f", calculateCost());
		String l2Pt3 = String.format("[Tax:$%.2f]", calculateTax());		
		String outputVar = String.format("%s\n\t%-30s%s%17s\n", l1, l2Pt1, l2Pt2, l2Pt3);
		return outputVar;
		
	}// end of toString()
}


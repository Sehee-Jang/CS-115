package week03;

public class Candy extends DessertItem{

	//Attributes
	private double candyWeight;
	private double pricePerPound;
	
	//Constructors
	public Candy() {
		super();
		candyWeight = 0 ;
		pricePerPound = 0;
	}// end of Candy()
	
	public Candy(String n, double cW, double ppp) {
		super(n);
		candyWeight = cW;
		pricePerPound = ppp;
	}// end of Candy()

	//Methods
	public double getCandyWeight() {
		return candyWeight;
	}// end of getCandyWeight()
	
	public void setCandyWeight(double cW) {
		candyWeight = cW;
	}// end of setCandyWeight
	
	public double getPricePerPound() {
		return pricePerPound;
	}// end of getPricePerPound()
	
	public void setPricePerPound(double ppp) {
		pricePerPound = ppp;
	}// end of setPricePerPound()

	@Override
	public double calculateCost() {
		return candyWeight * pricePerPound;
	}
	
	@Override
	public String toString() {
		String l1 = String.format("%-25s\n", getName());
		String l2 = String.format("$%-8.2f[Tax: $%.2f]\n", calculateCost(), calculateTax());
		return l1 + l2;
	}
	
}

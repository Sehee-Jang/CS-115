package week03;

public class IceCream extends DessertItem{
	//Attributes
	private int scoopCount;
	private double pricePerScoop;
	
	//Constructors
	public IceCream() {
		super();
		scoopCount = 0 ;
		pricePerScoop = 0 ;
	}// end of Candy()
	
	public IceCream(String n, int  sC, double pps) {
		super(n);
		scoopCount = sC;
		pricePerScoop = pps;
	}// end of Candy()

	//Methods
	public double getScoopCount() {
		return scoopCount;
	}// end of getScoopCount()
	
	public void setScoopCount(int sC) {
		scoopCount = sC;
	}// end of setScoopCount
	
	public double getPricePerScoop() {
		return pricePerScoop;
	}// end of getPricePerScoop()
	
	public void setPricePerScoop(double pps) {
		pricePerScoop = pps;
	}// end of setPricePerScoop()

	@Override
	public double calculateCost() {
		return scoopCount * pricePerScoop;
	}
	
	@Override
	public String toString() {
		String l1 = String.format("%-25s\n", getName());
		String l2 = String.format("$%-8.2f[Tax: $%.2f]\n", calculateCost(), calculateTax());
		return l1 + l2;
	}
	
}

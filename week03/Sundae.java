package week03;

public class Sundae extends IceCream{
	//Attributes
	private String toppingName;
	private double toppingPrice;
	
	//Constructors
	public Sundae() {
		super();
		toppingName = "";
		toppingPrice = 0 ;
	}// end of Candy()
	
	public Sundae(String n, int  sC, double pps, String tN, double tP) {
		super(n, sC, pps);
		toppingName = tN;
		toppingPrice = tP;
	}// end of Candy()

	//Methods
	public String getToppingName() {
		return toppingName;
	}// end of getToppingName()
	
	public void setToppingName(String tN) {
		toppingName = tN;
	}// end of setScoopCount
	
	public double getToppingPrice() {
		return toppingPrice;
	}// end of getToppingPrice()
	
	public void setToppingPrice(double tP) {
		toppingPrice = tP;
	}// end of setToppingPrice()
	
	/* Overridden Methods */
	@Override
	public double calculateCost() {
		return super.calculateCost() + toppingPrice;
	}
	
	@Override
	public String toString() {
		String l1 = String.format("%-25s\n", getName());
		String l2 = String.format("$%-8.2f[Tax: $%.2f]\n", calculateCost(), calculateTax());
		return l1 + l2;
	}
	
}

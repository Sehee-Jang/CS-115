package week03;

public class Cookie extends DessertItem{
	//Attributes
	private int cookieQty;
	private double pricePerDozen;
	
	//Constructors
	public Cookie() {
		super();
		cookieQty = 0 ;
		pricePerDozen = 0 ;
	}// end of Candy()
	
	public Cookie(String n, int  cQ, double ppd) {
		super(n);
		cookieQty = cQ;
		pricePerDozen = ppd;
	}// end of Candy()

	//Methods
	public double getCookieQty() {
		return cookieQty;
	}// end of getCookieQty()
	
	public void setCookieQty(int cQ) {
		cookieQty = cQ;
	}// end of setCookieQty
	
	public double getPricePerDozen() {
		return pricePerDozen;
	}// end of getPricePerDozen()
	
	public void setPricePerDozen(double ppd) {
		pricePerDozen = ppd;
	}// end of setPricePerDozen()

	@Override
	public double calculateCost() {
		return cookieQty * pricePerDozen;
	}
	
	@Override
	public String toString() {
		String l1 = String.format("%-25s\n", getName());
		String l2 = String.format("$%-8.2f[Tax: $%.2f]\n", calculateCost(), calculateTax());
		return l1 + l2;
	}
}

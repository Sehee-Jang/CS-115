package DessertShop;

public class Sundae extends IceCream {
	/* Attributes */
	private String toppingName;
	private double toppingPrice;

	/* Constructors */
	public Sundae() {
		super();
		setPackaging("");
		toppingName = "";
		toppingPrice = 0.00;
	} // end of Sundae()

	public Sundae(String n, int sc, double pps, String tn, double tp) {
		super(n, sc, pps);
		setPackaging("Boat");
		toppingName = tn;
		toppingPrice = tp;
	} // end of Sundae(String n, int sc, double pps, String tn, double tp)

	/* Accessor Methods */
	public String getToppingName() { // returns the object's toppingName attribute
		return toppingName;
	}

	public void setToppingName(String tn) { toppingName = tn; }

	public double getToppingPrice() { return toppingPrice; }

	public void setToppingPrice(double tp) { toppingPrice = tp; }

	/* Overridden Methods */
	@Override
	public double calculateCost() { return super.calculateCost() + toppingPrice; }

	@Override
	public String toString() {
		String line1 = String.format("%s Sundae (%s)", getToppingName(), getPackaging());
		String line2 = String.format("%-1d scoops of %s ice cream. @ $%-4.2f/scoop", getScoopCount(), getName(),
				getPricePerScoop());
		String line3Pt1 = String.format("%s topping @ $%-2.2f:", getToppingName(), getToppingPrice());
		String line3Pt2 = String.format("$%-5.2f", calculateCost());
		String line3Pt3 = String.format("[Tax: $%3.2f]", calculateTax());
		return String.format("%s\n\t%s\n\t%-45s%s%17s\n", line1, line2, line3Pt1, line3Pt2, line3Pt3);
	} // end of toString()
}
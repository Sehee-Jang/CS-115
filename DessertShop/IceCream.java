package DessertShop;

public class IceCream extends DessertItem {
	/* Attributes */
	private int scoopCount;
	private double pricePerScoop;

	/* Constructor */
	public IceCream() {
		super();
		setPackaging("");
		scoopCount = 0;
		pricePerScoop = 0.00;
	} // end of IceCream()

	public IceCream(String n, int sc, double pps) {
		super(n);
		setPackaging("Bowl");
		scoopCount = sc;
		pricePerScoop = pps;
	} // end of IceCream(String n, int sc, double pps)

	/* Methods */
	public int getScoopCount() { // returns the object's scoopCount attribute
		return scoopCount;
	}

	public void setScoopCount(int sc) { scoopCount = sc; }

	public double getPricePerScoop() { return pricePerScoop; }

	public void setPricePerScoop(double pps) { pricePerScoop = pps; }

	/* Overridden Methods */
	@Override
	public double calculateCost() { return pricePerScoop * scoopCount; }

	@Override
	public String toString() {
		String line1 = String.format("%s Ice Cream (%s)", getName(), getPackaging());
		String line2Pt1 = String.format("%-1d scoops. @ $%-4.2f/scoop.:", getScoopCount(), getPricePerScoop());
		String line2Pt2 = String.format("$%-5.2f", calculateCost());
		String line2Pt3 = String.format("[Tax: $%3.2f]", calculateTax());
		return String.format("%s\n\t%-45s%s%17s\n", line1, line2Pt1, line2Pt2, line2Pt3);
	} // end of toString()
}

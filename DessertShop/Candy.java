package DessertShop;

public class Candy extends DessertItem implements SameItem<Candy> {
	/* Attributes */
	private double candyWeight;
	private double pricePerPound;

	/* Constructors */
	public Candy() {
		super();
		setPackaging("");
		candyWeight = 0.00;
		pricePerPound = 0.00;
	} // end of Candy()

	public Candy(String n, double cw, double ppp) {
		super(n);
		setPackaging("Bag");
		candyWeight = cw;
		pricePerPound = ppp;
	} // end of Candy(String n, double cw, double ppp)

	/* Methods */
	public double getCandyWeight() { return candyWeight; }

	public void setCandyWeight(double cw) { candyWeight = cw; }

	public double getPricePerPound() { return pricePerPound; }

	public void setPricePerPound(double ppp) { pricePerPound = ppp; }

	/* Overridden Methods */
	@Override
	public double calculateCost() { return pricePerPound * candyWeight; }

	@Override
	public boolean isSameAs(Candy other) {
		boolean sameName = this.getName().equals(other.getName());
		boolean samePrice = this.getPricePerPound() == other.getPricePerPound();
		if (sameName && samePrice) return true;
		return false;
	} // end of isSameAs(Candy other)

	@Override
	public String toString() {
		String line1 = String.format("%s (%s)", getName(), getPackaging());
		String line2Pt1 = String.format("%4.2f lbs. @ $%-4.2f/lb.:", getCandyWeight(), getPricePerPound());
		String line2Pt2 = String.format("$%-5.2f", calculateCost());
		String line2Pt3 = String.format("[Tax: $%3.2f]", calculateTax());
		return String.format("%s\n\t%-45s%s%17s\n", line1, line2Pt1, line2Pt2, line2Pt3);
	} // end of toString()
} // end of Candy

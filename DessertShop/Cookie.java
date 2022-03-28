package DessertShop;

public class Cookie extends DessertItem implements SameItem<Cookie> {
	/* Attributes */
	private int cookieQty;
	private double pricePerDozen;

	/* Constructors */
	public Cookie() {
		super();
		setPackaging("");
		cookieQty = 0;
		pricePerDozen = 0.00;
	} // end of Cookie()

	public Cookie(String n, int cq, double ppd) {
		super(n);
		setPackaging("Box");
		cookieQty = cq;
		pricePerDozen = ppd;
	} // end of Cookie(String n, int cq, double ppd)

	/* Methods */
	public int getCookieQty() { // returns the object's cookieQty attribute
		return cookieQty;
	}

	public void setCookieQty(int cq) { cookieQty = cq; }

	public double getPricePerDozen() { return pricePerDozen; }

	public void setPricePerDozen(double ppd) { pricePerDozen = ppd; }

	/* Overridden Methods */
	@Override
	public double calculateCost() { return (cookieQty / 12.0) * pricePerDozen; }

	@Override
	public boolean isSameAs(Cookie other) {
		boolean sameName = this.getName().equals(other.getName());
		boolean samePrice = this.getPricePerDozen() == other.getPricePerDozen();
		if (sameName && samePrice) return true;
		return false;
	} // end of isSameAs(Cookie other)

	@Override
	public String toString() {
		String line1 = String.format("%s Cookies (%s)", getName(), getPackaging());
		String line2Pt1 = String.format("%-1d cookies. @ $%-4.2f/dozen.:", getCookieQty(), getPricePerDozen());
		String line2Pt2 = String.format("$%-5.2f", calculateCost());
		String line2Pt3 = String.format("[Tax: $%3.2f]", calculateTax());
		return String.format("%s\n\t%-45s%s%17s\n", line1, line2Pt1, line2Pt2, line2Pt3);
	} // end of toString()
}
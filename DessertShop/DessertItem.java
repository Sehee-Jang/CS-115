package DessertShop;

public abstract class DessertItem implements Packaging, Comparable<DessertItem> {
	/* Attributes */
	private String name;
	private double taxPercent = 7.25;
	private String packaging;

	/* Constructors */
	public DessertItem() {
		name = "";
	}

	public DessertItem(String n) { // receives a string as an argument, sets it as the name's initial value
		name = n;
	}

	/* Methods */
	public String getName() { // This method returns the object's name attribute
		return name;
	}

	public void setName(String n) { name = n; }

	public double getTaxPercent() { return taxPercent; }

	public void setTaxPercent(double t) { taxPercent = t; }

	public double calculateTax() { return calculateCost() * (taxPercent / 100);	}

	/* Overridden Methods */
	@Override
	public String getPackaging() { return packaging; }

	@Override
	public void setPackaging(String pck) { packaging = pck; }

	@Override
	public int compareTo(DessertItem other) { return (int) (this.calculateCost() - other.calculateCost()); }

	/* Abstract Methods */
	public abstract double calculateCost();
} // end of DessertItem
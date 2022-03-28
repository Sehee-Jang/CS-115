package week03;

public abstract class DessertItem {
	
	//Attribute
	private String name;
	private double taxPercent = 7.25;
	
	//Constructors
	public DessertItem() {
		name = "";
	}// end of DessertItem()
	
	public DessertItem(String n) {
		name = n;
	}// end of DessertItem(String n)
	
	//Methods
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public double getTaxPercent() {
		return taxPercent;
	}
	
	public void setTaxPercent(double t) {
		taxPercent = t;
	}
	
	public abstract double calculateCost();
	
	public double calculateTax() {
		return calculateCost() * (taxPercent / 100); 
	}
}

package week3;

public abstract class DessertItem implements Packaging, Comparable<DessertItem>{
	// Attributes
	private String name;
	private double taxPercent = 7.25;
	private String packaging;
	 
	// Constructors
	public DessertItem() {
		name = "";
	}// end of constructor DessertItem()
 
	public DessertItem(String n) {
		name = n;
	}// end of constructor DessertItem()
	
	//Methods
		public String getName() {
			return name;
		}
		
		public double getTaxPercent() {
			return taxPercent;
		}
				
		public String setName(String n) {
			return name = n;
		}// end of setName(String n)
		
		public double setTaxPercent(double txP) {
			return taxPercent = txP;
		}// end of setTaxPercent(double tax)
		
		 
		public double calculateTax() {
			double tax = calculateCost() * taxPercent/100;
			return tax;
		}// end of calculateTax(double taxPercent)
		
		public String getPackaging() {
			return packaging;
		}// end of method getPackaging()
		
		public String setPackaging(String p) {
			return packaging = p;
		}// end of method getPackaging()

		
		public int compareTo(DessertItem other) {
			if(this.calculateCost() > other.calculateCost()) {
				return 1;
			}else if(this.calculateCost() < other.calculateCost()) {
				return -1;
			}else {
				return 0;
			}
		}//end of compareTo()
		
		public abstract double calculateCost();
		
		public abstract String toString();
		
		
}

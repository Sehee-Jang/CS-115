package week3;

public class Cookie extends DessertItem implements SameItem<Cookie>  {
	// Attributes
	private int cookieQty;
	private double pricePerDozen;
	private String setPackaging;
	
	// Constructors
	public Cookie() {
		super();
		cookieQty = 0;
		pricePerDozen = 0.0;
		setPackaging("");
	} // end of constructor Cookie{}
	
	public Cookie(String n, int Qty, double ppd) {
		super(n);
		cookieQty = Qty;
		pricePerDozen = ppd;
		setPackaging ("Box");
	} // end of constructor Cookie()
	 
	//Methods
	public int getCookieQty() {
		return cookieQty;
	}
	
	public double getPricePerDozen() {
		return pricePerDozen;
	}

	public int setCookieQty(int Qty) {
		cookieQty = Qty;
		return cookieQty;
	}
	
	public double setPricePerDozen(double ppd) {
		pricePerDozen = ppd;
		return pricePerDozen;
	}
	
	public double calculateCost() {
		return cookieQty * (pricePerDozen/12);
	}
	  
	public boolean isSameAs(Cookie other) {
		if(this.getName() == other.getName()) {
			if(this.getPricePerDozen() == other.getPricePerDozen()) {
				return true;
			}// end of if for getPricePerDozen()			
		}// end of if for getName()
		return false;
	}// end of isSameAs(Cookie other)
	
	@Override
	public String toString() {
		String l1 = String.format("%s  Cookies  (%s)", getName(), getPackaging());
		String l2Pt1 = String.format("%d cookies @  $%.2f/dozen:", getCookieQty(), getPricePerDozen()); 
		String l2Pt2 = String.format("$%.2f", calculateCost());
		String l2Pt3 = String.format("[Tax:$%.2f]", calculateTax());
		String outputVar = String.format("%s\n\t%-30s%s%17s\n", l1, l2Pt1, l2Pt2, l2Pt3);
		return outputVar;
	}// end of toString()
}


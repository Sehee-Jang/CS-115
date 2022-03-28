package week3;

import java.util.ArrayList;
import java.util.Collections;

public class Order implements Payable {
	// Attribute
	private ArrayList<DessertItem> all;
	private PayType payMethod;

	// Constructor
	public Order() {
		payMethod = PayType.CASH;
		all = new ArrayList<DessertItem>();
	}

	public Order(String D, PayType pt) {
		this();
		this.payMethod = pt;
	}// end of constructor
// Method 

	public ArrayList<DessertItem> getOrderList() {
		return all;
	}// end of getOrderList()

	public boolean addDessertItem(DessertItem D) {
		for(DessertItem d : all) {
			if(d instanceof Candy) {
				((Candy) d).getCandyWeight();
					
			} else if (d instanceof Cookie) {
				((Cookie) d).getCookieQty();
			}
		}
		
		if (all.size() >= 0) {
			all.add(D);
			return true;
		} else {
			System.out.print("No order.");
			return false;
		}
	}// end of addDessertItem()

	public int getitemCount() {
		return all.size();
	}// end of itemCount()

	public double orderCost() {
		double cost = 0.0d;
		for (DessertItem d : all) {
			cost += Math.round(d.calculateCost() * 100) / 100.0;
		}
		//System.out.println("cost = " + cost);
		return cost;
	}

	public double orderTax() {
		double tax = 0.0d;
		for (DessertItem d : all) {
			tax += Math.round(d.calculateTax() * 100) / 100.0;
		}
		return tax;
	}

	public String getPayType() {
		return getPayType();
	}

	public void setPayType(String pt) {
		if (pt.equalsIgnoreCase("CASH")) {
			payMethod = PayType.CASH;
		} else if (pt.equalsIgnoreCase("CARD")) {
			payMethod = PayType.CARD;
		} else if (pt.equalsIgnoreCase("PHONE")) {
			payMethod = PayType.PHONE;
		}
	} 

	@Override
	public String toString() {

		String finalOutput = "";
		String.format(finalOutput += "----------------------------Receipt----------------------------\n");
		
		// for (type variable : array)
		Collections.sort(all); // sort ArrayList
		for (DessertItem D : all) {
			finalOutput += D;
		} // end of for
		
		String.format(finalOutput += "---------------------------------------------------------------\n");


		finalOutput += String.format("Total number of items in order: %d \n", getitemCount());
		finalOutput += String.format("Order Subtotals:                      $%-9.2f [Tax: $%.2f]\n", orderCost(), orderTax());
		finalOutput += String.format("Order Total:                          $%.2f \n", (orderCost() + orderTax()));

		finalOutput += String.format("---------------------------------------------------------------\nPaid for with: %s",	payMethod + "\n");
		/* System.out.printf("Paid for with ", payMethod); */
		return (finalOutput);
	}// end of toString()

	public void add(DessertItem orderItem) {
		
	}
}// end of Class
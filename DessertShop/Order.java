package DessertShop;

import java.util.ArrayList;

public class Order implements Payable {
	/* Attributes */
	private ArrayList<DessertItem> order;
	private PayType payMethod;

	/* Constructor */
	public Order() {
		order = new ArrayList<DessertItem>();
		payMethod = PayType.CASH;
	} // end of Order()

	/* Methods */
	public ArrayList<DessertItem> getOrderList() { // it returns the whole order list
		return order;
	}

	public int itemCount() { // it returns the number of the elements in the list
		return order.size();
	}

	public double orderCost() {
		double subtotal = 0;
		for (DessertItem i : order)
			subtotal += i.calculateCost();
		return subtotal;
	} // end of orderCost()

	public double orderTax() {
		double taxTotal = 0;
		for (DessertItem i : order)
			taxTotal += i.calculateTax();
		return taxTotal;
	} // end of orderTax()

	public DessertItem add(DessertItem dessert) {
		if (dessert instanceof Candy && !order.isEmpty()) {
			for (DessertItem item : order) {
				if (item instanceof Candy && (((Candy) item).isSameAs((Candy) dessert))) {
					Candy candy = (Candy) item;
					Candy candyOther = (Candy) dessert;
					candy.setCandyWeight(candyOther.getCandyWeight() + candy.getCandyWeight());
					return order.get(order.size() - 1);
				} // end of if (item instanceof Candy && (((Candy) item).isSameAs((Candy) dessert)))
			} // end of for (DessertItem item : order)
		}

		else if (dessert instanceof Cookie && !order.isEmpty()) {
			for (DessertItem item : order) {
				if (item instanceof Cookie && (((Cookie) item).isSameAs((Cookie) dessert))) {
					Cookie cookie = (Cookie) item;
					Cookie cookieOther = (Cookie) dessert;
					cookie.setCookieQty(cookieOther.getCookieQty() + cookie.getCookieQty());
					return order.get(order.size() - 1);
				} // end of if (item instanceof Cookie && (((Cookie) item).isSameAs((Cookie) dessert)))
			} // end of for (DessertItem item : order)
		} // end of if (dessert instanceof Cookie && !order.isEmpty())
		order.add(dessert);
		return order.get(order.size() - 1);
	} // end of add(DessertItem dessert)

	/* Overridden Method */
	@Override
	public PayType getPayType() { return payMethod; }

	@Override
	public void setPayType(PayType tp) { payMethod = tp; }

	@Override
	public String toString() {
		String finalOutput = "";

		finalOutput += "---------------------------------Receipt--------------------------------\n";

		for (DessertItem dessert : order) {
			finalOutput += dessert.toString();
		}

		finalOutput += "------------------------------------------------------------------------\n";

		String line1 = String.format("Total number of items in order: %d", itemCount());
		String line2Pt1 = "Order Subtotals:";
		String line2Pt2 = String.format("$%-5.2f", orderCost());
		String line2Pt3 = String.format("[Tax: $%-3.2f]\n", orderTax());
		String line3Pt1 = "Order total:";
		String line3Pt2 = String.format("$%-5.2f", (orderCost() + orderTax()));
		String subtotalSection = String.format("%s\n%-49s%-11s%s\n%-49s%s\n", line1, line2Pt1, line2Pt2, line2Pt3,
				line3Pt1, line3Pt2);
		finalOutput += subtotalSection
				+ "------------------------------------------------------------------------\n";
		finalOutput += "Paid for with " + getPayType();
		return finalOutput;
	} // end of toString()
}
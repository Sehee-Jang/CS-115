package week03;

import java.util.ArrayList;

public class Order {
	
	//Attribute
	private ArrayList<DessertItem> order;
	
	//Constructor
	public Order() {
		order = new ArrayList<DessertItem>(); // Instance variable to a new ArrayList<DessertItem>()
	}
	
	//Methods
	public ArrayList<DessertItem> getOrderList() {
		return order;
	}
	
	// An add() method which takes a single DessertItem argument,
	// adds it to the ArrayList<DessertItem> instance variable , order, and returns the new array item added.
	
	public void add(DessertItem D) {
		if (order.size() >= 0) {
			order.add(D);
		} else {
			System.out.println("No order.");
		}		
	}
	
	public int itemCount() {
		return order.size();
	}
	
	public double orderCost() {
		double subtotal = 0.0;
		for(DessertItem D : order) {
			subtotal += D.calculateCost();
		}
		return subtotal;
	}
	
	public double orderTax() {
		double taxTotal = 0.0;
		for(DessertItem D : order) {
			taxTotal += D.calculateTax();
		}
		return taxTotal;
	}

}

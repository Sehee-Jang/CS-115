package week3;

import java.util.ArrayList;

public class Customer {

	//Attributes
	private String custName;
	private int custID;
	private static int nextCustID = 1000;
	ArrayList<Order> all = new ArrayList<Order>();
	
	//Constructor
	public Customer(String custName) {
		this.custName = custName;
		all = new ArrayList<Order>();
		this.custID = nextCustID;
		nextCustID ++;
	}// end of Customer(String custName)
	
	//Method
	public String getName() {
		return custName;
	}// end of getName()
	
	public int getID() {
		return custID;
	}//end of getID()	
	
	public int getNextCustID() {
		return nextCustID;
	}
	
	public ArrayList<Order> getOrderList() {
		return all;
	}// end of getOrderList()
	
	public String setName(String n) {
		return n;
	}//end of setName(String n)
	
	public void addToHistory(Order o) {
		all.add(o);
	}// end of addToHistory(Order o)
	
	@Override
	public String toString() {
		return String.format("Customer Name: %-8s Customer ID: %-8d  Total Orders: %d \n", custName, custID, all.size());
	}
	
}// end of class

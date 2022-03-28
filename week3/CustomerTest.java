package week3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testCustomer() {
		Customer C = new Customer("Karis");
		C.getName();
		String testCustomer = C.getName();
	}

	@Test
	void testGetName() {
		Customer C = new Customer("Karis");
		String testGetName = C.getName();
		equals(testGetName);
	}

	@Test
	void testGetID() {
		Customer C = new Customer("Karis");
		int testGetID = C.getID();
		equals(testGetID);
	}

	@Test
	void testGetnextCustID() {
		Customer C = new Customer("Karis");
		int testGetnextCustID = C.getNextCustID();
		equals(testGetnextCustID);
	}

	@Test
	void testGetOrderList() {
		Customer C = new Customer("Karis");
		ArrayList<Order> testGetOrderList = C.getOrderList();
		equals(testGetOrderList);
	}

	@Test
	void testSetName() {
		Customer C = new Customer("Karis");
		C.setName("James");
		String testGetName = C.getName();
		equals(testGetName);
	}

	@Test
	void testAddToHistory() {
		Customer C = new Customer("Karis");
		Order order = new Order();
		C.addToHistory(order);
	}
}

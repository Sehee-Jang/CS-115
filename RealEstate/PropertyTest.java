package RealEstate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PropertyTest {
	
	@Test
	void testProperty() {
		Condo C = new Condo();
		String testAddress = C.getStreetAddress();
		assertEquals("", testAddress);
	}

	@Test
	void testPropertyStringInt() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		String testAddress = C.getStreetAddress();
		assertEquals("9876N 543W, Provo", testAddress);
}

	@Test
	void testGetStreetAddress() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		String testAddress = C.getStreetAddress();
		assertEquals("9876N 543W, Provo", testAddress);
	}

	@Test
	void testGetZip() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		String testGetZip = C.getZip();
		assertEquals(84604, testGetZip);
	}

	@Test
	void testSetStreetAddress() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		String testSetStreetAddress = C.setStreetAddress("1234N 567W, Provo");
		assertEquals("1234N 567W, Provo", testSetStreetAddress);
	}

	@Test
	void testSetZip() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		String testSetZip = C.setZip("88704");
		assertEquals(88704, testSetZip);
	}
	
	@Test
	void testGetListPrice() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		double testGetListPrice = C.getListPrice();
		assertEquals(10000, testGetListPrice);
	}
	
	@Test
	void testSetListPrice() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		double testSetListPrice = C.setListPrice(15000);
		assertEquals(15000, testSetListPrice);
	}
	
	@Test
	void testGetApraisalPrice() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		double testGetApraisalPrice = C.getApraisalPrice();
		assertEquals(15000, testGetApraisalPrice);
	}
}

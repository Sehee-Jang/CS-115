package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResidentialTest {

	@Test
	void testResidential() {
		Condo C = new Condo();
		int testBeds = C.getBeds();
		assertEquals(0, testBeds);
	}

	@Test
	void testResidentialIntIntDouble() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		int testBeds = C.getBeds();
		assertEquals(3, testBeds);
	}

	@Test
	void testGetBeds() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		int testBeds = C.getBeds();
		assertEquals(3, testBeds);
	}

	@Test
	void testGetBaths() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		int testBaths = C.getBaths();
		assertEquals(1, testBaths);
	}

	@Test
	void testGetSize() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		double testGetSize = C.getSize();
		assertEquals(89.00, testGetSize);
	}

	@Test
	void testSetBeds() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		int testBeds = C.setBeds(4);
		assertEquals(4, testBeds);
	}

	@Test
	void testSetBaths() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		int testBaths = C.setBaths(2);
		assertEquals(2, testBaths);
	}

	@Test
	void testSetSize() {
		Condo C = new Condo("9876N 543W, Provo", "84604", 3, 1, 89.00, 1);
		double testSize = C.setSize(58.06);
		assertEquals(58.06, testSize);
	}

}

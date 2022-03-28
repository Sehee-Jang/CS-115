package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SundaeTest {

	@Test
	void testSundae() {
		Sundae S = new Sundae();
		S.getName();
		String testSundae = S.getName();
	}

	@Test
	void testSundaeStringStringDouble() {
		Sundae S = new Sundae();
		S.getName();
		String testSundaeStringStringDouble = S.getName();
	}

	@Test
	void testGetToppingName() {
		Sundae S = new Sundae("", 0, 0, "banana", 3);
		String testGetToppingName = S.getToppingName();
		assertEquals(testGetToppingName, "banana");
	}

	@Test
	void testGetToppingPrice() {
		Sundae S = new Sundae("", 0, 0, "banana", 3);
		double testGetToppingPrice = S.getToppingPrice();
		assertEquals(testGetToppingPrice, 3, .001);
	}

	@Test
	void testSetToppingName() {
		Sundae S = new Sundae("", 0, 0, "banana", 3);
		S.setToppingName("blueberry");
		String testGetToppingName = S.getToppingName();
		assertEquals(testGetToppingName, "blueberry");
	}

	@Test
	void testSetToppingPrice() {
		Sundae S = new Sundae("", 0, 0, "banana", 3);
		S.setToppingPrice(5);
		double testGetToppingPrice = S.getToppingPrice();
		assertEquals(testGetToppingPrice, 5, .001);
	}

}

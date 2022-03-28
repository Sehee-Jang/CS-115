package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IceCreamTest {

	@Test
	void testIceCream() {
		IceCream Ic = new IceCream();
		Ic.getName();
		String testIceCream = Ic.getName();
	}

	@Test
	void testIceCreamStringIntDouble() {
		IceCream Ic = new IceCream();
		Ic.getName();
		String testIceCreamStringIntDouble = Ic.getName();
	}

	@Test
	void testGetScoopCount() {
		IceCream Ic = new IceCream("", 3, 1);
		int testGetScoopCount = Ic.getScoopCount();
		assertEquals(testGetScoopCount, 3, .001);
	}

	@Test
	void testGetPricePerScoop() {
		IceCream Ic = new IceCream("", 3, 1);
		double testGetPricePerScoop = Ic.getPricePerScoop();
		assertEquals(testGetPricePerScoop, 1, .001);
	}

	@Test
	void testSetScoopCount() {
		IceCream Ic = new IceCream("", 3, 1);
		Ic.setScoopCount(20);
		int testGetScoopCount = Ic.getScoopCount();
		assertEquals(testGetScoopCount, 20, .001);
	}

	@Test
	void testSetPricePerScoop() {
		IceCream Ic = new IceCream("", 3, 1);
		Ic.setPricePerScoop(6);
		double testSetPricePerScoop = Ic.getPricePerScoop();
		assertEquals(testSetPricePerScoop, 6, .001);
	}

}

package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {

	@Test
	void testCookie() {
		Cookie Ck = new Cookie();
		Ck.getName();
		String testCookie = Ck.getName();
	}

	@Test
	void testCookieStringIntDouble() {
		Cookie Ck = new Cookie();
		Ck.getName();
		String testCookieStringIntDouble = Ck.getName();
	}

	@Test
	void testGetCookieQty() {
		Cookie Ck = new Cookie("", 10, 2);
		double testgetCookieQty = Ck.getCookieQty();
		assertEquals(testgetCookieQty, 10, .001);
	}

	@Test
	void testGetPricePerDozen() {
		Cookie Ck = new Cookie("", 10, 2);
		double testGetPricePerDozen = Ck.getPricePerDozen();
		assertEquals(testGetPricePerDozen, 2, .001);
	}

	@Test
	void testSetCookieQty() {
		Cookie Ck = new Cookie("", 10, 2);
		Ck.setCookieQty(20);
		double testgetCookieQty = Ck.getCookieQty();
		assertEquals(testgetCookieQty, 20, .001);
	}

	@Test
	void testSetPricePerDozen() {
		Cookie Ck = new Cookie("", 10, 2);
		Ck.setPricePerDozen(1);
		double testSetPricePerDozen = Ck.getPricePerDozen();
		assertEquals(testSetPricePerDozen, 1, .001);
	}
	
	@Test
	void testIsSameAs() {
		Cookie C1 = new Cookie("Cookie", 12, 2);
		Cookie C2 = new Cookie("Cookie", 6, 2);
		Cookie C3 = new Cookie("Cookie", 6, 3);
		//assertSame(C1, C2);
		assertTrue(C1.isSameAs(C2));
		assertFalse(C1.isSameAs(C3));			
	}

}

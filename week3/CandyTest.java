package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {

	@Test
	void testCandy() {
		Candy C = new Candy();
		C.getName();
		String testCandy = C.getName();
	}

	@Test
	void testCandyStringDoubleDouble() {
		Candy C = new Candy();
		C.getName();
		String testCandyStringDoubleDouble = C.getName();
	}

	@Test
	void testGetcandyWeight() {
		Candy C = new Candy("", 12, 2);
		double testGetcandyWeight = C.getCandyWeight();
		assertEquals(testGetcandyWeight, 12, .001);
	}

	@Test
	void testGetpricePerPound() {
		Candy C = new Candy("", 12, 2);
		double testGetpricePerPound = C.getPricePerPound();
		assertEquals(testGetpricePerPound, 2, .001);
	}

	@Test
	void testSetcandyWeight() {
		Candy C = new Candy("", 12, 2);
		C.setCandyWeight(20);
		double testGetcandyWeight = C.getCandyWeight();
		assertEquals(testGetcandyWeight, 20, .001);
	}

	@Test
	void testSetpricePerPound() {
		Candy C = new Candy("", 12, 2);
		C.setPricePerPound(4);
		double testSetpricePerPound = C.getPricePerPound();
		assertEquals(testSetpricePerPound, 4, .001);
	}
	
	@Test
	void testIsSameAs() {
		Candy C1 = new Candy("Sugar Candy", 12, 2);
		Candy C2 = new Candy("Sugar Candy", 6, 2);
		Candy C3 = new Candy("Sugar Candy", 6, 3);
		//assertSame(C1, C2);
		assertTrue(C1.isSameAs(C2));
		assertFalse(C1.isSameAs(C3));			
	}
		
}//end of CandyTest
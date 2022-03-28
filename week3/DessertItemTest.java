package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DessertItemTest {

	@Test
	public void testDessertItem() {
		Candy candy1 = new Candy();
		String testName = candy1.getName();
		assertEquals("", testName);
	}

	@Test
	public void testDessertItemString() {
		Candy candy1 = new Candy("Generic Candy", 1.5, .25);
		String testName = candy1.getName();
		assertEquals("Generic Candy", testName);
	}

	@Test
	public void testGetName() {
		Candy candy1 = new Candy("Generic Candy", 1.5, .25);
		String testName = candy1.getName();
		assertEquals("Generic Candy", testName);
	}
	
	@Test
	public void testSetName() {
		Candy candy1 = new Candy("Generic Candy", 1.5, .25);
		String testName = candy1.setName("Generic Sudae");
		assertEquals("Generic Sudae", testName);
	}
	
	@Test
	public void testGetTaxPercent() {
		Candy candy1 = new Candy("Generic Candy", 1.5, .25);
		double testTaxPercent = candy1.getTaxPercent();
		assertEquals(7.25, testTaxPercent, 0.0001);
	}

	@Test
	public void testSetTaxPercent() {
		Candy candy1 = new Candy("Generic Candy", 1.5, .25);
		double testSetTaxPercent = candy1.setTaxPercent(7);
		assertEquals(7, testSetTaxPercent, 0.0001);
	}
	
	@Test
	public void testcompareTo1() {
		Candy c1 = new Candy("Candy Corn", 1.5, .25);
		Assertions.assertEquals(c1.compareTo(new Candy("Candy Corn", 1.5, .25)), 0);	
	}
	
	@Test
	public void testcompareTo2() {
		Candy c1 = new Candy("Candy Corn", 1.5, .25);
		Assertions.assertEquals(c1.compareTo(new Candy("Candy Corn", 2.5, .35)), -1);	
	}
	
	@Test
	public void testcompareTo3() {
		Candy c1 = new Candy("Candy Corn", 1.5, .25);
		Assertions.assertEquals(c1.compareTo(new Candy("Candy Corn", 0.5, .15)), 1);	
	}

}

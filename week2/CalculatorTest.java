package week2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator c = new Calculator();
		c.add(13, 7);
		double testAdd = c.getResult();
		assertEquals(testAdd, 20, .001);
	}

	@Test
	void testSubtract() {
		Calculator c = new Calculator();
		c.subtract(14, 7);
		double testSubtract = c.getResult();
		assertEquals(testSubtract, 7, .001);
	}

	@Test
	void testMultiply() {
		Calculator c = new Calculator();
		c.multiply(2, 7);
		double testMultiply = c.getResult();
		assertEquals(testMultiply, 14, .001);
	}

	@Test
	void testDivide() {
		Calculator c = new Calculator();
		c.divide(14, 7);
		double testDivide = c.getResult();
		assertEquals(testDivide, 2, .001);
	}

}

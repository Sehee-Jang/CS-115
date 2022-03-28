package week2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Classroom.Person;

class Calculator2Test {

	@Test
	void testAdd() {
		Calculator2 c = new Calculator2();
		c.add(3.5, 3); //call method
		double testAdd = c.getResult(); //determine the result
		assertEquals(testAdd, 6.5, 0.001);

	}

	@Test
	void testSubtract() {
		Calculator2 c = new Calculator2();
		c.subtract(3.5, 3);
		double testSubtract = c.getResult();
		assertEquals(testSubtract, 0.5, .001);
	}

	@Test
	void testMultiply() {
		Calculator2 c = new Calculator2();
		c.multiply(3.5, 2);
		double testMultiply = c.getResult();
		assertEquals(testMultiply, 7, .001);
	}

	@Test
	void testDivide() {
		Calculator2 c = new Calculator2();
		c.divide(10.5, 3);
		double testDivide = c.getResult();
		assertEquals(testDivide, 3.5, .001);
	}

}

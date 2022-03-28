package Classroom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testGetName() {
		Person p = new Person("Bob", 33, 12.7);
		String testName = p.getName();
		assertEquals(testName, "Bob");
	}

	@Test
	void testGetAge() {
		Person p = new Person("Bob", 33, 12.7);
		int testAge = p.getAge();
		assertEquals(testAge, 33);
	}

	@Test
	void testGetHeight() {
		Person p = new Person("Bob", 33, 12.7);
		double testHeight = p.getHeight();
		assertEquals(testHeight, 12.7, .001);
	}

	@Test
	void testSetName() {
		Person p = new Person("Bob", 33, 12.7);
		p.setName("Joe");
		String testName = p.getName();
		assertEquals(testName, "Joe");
	}

	@Test
	void testSetAge() {
		Person p = new Person("Bob", 33, 12.7);
		p.setAge(60);
		int testAge = p.getAge();
		assertEquals(testAge, 60);
	}

	@Test
	void testSetHeight() {
		Person p = new Person("Bob", 33, 12.7);
		p.setHeight(99.9);
		double testHeight = p.getHeight();
		assertEquals(testHeight, 99.9, .001);
	}

}

package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseTest {

	@Test
	void testHouse() {
		House House1 = new House();
		House1.getYardAcres();
		double testHouse = House1.getYardAcres();
	}

	@Test
	void testHouseDouble() {
		House House1 = new House("9876N 543W, Provo", "84604", 3, 1, 43.06, 2.0);
		House1.getYardAcres();
		double testHouseDoulbe = House1.getYardAcres();
	}

	@Test
	void testGetYardAcres() {
		House House1 = new House("9876N 543W, Provo", "84604", 3, 1, 43.06, 2.0);
		double testGetYardAcres = House1.getYardAcres();
		assertEquals(testGetYardAcres, 2.0);
	}

	@Test
	void testSetYardAcres() {
		House House1 = new House("9876N 543W, Provo", "84604", 3, 1, 43.06, 2.0);
		House1.setYardAcres(6.0);
		double testSetYardAcres = House1.getYardAcres();
		assertEquals(testSetYardAcres, 6.0);
	}

}

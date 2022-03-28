package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CondoTest {

	@Test
	void testCondo() {
		Condo Condo1 = new Condo();
		int testFloor = Condo1.getFloorLvl();
		assertEquals(0, testFloor);
	}

	@Test
	void testCondoInt() {
		Condo Condo1 = new Condo("9876N 543W, Provo", "84604", 3, 1, 43.06, 1);
		int testFloor = Condo1.getFloorLvl();
		assertEquals(1, testFloor);
	}

	@Test
	void testGetFloorLvl() {
		Condo Condo1 = new Condo("9876N 543W, Provo", "84604", 3, 1, 43.06, 1);
		int testFloor = Condo1.getFloorLvl();
		assertEquals(1, testFloor);
	}

	@Test
	void testSetFloorLvl() {
		Condo Condo1 = new Condo("9876N 543W, Provo", "84604", 3, 1, 43.06, 1);
		int testFloor = Condo1.setFloorLvl(2);
		assertEquals(2, testFloor);
	}

	@Test
	void testCalculateAppraisalPrice() {
		Condo Condo1 = new Condo("9876N 543W, Provo", "84604", 3, 1, 43.06, 1);
		
	}
}

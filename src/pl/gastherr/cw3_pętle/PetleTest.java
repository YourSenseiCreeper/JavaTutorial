package pl.gastherr.cw3_pêtle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PetleTest {

	@Test
	void zadanie1() {
		String[] values = new String[] { "petla_nr0", "petla_nr1", "petla_nr2", "petla_nr3", "petla_nr4", 
				"petla_nr5", "petla_nr6", "petla_nr7", "petla_nr8", "petla_nr9"};
		assertEquals(values, Petle.zadanie1());
	}
	
	@Test
	void zadanie2() {
		String[] values = new String[] { 
				"ma³y0", "z¹b1", "zeszyt2", "kolano3", "twaróg4", 
				"telefon5", "okulary6", "myszka7", "pies8", "list9"
		};
		assertEquals(values, Petle.zadanie2());
	}
	
	@Test
	void zadanie3() {
		assertEquals(21, Petle.zadanie3());
	}
	
	@Test
	void zadanie4() {
		assertEquals(31, Petle.zadanie4());
	}
	
	@Test
	void zadanie5() {
		assertEquals(1610, Petle.zadanie5());
	}

}

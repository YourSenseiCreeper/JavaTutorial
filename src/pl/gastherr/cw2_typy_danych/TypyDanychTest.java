package pl.gastherr.cw2_typy_danych;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TypyDanychTest {

	@Test
	void zadanie1() {
		assertEquals("asdf", TypyDanych.zadanie1("ASDF"));
		assertEquals("testowy tekst z przerwami", TypyDanych.zadanie1("TeStOwY Tekst Z pRZerwaMi"));
	}
	
	@Test
	void zadanie2() {
		assertEquals("kupXero", TypyDanych.zadanie1("kupa"));
		assertEquals("kupero", TypyDanych.zadanie1("kup"));
	}
	
	@Test
	void zadanie3() {
		assertEquals(new String[] {"bl", "k"}, TypyDanych.zadanie3("blek"));
		assertEquals(new String[] {"blik" }, TypyDanych.zadanie3("blik"));
		assertEquals(new String[] {"bli", "", "k"}, TypyDanych.zadanie3("blinek"));
		assertEquals(new String[] {"", "", ""}, TypyDanych.zadanie3("nnn"));
	}

}

package no.hvl.dat109.stigespill.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import no.hvl.dat109.stigespill.Rute;

class RuteTest 
{
	private Rute rute;

	@BeforeEach
	void setUp() throws Exception {
		rute = new Rute("Test");
	}

	@Test
	@DisplayName("Test equals().")
	void testEquals() 
	{
		Rute identisk = new Rute("Test");
		Rute ikkeIdentisk = new Rute("Test2");
		
		boolean ikkeIdentiskTest = rute.equals(ikkeIdentisk);
		boolean identiskTest = rute.equals(identisk);
		boolean nullTest = rute.equals(null);
		
		assertFalse(ikkeIdentiskTest);
		assertTrue(identiskTest);
		assertFalse(nullTest);
	}
}

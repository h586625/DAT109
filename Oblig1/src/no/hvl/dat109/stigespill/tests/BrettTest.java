package no.hvl.dat109.stigespill.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import no.hvl.dat109.stigespill.Brett;
import no.hvl.dat109.stigespill.Rute;

class BrettTest 
{
	private Brett brett;

	@BeforeEach
	void setUp() throws Exception {
		brett = new Brett(10, 7);
	}

	@Test
	@DisplayName("Finn startsrute på brett.")
	void testFinnStart() {
		List<Rute> ruter = brett.getRuter();
		Rute first = ruter.get(0);
		assertEquals(first, brett.finnStart());
	}

	@Test
	@DisplayName("Flytt brikke via Brett.")
	void testFlytt() {
		List<Rute> ruter = brett.getRuter();
		Rute rute = ruter.get(5);
		Rute first = brett.flytt(rute, 5);
		assertEquals(first, ruter.get(10));
	}
}

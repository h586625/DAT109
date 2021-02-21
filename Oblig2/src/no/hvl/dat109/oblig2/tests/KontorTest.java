package no.hvl.dat109.oblig2.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import no.hvl.dat109.oblig2.Utleiebil;
import no.hvl.dat109.oblig2.helpers.Kategori;
import no.hvl.dat109.oblig2.helpers.Kategorinavn;

@Testable
public class KontorTest
{
    private List<Utleiebil> biler;

	@BeforeEach
	void setUp() throws Exception {
		biler = new ArrayList<Utleiebil>();
	}

	@Test
	@DisplayName("Legg til en bil.")
	void leggTilBil() {
        Utleiebil isabellasKuleNissanXrail = new Utleiebil("DK65744", "Nissan", "Xrail", "Svart", 250000, new Kategori(Kategorinavn.A),
		LocalDate.now(), LocalDate.of(2099, 12, 20));

        assertEquals(0, biler.size());
        biler.add(isabellasKuleNissanXrail);
        assertEquals(1, biler.size());
	}

	@Test
	@DisplayName("Lei ut en bil.")
	void leiUtBil() {
        Utleiebil isabellasKuleNissanXrail = new Utleiebil("DK65744", "Nissan", "Xrail", "Svart", 250000, new Kategori(Kategorinavn.A),
		LocalDate.now(), LocalDate.of(2099, 12, 20));

		biler.add(isabellasKuleNissanXrail);
        assertEquals(1, biler.size());
        isabellasKuleNissanXrail.setLedigFraDato(LocalDate.now());
		biler.remove(isabellasKuleNissanXrail);
        assertEquals(0, biler.size());
	}
}

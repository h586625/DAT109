package no.hvl.dat109.stigespill;

import java.util.ArrayList;
import java.util.List;

/**
 * Definerer et brett.
 *
 * @author Gruppe 2
 *
 */
public class Brett
{
	private static final Integer ANTALL_RUTER = 100;
	private List<Rute> ruter = new ArrayList<Rute>(ANTALL_RUTER);

	/**
	 * Lager et spillbrett.
	 */
	public Brett() {
		for (int i = 0; i < ANTALL_RUTER; i++) {
			ruter.add(new Rute("Rute " + (i+1)));
		}
	}

	/**
	 * Returnerer startruten som er rute nummer 0.
	 *
	 * @return startruten
	 */
	public Rute finnStart() {
		return ruter.get(0);
	}

	/**
	 * Finner rute som er sum antall ruter fremover på brettet fra gitt rute.
	 *
	 * @param rute
	 * @param sum
	 * @return ny rute
	 */
	public Rute flytt(Rute rute, Integer sum) {
		// kan være hensiktsmessig at rutene har et nummer.
		int indeks = ruter.indexOf(rute);
		int nyIndeks = (indeks + sum);

		if (nyIndeks > (100-1)) {
			return ruter.get(indeks);
		}

		return ruter.get(nyIndeks);
	}

	public List<Rute> getRuter() {
		return ruter;
	}
}


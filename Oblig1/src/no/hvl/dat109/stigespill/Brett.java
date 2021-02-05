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
	private int antallStiger = 10;
	private int antallSlanger = 7;
	// private int maksLengde = 10;
	// private int minLengde = 3;
	private boolean foersteRunde;

	/**
	 * Lager et spillbrett.
	 *
	 * @param antallStiger
	 * @param antallSlanger
	 */
	public Brett(int antallStiger, int antallSlanger) {
		this.antallStiger = antallStiger;
		this.antallSlanger = antallSlanger;

		// legg til vanlige ruter
		for (int i = 0; i < ANTALL_RUTER; i++) {
			ruter.add(new Rute("Rute " + (i+1)));
		}

		// legg til slanger og stiger
		// for (int i = 0; i < antallStiger; i++) {
		// 	int rand = (int) ((Math.random() * 100-maksLengde) + 1);
		// 	ruter.add(
		// 		rand,
		// 		new Stige("Stige " + (i+1),
		// 			rand,
		// 			rand+(int) ((Math.random() * maksLengde) + minLengde)
		// 	));
		// }
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
	 * Flytt spillbrikke til startsrute på spillbrettet.
	 */
	public Rute flyttTilStart() {
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
	
	public int getAntallStiger() {
		return antallStiger;
	}

	public void setAntallStiger(int antallStiger) {
		this.antallStiger = antallStiger;
	}

	public int getAntallSlanger() {
		return antallSlanger;
	}

	public void setAntallSlanger(int antallSlanger) {
		this.antallSlanger = antallSlanger;
	}

	/**
	 *
	 * @return foersteRunde
	 */
	public Boolean getFoersteRunde() {
		return foersteRunde;
	}

	/**
	 *
	 * @param foersteRunde
	 */
	public void setFoersteRunde(Boolean foersteRunde) {
		this.foersteRunde = foersteRunde;
	}
}


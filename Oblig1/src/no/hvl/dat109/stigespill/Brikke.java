package no.hvl.dat109.stigespill;

/**
 * Definerer en brikke for stigespillet.
 *
 * @author Gruppe 2
 *
 */
public class Brikke
{
	private Brett brett;
	private Rute rute;

	/**
	 * Lager en ny spillbrikke.
	 *
	 * @param brett
	 */
	public Brikke(Brett brett) {
		this.brett = brett;
		this.rute = brett.finnStart();
	}

	/**
	 * Flytt spillbrikke til ny rute på spillbrettet.
	 *
	 * @param sum Antall steg brikken skal flyttes.
	 */
	public void flytt(Integer sum) {
		rute = brett.flytt(rute, sum);
	}

	/**
	 * @return the rute
	 */
	public Rute getRute() {
		return rute;
	}

}


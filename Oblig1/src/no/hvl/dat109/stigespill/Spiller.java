package no.hvl.dat109.stigespill;

/**
 * Definerer en spiller i stigespillet.
 *
 * @author Gruppe 2
 *
 */
public class Spiller {
	private String navn;
	private Brikke brikke;
	private Brett brett;
	private boolean vinner = false;

	/**
	 * Oppretter spiller uten navn.
	 *
	 * @param brett
	 */
	public Spiller(Brett brett) {
		this.brett = brett;
		brikke = new Brikke(brett);
	}

	/**
	 * Oppretter spiller med navn.
	 *
	 * @param navn
	 * @param brett
	 */
	public Spiller(String navn, Brett brett) {
		this.navn = navn;
		this.brett = brett;
		brikke = new Brikke(brett);
	}

	/**
	 * Spiller et trekk med spilleren.
	 */
	public void spillTrekk(Terning terning) {
		terning.trill();
		Integer sum = terning.getVerdi();
		int indeks = brett.getRuter().indexOf(brikke.getRute());
		int nyIndeks = (indeks + sum);

		if (nyIndeks == (100-1)) {
			System.out.println("\nVi har en vinner:");
			vinner = true;
		}

		brikke.flytt(sum);
		vis(sum);
	}

	/**
	 * Viser et trekk.
	 *
	 * @param sum
	 */
	public void vis(Integer sum) {
		System.out.println(navn + " kaster " + sum  + " på terningen og havner på rute: " + brikke.getRute());
	}

	/**
	 *
	 * @return navn
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 *
	 * @param navn
	 */
	public void setNavn(String navn) {
		this.navn = navn;
	}

	/**
	 *
	 * @return vinner
	 */
	public boolean getVinner() {
		return vinner;
	}
}


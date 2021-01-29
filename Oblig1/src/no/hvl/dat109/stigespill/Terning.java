package no.hvl.dat109.stigespill;

/**
 *
 * Definerer en terning med 6 sider.
 *
 * @author Gruppe 2
 *
 */
public class Terning
{
	private static final double MAX = 6;
	private Integer verdi;

	/**
	 * Trill en terning.
	 */
	public void trill() {
		verdi = (int) ((Math.random() * MAX) + 1);
	}

	/**
	 * @return the verdi
	 */
	public Integer getVerdi() {
		return verdi;
	}
}

package no.hvl.dat109.monopol;

/**
 * 
 * Definerer en terning med 6 sider.
 * 
 * @author Christoffer Riis
 *
 */
public class Terning {
	private static final double MAX = 6;
	private Integer verdi;
	
	/**
	 * Trill en terning.
	 */
	public void trill() {
		verdi = (int) ((Math.random() * MAX) + 1);
	}

	public Integer getVerdi() {
		return verdi;
	}
}

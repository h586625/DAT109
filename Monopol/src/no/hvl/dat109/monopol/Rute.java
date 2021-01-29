package no.hvl.dat109.monopol;

/**
 * 
 * Definerer en rute på monopolbrettet.
 * 
 * @author Christoffer Riis
 *
 */
public class Rute {
	
	private String navn;

	/**
	 * Lager ny rute på monopolbrettet, uten navn.
	 */
	public Rute() {}
	
	/**
	 * Lager ny rute på monopolbrettet, med navn.
	 */
	public Rute(String navn) {
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
}

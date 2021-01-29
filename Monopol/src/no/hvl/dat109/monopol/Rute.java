package no.hvl.dat109.monopol;

/**
 * 
 * Definerer en rute p� monopolbrettet.
 * 
 * @author Christoffer Riis
 *
 */
public class Rute {
	
	private String navn;

	/**
	 * Lager ny rute p� monopolbrettet, uten navn.
	 */
	public Rute() {}
	
	/**
	 * Lager ny rute p� monopolbrettet, med navn.
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

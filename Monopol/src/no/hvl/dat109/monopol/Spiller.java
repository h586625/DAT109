package no.hvl.dat109.monopol;

/**
 * Definerer en spiller i monopolspillet.
 * 
 * @author Christoffer Riis
 *
 */
public class Spiller {
	private String navn;
	private Brikke brikke;
	private Kopp kopp;
	
	/**
	 * Oppretter spiller uten navn.
	 */
	public Spiller() {}
	
	/**
	 * Oppretter spiller med navn.
	 */
	public Spiller(String navn) {
		this.navn = navn;
	}
	
	/**
	 * Spiller et trekk med spilleren.
	 */
	public void spilltrekk(Kopp kopp) {
		kopp.trill();
		Integer sum = kopp.getSum();
		brikke.flytt(sum);
		vis();
	}
	
	/**
	 * Viser et trekk.
	 */
	public void vis(Integer sum) {
		System.out.println(navn + sum + brikke.getRute());
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
}

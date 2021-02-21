package no.hvl.dat109.oblig2.helpers;

/**
 * En adresse.
 * 
 * @author Team 11
 *
 */
public class Adresse
{
    String gateadresse;
	int postnr;
	String poststed;

	/**
	 * Oppretter en adresse.
	 * 
	 * @param gateadresse
	 * @param postnr
	 * @param poststed
	 */
    public Adresse(String gateadresse, int postnr, String poststed) {
		this.gateadresse = gateadresse;
		this.postnr = postnr;
		this.poststed = poststed;
	}
}

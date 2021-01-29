package no.hvl.dat109.monopol;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse for å spille monopol.
 * 
 * @author Christoffer Riis
 *
 */
public class Monopolspill {

	private List<Spiller> spillere = new ArrayList<Spiller>();

	/**
	 * Oppretter nytt monopolspill.
	 */
	public Monopolspill() {
		super();
	}
	
	/**
	 * Spiller monopolspillet.
	 */
	void spill() {
		for (int i = 0; i < 20; i++) {
			spillRunde();
		}
	}
	
	/**
	 * Spill en runde i monopolspillet.
	 */
	private void spillRunde() {
		// TODO Auto-generated method stub
		for (Spiller spiller : spillere) {
			spiller.spilltrekk();
		}
	}

	/**
	 * 
	 * @param args Ikke i bruk.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

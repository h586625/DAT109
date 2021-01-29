package no.hvl.dat109.monopol;

import java.util.ArrayList;
import java.util.List;

/**
 * Definerer et monopolbrett.
 * 
 * @author Christoffer Riis
 *
 */
public class Brett {

	private static final Integer ANTALL_RUTER = 40;
	private List<Rute> ruter = new ArrayList<Rute>(ANTALL_RUTER);
	
	public Brett() {
		for (int i = 0; i < ANTALL_RUTER; i++) {
			ruter.add(new Rute("Rute " + i));
		}
		
		ruter.get(0).setNavn("Start");
	}
}

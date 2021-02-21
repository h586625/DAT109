package no.hvl.dat109.oblig2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Reservasjon av bilutleie.
 *
 * @author Team 11
 *
 */
public class Reservasjon
{
	private LocalDate utleieDato;
	private LocalDate returDato;
    private Map<Integer, Utleiebil> utvalg;

	public Reservasjon(LocalDate utleieDato, LocalDate returDato) {
		this.utleieDato = utleieDato;
		this.returDato = returDato;
		utvalg = new HashMap<Integer, Utleiebil>();
	}

	public void put(Integer id, Utleiebil utleiebil) {
		utvalg.put(id, utleiebil);
	}

	public void valgtBil(Integer nummer) {
		Utleiebil reservasjon = utvalg.get(nummer);
		System.out.println(reservasjon);
		System.out.println("Fra dato:\t" + utleieDato);
		System.out.println("Til dato:\t" + returDato);
		//TODO
		//Valgt bil må lagres/videresendes, slik at vi har informasjon om bilen ved faktisk utleie
	}

	public void kundeVelger() {
		Scanner scan = new Scanner(System.in);
		Integer nr = (Integer) scan.nextInt();
		scan.close();
		valgtBil(nr);
	}
}

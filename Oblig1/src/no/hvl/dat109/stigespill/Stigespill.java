package no.hvl.dat109.stigespill;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Klasse for å spille stigespill.
 *
 * @author Gruppe 2
 *
 */
public class Stigespill
{
	private List<Spiller> spillere = new ArrayList<Spiller>();
	private Terning terning = new Terning();
	private Brett brett;
	private Integer antallSpillere = 2;
	private int stiger = 10;
	private int slanger = 7;
	private boolean ferdig = false;

	/**
	 * Oppretter nytt stigespill med to spillere.
	 */
	public Stigespill() {
		terning = new Terning();
		brett = new Brett(stiger, slanger);
		// lager to spillere i tilfelle dette ikke blir gjort av brukeren
		for (int i = 0; i < antallSpillere; i++) {
			spillere.add(
				new Spiller("Spiller " + i, brett)
			);
		}
	}

	/**
	 * Oppretter nytt stigespill med antall spillere.
	 *
	 * @param antallSpillere
	 */
	public Stigespill(int antallSpillere) {
		terning = new Terning();
		brett = new Brett(stiger, slanger);
		antallSpillere = this.antallSpillere;
	}

	/**
	 * Spiller stigespill.
	 */
	void spill() {
		int i = 0;
		while (!ferdig) {
			i++;
			if (i == 1) {
				brett.setFoersteRunde(true);
			} else {
				brett.setFoersteRunde(false);
			}
			System.out.println("Runde nr. " + i);
			spillRunde();
		}
	}

	/**
	 * Spill en runde i stigespillet.
	 */
	private void spillRunde() {
		if (spillere.size() > 1 && spillere.size() < 5) {
			for (Spiller spiller : spillere) {
				if (spiller.getVinner()) {
					ferdig = true;
					return;
				} else {
					spiller.spillTrekk(terning);
				}
			}
		} else {
			System.out.println("Du må ha mellom 2-4 spillere.");
		}
	}

	/**
	 *
	 * @param args Ikke i bruk.
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Skriv inn antall spillere (2-4):");

		int antallSpillere = scanner.nextInt();

		if (antallSpillere < 2) {
			System.out.println("Du må velge minst 2 spillere.");
		} else if (antallSpillere > 4) {
			System.out.println("Du må velge maks 4 spillere.");
		} else {
			Stigespill spillet = new Stigespill(antallSpillere);
			scanner.nextLine();
			for (int i = 0; i < antallSpillere; i++) {
				System.out.println("Skriv inn navn på spiller " + i);
				Spiller spiller = new Spiller(scanner.nextLine(), spillet.brett);
				spillet.spillere.add(spiller);
			}
			System.out.println("\nSpillet starter:");
			spillet.spill();
		}

		scanner.close();
	}
}

package no.hvl.dat109.oblig2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import no.hvl.dat109.oblig2.helpers.Kategori;

/**
 * Et s�k over ledige kategorier av biler under gitte kriterier.
 *
 * @author Team 11
 *
 */
public class Soek
{
	Kontor sted;
	LocalDate utleieDato;
	LocalTime utleieKlokkeslett;
	LocalDate returDato;
	LocalTime returKlokkeslett;
	Kunde kunde;

	/**
	 * Oppretter et bils�k.
	 *
	 * @param sted
	 * @param utleieDato
	 * @param utleieKlokkeslett
	 * @param returDato
	 * @param returKlokkeslett
	 * @param kunde
	 */
	public Soek(
		Kontor sted,
		LocalDate utleieDato, LocalTime utleieKlokkeslett,
		LocalDate returDato, LocalTime returKlokkeslett,
		Kunde kunde
	) {
		this.sted = sted;
		this.utleieDato = utleieDato;
		this.utleieKlokkeslett = utleieKlokkeslett;
		this.returDato = returDato;
		this.returKlokkeslett = returKlokkeslett;
		this.kunde = kunde;
    }

	/**
	 * Vis s�keresultater.
	 */
	public void visResultater()
	{
		Integer id = 0;
		Reservasjon reserver = new Reservasjon(utleieDato, returDato);

		if (!sted.getLedigeBiler(utleieDato, returDato).isEmpty()) {
			for (Utleiebil utleiebil : sted.getLedigeBiler(utleieDato, returDato))
			{
				id++;
				reserver.put(id, utleiebil);

				System.out.println("Nr. " + id);
				System.out.println("Merke/modell:\t" + utleiebil.getMerke() + " " + utleiebil.getModell());
				System.out.println("Farge:\t\t" + utleiebil.getFarge());
				Kategori kategori = utleiebil.getKategori();
				System.out.println("Kategori:\t" + kategori.getNavn());
				System.out.println("Pris:\t\t" + kategori.getDagspris()*getAntallDager());
				System.out.println();
			}

			System.out.println("\nVelg bil ved å skrive inn nummer");
			reserver.kundeVelger();
		} else {
			System.out.println("Ingen biler er dessverre ledige i dette tidsrommet.");
		}
	}

	public Kontor getSted() {
		return sted;
	}

	public void setSted(Kontor sted) {
		this.sted = sted;
	}

	public LocalDate getUtleieDato() {
		return utleieDato;
	}

	public void setUtleieDato(LocalDate utleieDato) {
		this.utleieDato = utleieDato;
	}

	public LocalTime getUtleieKlokkeslett() {
		return utleieKlokkeslett;
	}

	public void setUtleieKlokkeslett(LocalTime utleieKlokkeslett) {
		this.utleieKlokkeslett = utleieKlokkeslett;
	}

	public LocalDate getReturDato() {
		return returDato;
	}

	public void setReturDato(LocalDate returDato) {
		this.returDato = returDato;
	}

	public LocalTime getReturKlokkeslett() {
		return returKlokkeslett;
	}

	public void setReturKlokkeslett(LocalTime returKlokkeslett) {
		this.returKlokkeslett = returKlokkeslett;
	}

	public long getAntallDager() {
		long antallDager = ChronoUnit.DAYS.between(utleieDato, returDato);
		return antallDager;
	}

	public Kunde getKunde() {
		return kunde;
	}
}
package no.hvl.dat109.oblig2;

import java.time.LocalDate;

import no.hvl.dat109.oblig2.helpers.*;

/**
 * En utleiebil.
 *
 * @author Team 11
 *
 */
public class Utleiebil
{
	String regnr;
	String merke;
	String modell;
	String farge;
	int kilometerstand;
	Kategori kategori;
	boolean ledig;
	LocalDate ledigFraDato;
	LocalDate ledigTilDato;

	/**
	 * Oppretter en utleiebil.
	 *
	 * @param regnr
	 * @param merke
	 * @param modell
	 * @param farge
	 * @param kilometerstand
	 * @param kategori
	 * @param ledigFraDato
	 * @param ledigTilDato
	 */
	public Utleiebil(
		String regnr, String merke, String modell, String farge, int kilometerstand, Kategori kategori,
		LocalDate ledigFraDato, LocalDate ledigTilDato
	) {
		this.regnr = regnr;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.kilometerstand = kilometerstand;
		this.kategori = kategori;
		this.ledig = true;
		this.ledigFraDato = ledigFraDato;
		this.ledigTilDato = ledigTilDato;
	}

	public boolean getLedig() {
		return ledig;
	}

	public void setLedig(boolean ledig) {
		this.ledig = ledig;
	}

	public String getFarge() {
		return farge;
	}

	public String getRegnr() {
		return regnr;
	}

	public String getMerke() {
		return merke;
	}

	public String getModell() {
		return modell;
	}

	public int getKilometerstand() {
		return kilometerstand;
	}

	public void setKilometerstand(int kilometerstand) {
		this.kilometerstand = kilometerstand;
	}

	public Kategori getKategori() {
		return kategori;
	}

	public LocalDate getLedigFraDato() {
		return ledigFraDato;
	}

	public void setLedigFraDato(LocalDate ledigFraDato) {
		this.ledigFraDato = ledigFraDato;
	}

	public LocalDate getLedigTilDato() {
		return ledigTilDato;
	}

	public void setLedigTilDato(LocalDate ledigTilDato) {
		this.ledigTilDato = ledigTilDato;
	}

	@Override
	public String toString() {
		return "Utleiebil \nRegnummer:\t" + regnr + "\nMerke:\t\t" + merke + "\nModell:\t\t" + modell + "\nFarge:\t\t" + farge
				+ "\nKilometerstand:\t" + kilometerstand + "\nKategori:\t" + kategori.getNavn();
	}
}

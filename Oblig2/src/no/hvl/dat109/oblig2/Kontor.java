package no.hvl.dat109.oblig2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import no.hvl.dat109.oblig2.helpers.*;

/**
 * Et kontor som leier ut biler.
 *
 * @author Team 11
 *
 */
public class Kontor
{
	int kontornr;
	String tlfnr;
	Adresse adresse;
	double returgebyr;
	private List<Utleiebil> biler;

	/**
	 * Oppretter et kontor.
	 *
	 * @param kontornr
	 * @param tlfnr
	 * @param adresse
	 * @param returgebyr
	 */
	public Kontor(int kontornr, String tlfnr, Adresse adresse, double returgebyr)
	{
		this.kontornr = kontornr;
		this.tlfnr = tlfnr;
		this.adresse = adresse;
		this.returgebyr = returgebyr;
		biler = new ArrayList<Utleiebil>();
	}

	public boolean isBilLedig(Utleiebil bil, LocalDate fra, LocalDate til) {
		return (bil.getLedigFraDato().isBefore(fra) || bil.getLedigFraDato().equals(fra)) &&
		(bil.getLedigTilDato().isAfter(til) || bil.getLedigTilDato().equals(til));
	}

	/**
	 * Returner ledige bilkategorier.
	 *
	 * @param fra
	 * @param til
	 * @return kategorier
	 */
	public Set<Kategori> getLedigeKategorier(LocalDate fra, LocalDate til)
	{
		Set<Kategori> kategorier = new HashSet<Kategori>();

		for (int i=0; i<biler.size(); i++) {
			Utleiebil b = biler.get(i);
			if (isBilLedig(b, fra, til)) {
				kategorier.add(b.getKategori());
			}
		}

		return kategorier;
	}

	public int getKontornr() {
		return kontornr;
	}

	public void setKontornr(int kontornr) {
		this.kontornr = kontornr;
	}

	public String getTlfnr() {
		return tlfnr;
	}

	public void setTlfnr(String tlfnr) {
		this.tlfnr = tlfnr;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public double getReturgebyr() {
		return returgebyr;
	}

	public void setReturgebyr(double returgebyr) {
		this.returgebyr = returgebyr;
	}

	public List<Utleiebil> getBiler() {
		return biler;
	}

	/**
	 * Legg til en bil.
	 *
	 * @param bil
	 */
	public void leggTilBil(Utleiebil bil) {
		biler.add(bil);
	}

	/**
	 * Lei ut en bil.
	 *
	 * @param bil
	 */
	public void leiUtBil(Utleiebil bil, LocalDate returDato) {
		bil.setLedigFraDato(returDato);
		biler.remove(bil);
	}
}
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

		for (Utleiebil b : biler) {
			// if
			if (
				(b.getLedigFraDato().isBefore(fra) || b.getLedigFraDato().equals(fra)) &&
				(b.getLedigTilDato().isAfter(til) || b.getLedigTilDato().equals(til))
			) {
				kategorier.add(b.getKategori());
				b.setLedig(true);
			} else {
				b.setLedig(false);
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
		bil.setLedig(true);
	}

	/**
	 * Lei ut en bil.
	 * 
	 * @param bil
	 */
	public void leiUtBil(Utleiebil bil) {
		bil.setLedig(false);
		biler.remove(bil);
	}
}
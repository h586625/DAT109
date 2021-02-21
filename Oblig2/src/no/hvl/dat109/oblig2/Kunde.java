package no.hvl.dat109.oblig2;

import no.hvl.dat109.oblig2.helpers.*;

/**
 * En kunde.
 * 
 * @author Team 11
 *
 */
public class Kunde
{
	private String fornavn;
	private String etternavn;
	private Adresse adresse;
	private String tlfnr;
	private String kredittkortnummer;

	/**
	 * Oppretter en kunde.
	 * 
	 * @param fornavn
	 * @param etternavn
	 * @param adresse
	 * @param tlfnr
	 * @param kredittkortnummer
	 */
	public Kunde(String fornavn, String etternavn, Adresse adresse, String tlfnr, String kredittkortnummer) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.adresse = adresse;
		this.tlfnr = tlfnr;
		this.kredittkortnummer = kredittkortnummer;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTlfnr() {
		return tlfnr;
	}

	public void setTlfnr(String tlfnr) {
		this.tlfnr = tlfnr;
	}

	public String getKredittkortnummer() {
		return kredittkortnummer;
	}

	public void setKredittkortnummer(String kredittkortnummer) {
		this.kredittkortnummer = kredittkortnummer;
	}

	// reservere

	// leie
}
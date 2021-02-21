package no.hvl.dat109.oblig2.helpers;

/**
 * En bilkategori.
 *
 * @author Team 11
 *
 */
public class Kategori
{
	Kategorinavn navn;
	int dagspris;

	/**
	 * Oppretter en kategori med en bestemt dagspris.
	 *
	 * @param navn
	 */
	public Kategori(Kategorinavn navn) {
		this.navn = navn;

		switch(this.navn) {
			case A:
				this.dagspris = 400;
				break;
			case B:
				this.dagspris = 450;
				break;
			case C:
				this.dagspris = 500;
				break;
			case D:
				this.dagspris = 550;
				break;
		}
	}

	public String getNavn() {
		String navn = "";

		switch(this.navn) {
			case A:
				navn = "Liten bil";
				break;
			case B:
				navn = "Mellomstor bil";
				break;
			case C:
				navn = "Stor bil";
				break;
			case D:
				navn = "Stasjonsvogn";
				break;
			default:
				navn = "Feil";
		}
		return navn;
	}

	public int getDagspris() {
		return dagspris;
	}

	public void setDagspris(int dagspris) {
		this.dagspris = dagspris;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Kategori other = (Kategori) obj;
		return navn.equals(other.navn);
	}
}
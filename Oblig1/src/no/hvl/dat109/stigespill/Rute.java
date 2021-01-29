package no.hvl.dat109.stigespill;

/**
 *
 * Definerer en rute på stigespillbrettet.
 *
 * @author Gruppe 2
 *
 */
public class Rute
{
	private String navn;

	/**
	 * Lager ny rute på stigespillbrettet, med navn.
	 *
	 * @param navn
	 */
	public Rute(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		if (navn == null ) {
			this.navn = "";
		} else {
			this.navn = navn;
		}
	}

	@Override
	public String toString() {
		return "Rute [navn=" + navn + "]";
	}

	@Override
	public int hashCode() {
		// satser på at navn ikke kan være null!
		return navn.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Rute other = (Rute) obj;
		return navn.equals(other.navn);
	}
}

package no.hvl.dat109.stigespill;

public class Slange extends Rute
{
	private int startVerdi;
	private int sluttVerdi;

	public Slange(String navn, int startVerdi, int sluttVerdi) {
		super(navn);
		this.startVerdi = startVerdi;
		this.sluttVerdi = sluttVerdi;
	}

	public int getStartVerdi() {
		return startVerdi;
	}

	public void setStartVerdi(int startVerdi) {
		this.startVerdi = startVerdi;
	}

	public int getSluttVerdi() {
		return sluttVerdi;
	}

	public void setSluttVerdi(int sluttVerdi) {
		this.sluttVerdi = sluttVerdi;
	}
}
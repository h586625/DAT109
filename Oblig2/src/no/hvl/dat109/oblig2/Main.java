package no.hvl.dat109.oblig2;

import java.time.LocalDate;
import java.time.LocalTime;

import no.hvl.dat109.oblig2.helpers.Adresse;
import no.hvl.dat109.oblig2.helpers.Kategori;
import no.hvl.dat109.oblig2.helpers.Kategorinavn;

public class Main
{
    public static void main(String[] args)
    {
        Selskap selskap = new Selskap("LeiMegDegHeiNeiOkei", "66666666", new Adresse("Jongsstubben 99", 1337, "Sandvika"));
        Kontor kontor = new Kontor(1, "99009900", new Adresse("Gate", 9900, "By"), 450);
        Kontor kontor2 = new Kontor(2, "99999999", new Adresse("Malibu Point", 10880, "California"), 600);
        Utleiebil b = new Utleiebil(
            "EL12345", "Audi", "Etron", "Sølv", 15000, new Kategori(Kategorinavn.A),
            LocalDate.now(),
            LocalDate.of(2099, 12, 20)
        );
		Utleiebil b2 = new Utleiebil(
            "EL11122", "Audi", "Etron", "Hvit", 100000, new Kategori(Kategorinavn.A),
            LocalDate.now(),
            LocalDate.of(2099, 12, 20)
        );
		Utleiebil b3 = new Utleiebil(
            "ST91051", "Volvo", "V60", "Svart", 500, new Kategori(Kategorinavn.D),
            LocalDate.of(2022, 12, 05),
            LocalDate.of(2099, 12, 20)
        );
        Adresse maanen = new Adresse("Månebakken 1", 99, "Månen");
        Kunde helene = new Kunde("Helene", "Solhaug", maanen, "+4799999999", "9988776655443322");

        selskap.leggTilKontor(kontor);
        selskap.leggTilKontor(kontor2);

		kontor.leggTilBil(b);
		kontor2.leggTilBil(b2);
		kontor.leggTilBil(b3);

        Meny meny = new Meny(selskap);
        int valgtKontor = meny.getKontornummer();
        LocalDate fraDato = meny.getUtleieDato();
        LocalDate tilDato = meny.getReturDato();

        System.out.println("Søket ditt:");
        System.out.println("Utleiedato: " + fraDato);
        System.out.println("Returdato: " + tilDato);
        System.out.println(selskap.finnKontorPaaNummer(valgtKontor));

		Soek soek = new Soek(
            selskap.finnKontorPaaNummer(valgtKontor),
            fraDato,
            LocalTime.now(),
            tilDato,
            LocalTime.now(),
            helene
        );
		soek.visResultater();
    }
}

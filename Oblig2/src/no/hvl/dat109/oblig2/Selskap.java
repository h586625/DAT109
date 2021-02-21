package no.hvl.dat109.oblig2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import no.hvl.dat109.oblig2.helpers.Adresse;

/**
 * Et bilutleie selskap.
 *
 * @author Team 11
 *
 */
public class Selskap
{
    private String navn;
    private String telefonnummer;
    private Adresse adresse;
    private List<Kontor> kontorer;

    /**
     * Opprett nytt bilutleie selskap.
     *
     * @param navn
     * @param telefonnummer
     * @param adresse
     */
    public Selskap(String navn, String telefonnummer, Adresse adresse) {
        this.navn = navn;
        this.telefonnummer = telefonnummer;
        this.adresse = adresse;
        kontorer = new ArrayList<Kontor>();
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public List<Kontor> getKontorer() {
        return kontorer;
    }

    public boolean leggTilKontor(Kontor kontor) {
        return kontorer.add(kontor);
    }

    public boolean fjernKontor(Kontor kontor) {
        return kontorer.remove(kontor);
    }

    public Kontor finnKontorPaaNummer(int nummer) {
        List<Kontor> funn = kontorer.stream()
            .filter(k -> nummer == k.getKontornr())
            .collect(Collectors.toList());

        if (funn.size() > 0) {
            return funn.get(0);
        }

        return null;
	}
}

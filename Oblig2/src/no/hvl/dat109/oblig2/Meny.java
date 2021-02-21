package no.hvl.dat109.oblig2;

import java.time.LocalDate;
import java.util.Scanner;

public class Meny {
    private int kontornummer;
    private LocalDate utleieDato;
    private LocalDate returDato;

    /**
     * Opprett ny meny for utleiesøk
     *
     * @param selskap
     */
    public Meny(Selskap selskap) {
        System.out.println("Velkommen til " + selskap.getNavn() + " sitt utleiesøk!");
        System.out.println("Start med å velge et sted:");
        selskap.getKontorer().forEach(k -> System.out.println(k));
        Scanner scan = new Scanner(System.in);
        Integer valgtNummer = (Integer) scan.nextInt();
        setKontornummer(valgtNummer);

        System.out.println("Velg utleiedato (åååå-mm-dd):");
        setUtleieDato(LocalDate.parse(scan.nextLine()));

        System.out.println("Velg returdato (åååå-mm-dd):");
        setUtleieDato(LocalDate.parse(scan.nextLine()));

        scan.close();
    }

    /**
     * @return the kontornummer
     */
    public int getKontornummer() {
        return kontornummer;
    }

    /**
     * @param kontornummer the kontornummer to set
     */
    public void setKontornummer(int kontornummer) {
        this.kontornummer = kontornummer;
    }

    /**
     * @return the utleieDato
     */
    public LocalDate getUtleieDato() {
        return utleieDato;
    }

    /**
     * @param utleieDato the utleieDato to set
     */
    public void setUtleieDato(LocalDate utleieDato) {
        this.utleieDato = utleieDato;
    }

    /**
     * @return the returDato
     */
    public LocalDate getReturDato() {
        return returDato;
    }

    /**
     * @param returDato the returDato to set
     */
    public void setReturDato(LocalDate returDato) {
        this.returDato = returDato;
    }
}

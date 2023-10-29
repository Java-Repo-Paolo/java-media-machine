package org.lessons.java.lavanderia;

import org.lessons.java.lavanderia.macchine.Asciugatrice;
import org.lessons.java.lavanderia.macchine.Lavatrice;

import java.util.ArrayList;
import java.util.List;

public class Lavanderia {
    private List<Lavatrice> lavatrici = new ArrayList<>();
    private List<Asciugatrice> asciugatrici = new ArrayList<>();

    public Lavanderia (int numeroLavatrici, int numeroAsciugatrici){
        for (int i = 0; i < numeroLavatrici; i++) {
            lavatrici.add(new Lavatrice(i + 1));
        }
        for (int i = 0; i < numeroAsciugatrici; i++) {
            asciugatrici.add(new Asciugatrice(i + 1 + numeroLavatrici));
        }
    }

    public void stampaTabella(){
        System.out.println("NUM\tTIPO\t\t\tAPERTA\tGETTONI\tPROGRAMMA\tATTIVA\tDETERSIVO\tAMMORBIDENTE");
        for (Lavatrice l : lavatrici) {
            System.out.println(
                    l.getNumero() + "\tLAVATRICE\t" + "\t" + l.isAperta() +"\t" + l.getGettoni()
                    + "\t\t" + l.getProgrammaSelezionato() + "\t\t\t" + l.isInFunzione()
                    + "\t" + l.getSerbatoioDetersivo().getContenuto()
                    + "\t\t\t" + l.getSerbatoioAmmorbidente().getContenuto()
            );
        }
        for (Asciugatrice a : asciugatrici) {
            System.out.println(
                    a.getNumero() + "\tASCIUGATRICE\t" + a.isAperta() +"\t" + a.getGettoni()
                    + "\t\t" + a.getProgrammaSelezionato() + "\t\t\t" + a.isInFunzione()

            );
        }

    }
}

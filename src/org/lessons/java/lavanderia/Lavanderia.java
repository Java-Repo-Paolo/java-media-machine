package org.lessons.java.lavanderia;

import org.lessons.java.lavanderia.macchine.Asciugatrice;
import org.lessons.java.lavanderia.macchine.Lavatrice;
import org.lessons.java.lavanderia.macchine.Macchina;

import java.util.ArrayList;
import java.util.List;

public class Lavanderia {
    private List<Lavatrice> lavatrici = new ArrayList<>();
    private List<Asciugatrice> asciugatrici = new ArrayList<>();
    private String lastMessage = "Nessuna operazione effetuata fino ad ora";

    public Lavanderia (int numeroLavatrici, int numeroAsciugatrici){
        for (int i = 0; i < numeroLavatrici; i++) {
            lavatrici.add(new Lavatrice(i + 1));
        }
        for (int i = 0; i < numeroAsciugatrici; i++) {
            asciugatrici.add(new Asciugatrice(i + 1 + numeroLavatrici));
        }
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public Macchina trovaConId(int numero){
        for (Lavatrice l : lavatrici ){
            if (l.getNumero() == numero){
                return l;
            }
        }
        for (Asciugatrice a : asciugatrici ){
            if (a.getNumero() == numero){
                return a;
            }
        }
        return null;
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
    public void stampaComandi (){
        System.out.println("\n" +
                "== Lista comandi ==\n" +
                "Formato della stringa del comando : comando <numero_macchina> <parametro aggiuntivo>\n"                                              +
                "   Comando         Descrizione                                                         Parametro aggiuntivo\n"                       +
                "   \n"                                                                                                                               +
                "   apri            apre lo sportello                                                   -\n"                                          +
                "   chiudi          chiude lo sportello                                                 -\n"                                          +
                "   gettoni         inserisce il numero di gettoni nella macchina specificata           numero di gettoni positivo e maggiore di 0\n" +
                "   lista           fornisce la lista dei programmi                                     -\n"                                          +
                "   programma       seleziona il programma specificato sulla macchina indicata          numero del programma\n"                       +
                "   avvia           avvia il lavaggio o l’asciugatura sulla macchina specificata        -\n"                                          +
                "   ferma           ferma il lavaggio o l’asciugatura sulla macchina specificata        -\n"                                          +
                "   detersivo       ricarica il detersivo sulla macchina specificata                    quantità di detersivo\n"                      +
                "   ammorbidente    ricarica l'ammorbidente sulla macchina specificata                  quantità di ammorbidente"
        );

    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}

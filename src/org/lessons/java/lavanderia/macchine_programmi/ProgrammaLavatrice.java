package org.lessons.java.lavanderia.macchine_programmi;

public class ProgrammaLavatrice extends Programma{
    private int consumoDetersivo;
    private int consumoAmmorbidente;

    public ProgrammaLavatrice(int numero, String nome, int durata, int gettoni) {
        super(numero, nome, durata, gettoni);
        this.consumoDetersivo = consumoDetersivo;
        this.consumoAmmorbidente = consumoAmmorbidente;
    }

    public int getConsumoDetersivo() {
        return consumoDetersivo;
    }

    public int getConsumoAmmorbidente() {
        return consumoAmmorbidente;
    }
}

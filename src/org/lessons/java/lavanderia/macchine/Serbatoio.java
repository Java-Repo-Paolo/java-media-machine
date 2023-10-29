package org.lessons.java.lavanderia.macchine;

public class Serbatoio {
    private int capacitaMassima;
    private int contenuto;

    public Serbatoio(int capacitaMassima, int contenuto) {
        this.capacitaMassima = capacitaMassima;
        this.contenuto = contenuto;
    }

    public int getCapacitaMassima() {
        return capacitaMassima;
    }

    public int getContenuto() {
        return contenuto;
    }

    public void ricarica(int contenuto) {
        /*if (contenuto < 0){

        }*/
        this.contenuto += contenuto;
    }

    @Override
    public String toString() {
        return "Serbatoio{" +
                "capacitaMassima=" + capacitaMassima +
                ", contenuto=" + contenuto +
                '}';
    }
}

package org.lessons.java.lavanderia.macchine;

public abstract class Macchina {
    protected int numero;

    public Macchina(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}

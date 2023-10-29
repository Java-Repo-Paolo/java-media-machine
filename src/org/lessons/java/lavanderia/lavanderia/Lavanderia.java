package org.lessons.java.lavanderia.lavanderia;

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
}

package org.lessons.java.lavanderia.macchine;

import org.lessons.java.lavanderia.macchine_programmi.ProgrammaAsciugatrice;

import java.util.ArrayList;
import java.util.List;

public class Asciugatrice extends Macchina {
    private List<ProgrammaAsciugatrice> programmi = new ArrayList<>();
    public Asciugatrice(int numero){
        super(numero);
        programmi.add(new ProgrammaAsciugatrice (1, "Rapido", 20, 2));
        programmi.add(new ProgrammaAsciugatrice (2, "Intenso", 60, 4));

    }

    public List<ProgrammaAsciugatrice> getProgrammi() {
        return new ArrayList<>(programmi);
    }

    @Override
    public String toString() {
        return "Asciugatrice{" +
                "programmi=" + programmi +
                '}';
    }
}

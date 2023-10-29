package org.lessons.java.lavanderia.macchine;

import org.lessons.java.lavanderia.macchine_programmi.ProgrammaLavatrice;

import java.util.ArrayList;
import java.util.List;

public class Lavatrice extends Macchina {
    private Serbatoio serbatoioAmmorbidente = new Serbatoio(500, 0);
    private Serbatoio serbatoioDetersivo = new Serbatoio(1000, 0);
    private List<ProgrammaLavatrice> programmi = new ArrayList<>();
    public Lavatrice (int numero){
        super(numero);
        programmi.add(new ProgrammaLavatrice (1, "Rinfrescante", 20, 5, 25, 20));
        programmi.add(new ProgrammaLavatrice (2, "Rinnovante", 40, 10, 50, 40));
        programmi.add(new ProgrammaLavatrice (3, "Sgrassante", 60, 15, 100, 60));
    }

    public List<ProgrammaLavatrice> getProgrammi() {
        return new ArrayList<>(programmi);
    }

    public Serbatoio getSerbatoioAmmorbidente() {
        return serbatoioAmmorbidente;
    }

    public Serbatoio getSerbatoioDetersivo() {
        return serbatoioDetersivo;
    }

    @Override
    public String toString() {
        return "Lavatrice{" +
                "serbatoioAmmorbidente=" + serbatoioAmmorbidente +
                ", serbatoioDetersivo=" + serbatoioDetersivo +
                ", programmi=" + programmi +
                '}';
    }
}

package org.lessons.java.lavanderia.comandi;

import org.lessons.java.lavanderia.exceptions.LavanderiaException;
import org.lessons.java.lavanderia.macchine.Lavatrice;
import org.lessons.java.lavanderia.macchine.Macchina;
import org.lessons.java.lavanderia.macchine_programmi.ProgrammaLavatrice;

public class Avvia extends Comando {
    public Avvia(Macchina macchina) {
        super(macchina);
    }

    @Override
    public void esegui() {

        if (macchina instanceof Lavatrice){
            Lavatrice lavatrice = (Lavatrice)macchina;
            int programmaSelezionato = macchina.getProgrammaSelezionato();
            ProgrammaLavatrice programmaLavatrice = lavatrice.getProgrammi().get(programmaSelezionato - 1);

            if (programmaLavatrice.getConsumoDetersivo() > lavatrice.getSerbatoioDetersivo().getContenuto()){
                throw new LavanderiaException("Detersivo insufficiente");
            }
            if (programmaLavatrice.getConsumoAmmorbidente() > lavatrice.getSerbatoioAmmorbidente().getContenuto()){
                throw new LavanderiaException("Ammorbidente insufficiente");
            }
        }
        macchina.avvia();
    }


}

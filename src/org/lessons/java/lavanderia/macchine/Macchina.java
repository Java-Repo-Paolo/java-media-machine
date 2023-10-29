package org.lessons.java.lavanderia.macchine;

public abstract class Macchina {
    protected int numero;
    protected boolean aperta = true;
    protected int gettoni = 0;
    protected int programmaSelezionato = 0;
    protected boolean inFunzione = false;

    public Macchina(int numero, boolean aperta) {
        this.numero = numero;
        this.aperta = aperta;
    }

    public Macchina(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int getGettoni() {
        return gettoni;
    }

    public int getProgrammaSelezionato() {
        return programmaSelezionato;
    }

    public boolean isInFunzione() {
        return inFunzione;
    }

    public void chiudi(){
        this.aperta  = false;
    }

    public void apri(){
        this.aperta = true;
    }

    public boolean isAperta(){
        return aperta;
    }

    public void addGettoni(int gettoni){
        /*if (){

        }*/
        this.gettoni += gettoni;
    }

    public void setProgrammaSelezionato(int programmaSelezionato) {
        this.programmaSelezionato = programmaSelezionato;
    }

    public void setInFunzione(boolean inFunzione) {
        this.inFunzione = inFunzione;
    }

    public void avvia(){
        this.inFunzione = true;
    }

    public void arresta(){
        this.inFunzione = false;
    }
}

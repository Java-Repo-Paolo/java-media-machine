package org.lessons.java.lavanderia;


import org.lessons.java.lavanderia.comandi.Comando;
import org.lessons.java.lavanderia.comandi.CreatoreComandi;
import org.lessons.java.lavanderia.exceptions.LavanderiaException;
import org.lessons.java.lavanderia.macchine.Macchina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lavanderia lavanderia = new Lavanderia(3, 2);

        String comandoUtente = "";

        Scanner scanner = new Scanner(System.in);
        while (!comandoUtente.equals("esci")){
            lavanderia.stampaTabella();
            System.out.println(lavanderia.getLastMessage());
            lavanderia.stampaComandi();
            System.out.println("> ");
            comandoUtente = scanner.nextLine();

            String[] parti = comandoUtente.split(" ");
            String nomeComando = parti[0];
            int numeroMacchina = Integer.parseInt(parti[1]);
            Integer parametroAggiuntivo = null;
            if (parti.length == 3){
                parametroAggiuntivo = Integer.parseInt(parti[2]);
            }

            Macchina macchina = lavanderia.trovaConId(numeroMacchina);
            if ( macchina == null) {
                System.out.println("Macchina non trovata");
            } else {
                Comando comando = CreatoreComandi.crea(nomeComando, macchina, parametroAggiuntivo);
                try{
                    comando.esegui();
                    lavanderia.setLastMessage(comando.getMessaggioSuccesso());
                }catch (LavanderiaException e){
                    lavanderia.setLastMessage("ERRORE: " + e.getMessage());
                }
            }
        }
        scanner.close();
    }
}

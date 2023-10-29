package org.lessons.java.lavanderia;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lavanderia lavanderia = new Lavanderia(3, 2);

        String comando = "";

        Scanner scanner = new Scanner(System.in);
        while (!comando.equals("esci")){
            lavanderia.stampaTabella();
            System.out.println(lavanderia.getLastMessage());
            lavanderia.stampaComandi();
            System.out.println("> ");
            comando = scanner.nextLine();
        }
        scanner.close();
    }
}

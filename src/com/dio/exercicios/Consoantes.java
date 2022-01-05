package com.dio.exercicios;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] caractere = new String[6];
        String[] consoantes = new String[6];
        int consoanteCount = 0;

        for (int i=0; i < caractere.length; i++) {
            System.out.println("Letra:");
            caractere[i] = scan.next();
            if (!(caractere[i].equalsIgnoreCase("a") |
                    caractere[i].equalsIgnoreCase("e") |
                    caractere[i].equalsIgnoreCase("i") |
                    caractere[i].equalsIgnoreCase("o") |
                    caractere[i].equalsIgnoreCase("u"))){
                consoantes[consoanteCount] = caractere[i];
                consoanteCount++;
            }
        }

        System.out.println("Foram/Foi digitada(s) " + consoanteCount + " consoante(s)");
        for (int i=0; i < consoanteCount; i++) {
            System.out.print(consoantes[i] + " ");
        }


    }
}

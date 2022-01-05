package com.dio.exercicios;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        System.out.println("Digite uma nota entre 0 e 10");
        Scanner scan = new Scanner(System.in);
        System.out.println("Nota");
        int nota = scan.nextInt();

        while (nota<0 || nota>10) {
            System.out.println(nota + " Não é uma nota valida, Digite uma nota entre 0 e 10:");
            nota = scan.nextInt();
        }
    }
}

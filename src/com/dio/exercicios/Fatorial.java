package com.dio.exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplicacao = 1;

        System.out.println("Fatorial:");
        int fatorial = scan.nextInt();

        for (int i = 1; i <= fatorial; i++) {
            multiplicacao*= i;
        }

        System.out.println("O fatorial de " + fatorial + " e: " + multiplicacao);
    }
}

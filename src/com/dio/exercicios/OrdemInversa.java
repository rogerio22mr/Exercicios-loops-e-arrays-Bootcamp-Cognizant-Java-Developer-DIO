package com.dio.exercicios;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i=0; i < numeros.length; i++) {
            numeros[i] = scan.nextInt();
        }

        for (int i=1; i <= numeros.length; i++) {
            int numeroaux = numeros.length - i;
            System.out.println(numeros[numeroaux]);
        }
    }
}

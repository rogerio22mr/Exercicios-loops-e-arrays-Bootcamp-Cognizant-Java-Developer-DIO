package com.dio.exercicios;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random  = new Random();
        int[] numeros = new int[20];

        for(int i=0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("\n Sucessores dos Numeros Aleatorios: ");
        for (int numero : numeros) {
            System.out.print(numero+1 + " ");
        }
    }
}

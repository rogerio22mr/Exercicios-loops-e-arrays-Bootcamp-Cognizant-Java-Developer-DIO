package com.dio.exercicios;

import java.util.Scanner;

public class MaioreMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        double media = 0;
        int contador = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;

            media+= numero;
            contador++;
        } while (contador < 5);

        media/= 5;
        System.out.println("O maior numero digitado foi: " + maior);
        System.out.println("A media dos numeros e: " + media);
    }
}

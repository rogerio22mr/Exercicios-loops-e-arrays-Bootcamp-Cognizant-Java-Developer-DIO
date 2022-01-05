package com.dio.exercicios;

import java.util.Scanner;

public class PareImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int qtdNumero;
        int contador = 0;
        int par = 0;
        int impar = 0;

        System.out.println("Digite a quantidade de numeros que deseja digitar");
        qtdNumero = scan.nextInt();

        do {
            numero = scan.nextInt();
            if ((numero%= 2) == 0) par++;
            else impar++;
            contador++;
        } while (contador < qtdNumero);

        System.out.println("Quantidades de numeros pares digitados: " + par);
        System.out.println("Quantidade de numeros impar digitados: " + impar);

    }
}

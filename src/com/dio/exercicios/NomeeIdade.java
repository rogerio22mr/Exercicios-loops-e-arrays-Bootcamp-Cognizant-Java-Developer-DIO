package com.dio.exercicios;

import java.util.Scanner;

public class NomeeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int altura;

        while (true) {
            System.out.println("Nome:");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Idade:");
            altura = scan.nextInt();
        }
    }
}

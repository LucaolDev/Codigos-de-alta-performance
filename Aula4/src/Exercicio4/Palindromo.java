package Exercicio4;

import Pilhas.PilhaInt;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt();
        int digito;
        int[] leitura = new int[8];
        System.out.print("Informe digito (0...9): ");
        digito = sc.nextInt();
        int n = 0;
        while (digito >= 0) {
            leitura[n] = digito;
            n++;
            pilha.push(digito);
            System.out.print("Informe digito (0...9): ");
            digito = sc.nextInt();
        }
        boolean palindormo = true;
        for (int i = 0; i < n && palindormo; i++) {
            if (leitura[i] != pilha.pop()) {
                palindormo = false;
            }
        }
        if (palindormo) {
            System.out.println("É palindromo");
        } else {
            System.out.println("Não é palindormo");
        }
        sc.close();
    }
}

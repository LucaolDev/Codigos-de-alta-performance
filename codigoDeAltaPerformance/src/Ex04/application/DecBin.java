package Ex04.application;

import Ex03.pilhas.PilhaInt;

import java.util.Scanner;

public class DecBin {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int decimal, resto;
        System.out.println("Informe um valor inteiro em decimal: ");
        decimal = in.nextInt();
        PilhaInt pilha = new PilhaInt();
        pilha.init();
        while (decimal != 0){
            resto = decimal % 2;
            pilha.push(resto);
            decimal = decimal / 2;
        }
        System.out.print("Valor em binario: ");
        pilha.esvaziar();
        in.close();

    }
}

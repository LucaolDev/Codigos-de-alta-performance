package model;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private int rm;
    private double nota1, nota2, media;

    private final DecimalFormat df = new DecimalFormat("0.00");

    public void leitura() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("RM: ");
        rm = sc.nextInt();
        System.out.print("Nota 1: ");
        nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        nota2 = sc.nextDouble();
    }

//    public double calcularMedia() {
//        return (nota1 + nota2) / 2;
//    }

    public void calcularMedia() {
        media = (nota1 + nota2) / 2;
    }

    public void imprimir() {
        System.out.println("Aluno: " + nome + "\tRM: " + rm);
        System.out.println("Nota 1: " + df.format(nota1) + "\tNota 2: " + df.format(nota2));
        System.out.println("Média: " + df.format(media));
    }
}

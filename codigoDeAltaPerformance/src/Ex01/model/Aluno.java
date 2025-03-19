package Ex01.model;

import java.util.Scanner;

public class Aluno {
    String nome;
    int rm;
    double nota1, nota2, media;

    public void leitura(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nome :");
        nome = in.nextLine();
        System.out.print("RM :");
        rm = in.nextInt();
        System.out.print("Nota1 :");
        nota1 = in.nextDouble();
        System.out.print("Nota2 :");
        nota2 = in.nextDouble();
    }

    public void calculaMedia(){
        media = (nota1 + nota2) / 2;
    }

    public void apresenta(){
        System.out.println("Aluno: " + nome +"\t RM: " + rm);
        System.out.println("Nota1: " + nota1 + "\t Nota2: " + nota2);
        System.out.println("\t Media: " + media);
    }


}

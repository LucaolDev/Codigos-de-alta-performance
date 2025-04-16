package Exercicio3;

import Filas.FilaInt;

import java.util.Scanner;

public class AtendimentoDeAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opcao;
        do {
            System.out.println("1 - Inserir Aluno na Fila");
            System.out.println("2 - Retirar o Aluno da Fila");
            System.out.println("3 - Encerrar Atendimento");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o RM do aluno: ");
                    int rm = sc.nextInt();
                    fila.enqueue(rm);
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há alunos na fila!");
                    } else {
                        System.out.println("Aluno a ser retirado: " + fila.dequeue());
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Alunos presentes na fila! Esvazie para encerrar o atendimento");
                        opcao = 0;
                    } else {
                        System.out.println("Atendimento encerrado");
                    }
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        } while (opcao != 3);
    sc.close();
    }
}

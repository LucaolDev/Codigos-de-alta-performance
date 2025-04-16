package Exercicio5;

import Filas.FilaString;

import java.util.Scanner;

public class Consultorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaString fila = new FilaString();
        fila.init();
        int opcao;
        do {
            System.out.println("1 - Inserir Paciente na Fila");
            System.out.println("2 - Retirar o Paciente da Fila");
            System.out.println("3 - Encerrar Atendimento");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do paciente: ");
                    String nome = sc.next();
                    fila.enqueue(nome);
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há pacientes na fila!");
                    } else {
                        System.out.println("Paciente retirado: " + fila.dequeue());
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Pacientes presentes na fila! Esvazie para encerrar o atendimento");
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

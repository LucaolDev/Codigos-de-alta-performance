package Exercicio4;

import Filas.FilaInt;

import java.util.Random;
import java.util.Scanner;

public class Processador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opcao;
        do {
            System.out.println("1 - Inserir o Processo na Fila");
            System.out.println("2 - Retirar o Processo da Fila para a execução");
            System.out.println("3 - Shutdown");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("PID: ");
                    int pid = sc.nextInt();
                    fila.enqueue(pid);
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há processos na fila!");
                    } else {
                        pid = fila.dequeue();
                        System.out.println("Processo em execução: " + pid);
                        System.out.println(aleatorizarReticencias() + "O processo foi concluido? (1-sim)");
                        int resp = sc.nextInt();
                        if (resp == 1) {
                            System.out.println("Processo " + pid + " concluído com sucesso");
                        } else {
                            fila.enqueue(pid);
                            System.out.println("O processo retornou a fila'");
                        }
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Ainda há processos na fila");
                        System.out.println("Deseja encerrar todos? (1-sim)");
                        int resp = sc.nextInt();
                        if (resp == 1) {
                            int processo;
                            while (!fila.isEmpty()) {
                                processo = fila.dequeue();
                                System.out.println("Encerrando o processo " + processo);
                                System.out.println(aleatorizarReticencias() + "Processo " + processo + " encerrado");
                            }
                        } else {
                            opcao = 0;
                        }
                    } else {
                        System.out.println("O Sistema será encerrado");
                    }
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        } while (opcao != 3);
        System.out.println("Shutdown");
        sc.close();
    }

    private static String aleatorizarReticencias() {
        Random rd = new Random();
        String aux = ".";
        int num = rd.nextInt(3, 5);
        for (int i = 0; i < num; i++) {
            aux += ".";
        }
        return aux;
    }
}

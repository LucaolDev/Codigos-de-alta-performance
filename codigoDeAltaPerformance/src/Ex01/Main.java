package Ex01;

import java.util.Scanner;

public class Main {
    static final int N = 30;

    public static void main(String[] args) {
        int[] rm = new int[30];
        double[] nota1 = new double[30];
        double[] nota2 = new double[30];
        double[] media = new double[30];
        int n = entradaDados(rm, nota1, nota2);
        calculaMedia(n, nota1, nota2, media);

        for(int i = 0; i < n; ++i) {
            media[i] = (nota1[i] + nota2[i]) / 2.0;
            System.out.println("RM: " + rm[i] + "\tMédia: " + media[i]);
        }

        int[] aprovados = new int[n];
        int nAp = geraListaAprovados(n, media, rm, aprovados);
        System.out.println("\nAlunos aprovados:");

        for(int i = 0; i < nAp; ++i) {
            System.out.println("RM: " + aprovados[i]);
        }

    }

    static int geraListaAprovados(int n, double[] media, int[] rm, int[] aprovados) {
        int nAp = 0;

        for(int i = 0; i < n; ++i) {
            if (media[i] >= 6.0) {
                aprovados[nAp] = rm[i];
                ++nAp;
            }
        }

        return nAp;
    }

    static void calculaMedia(int n, double[] nota1, double[] nota2, double[] media) {
        for(int i = 0; i < n; ++i) {
            media[i] = nota1[i] + nota2[i] / 2.0;
        }

    }

    public static int entradaDados(int[] rm, double[] nota1, double[] nota2) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o RM do aluno ou um número negativo para sair: ");
        int rmLe = sc.nextInt();

        int n;
        for(n = 0; rmLe > 0 && n < 30; rmLe = sc.nextInt()) {
            rm[n] = rmLe;
            System.out.print("Digite a primeira nota do aluno: ");
            nota1[n] = sc.nextDouble();
            System.out.print("Digite a segunda nota do aluno: ");
            nota2[n] = sc.nextDouble();
            ++n;
            System.out.print("Digite o RM do aluno ou um número negativo para sair: ");
        }

        if (n >= 30) {
            System.out.println("Número máximo de alunos foi ultrapassado");
        }

        return n;
    }
}
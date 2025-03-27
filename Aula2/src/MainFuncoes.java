import java.util.Scanner;

public class MainFuncoes {
    static final int N = 30;

    public static void main(String[] args) {


        int[] rm = new int[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];
        double[] media = new double[N];

        int quantidadeAlunos = entradaDados(rm, nota1, nota2);
        calculaMedia(quantidadeAlunos, nota1, nota2, media);

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("RM: " + rm[i] + "\tMédia: " + media[i]);
        }
        int[] aprovados = new int[quantidadeAlunos];
        int quantidadeAprovados = gerarListaAprovados(quantidadeAlunos, media, rm, aprovados);

        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < quantidadeAprovados; i++) {
            System.out.println(aprovados[i]);
        }
    }

    static int entradaDados(int[] rm, double[] nota1, double[] nota2) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o RM do aluno ou um número negativo para sair: ");
        int rmLe = sc.nextInt();
        int quantidadeAlunos = 0;
        while (rmLe > 0 && quantidadeAlunos < N) {
            rm[quantidadeAlunos] = rmLe;
            System.out.print("Digite a primeira nota do aluno: ");
            nota1[quantidadeAlunos] = sc.nextDouble();
            System.out.print("Digite a segunda nota do aluno: ");
            nota2[quantidadeAlunos] = sc.nextDouble();
            quantidadeAlunos++;
            System.out.print("Digite o RM do aluno ou um número negativo para sair: ");
            rmLe = sc.nextInt();
            System.out.println();
        }
        if (quantidadeAlunos >= N) {
            System.out.println("Quantidade máxima de alunos atingida!");
        }
        return quantidadeAlunos;
    }

    static void calculaMedia(int quantidadeAlunos, double[] nota1, double[] nota2, double[] media) {
        for (int i = 0; i < quantidadeAlunos; i++) {
            media[i] = (nota1[i] + nota2[i] / 2);
        }
    }

    static int gerarListaAprovados(int quantidadeAlunos, double[] media, int[] rm, int[] aprovados) {
        int quantidadeAprovados = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (media[i] >= 6) {
                aprovados[quantidadeAprovados] = rm[i];
                quantidadeAprovados++;
            }
        }
        return quantidadeAprovados;
    }
}

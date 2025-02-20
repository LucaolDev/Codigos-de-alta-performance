import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rmLe;
        final int N = 30;
        int[] rm = new int[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];
        double[] media = new double[N];

        System.out.print("Digite o RM do aluno ou um número negativo para sair: ");
        rmLe = sc.nextInt();

        int quantidadeAlunos = 0;
        while (rmLe > 0 && quantidadeAlunos < N) {
            rm[quantidadeAlunos] = rmLe;
            System.out.print("Digite a primeira nota do aluno: ");
            nota1[quantidadeAlunos] = sc.nextDouble();
            System.out.print("Digite a segunda nota do aluno: ");
            nota2[quantidadeAlunos] = sc.nextDouble();
            media[quantidadeAlunos] = (nota1[quantidadeAlunos] + nota2[quantidadeAlunos]) / 2;
            quantidadeAlunos++;
            System.out.print("Digite o RM do aluno ou um número negativo para sair: ");
            rmLe = sc.nextInt();
        }

        if (quantidadeAlunos >= N) {
            System.out.println("Quantidade máxima de alunos atingida!");
        }

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("RM: " + rm[i] + "\tMédia: " + media[i]);
        }
        int[] aprovados = new int[quantidadeAlunos];
        int quantidadeAprovados = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {
            if (media[i] >= 6) {
                aprovados[quantidadeAprovados] = rm[i];
                quantidadeAprovados++;
            }
        }

        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < quantidadeAprovados; i++) {
            System.out.println(aprovados[i]);
        }
    }
}
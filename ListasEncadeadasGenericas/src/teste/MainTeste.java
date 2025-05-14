package teste;

import listas.ListaIntCrescente;

import java.util.Scanner;

public class MainTeste {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaIntCrescente lista = new ListaIntCrescente();

        System.out.println("Informe valor positio para inserir (negativo para encerrar)");
        int valor = in.nextInt();

        while (valor >= 0){
            lista.insere(valor);
            lista.mostra();
            System.out.println("Informe valor positio para inserir (negativo para encerrar)");
            valor = in.nextInt();
        }

        in.close();
    }
}

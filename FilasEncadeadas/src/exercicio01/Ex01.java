package exercicio01;

import filas.FilaInt;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        System.out.println("Informe um valor positivo para inserir na fila: ");
        int valor = in.nextInt();
        while (valor >= 0){
            fila.enqueue(valor);
            System.out.println("Informe um valor positivo para inserir na fila: ");
            valor = in.nextInt();
        }
        System.out.println("Esvaziando a fila: ");
        while (!fila.isEmpty()){
            System.out.println("Retirando valor " + fila.dequeue());
        }
        in.close();
    }
}

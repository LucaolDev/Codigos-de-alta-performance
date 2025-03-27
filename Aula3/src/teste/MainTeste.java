package teste;

import Pilhas.PilhaInt;

import java.util.Stack;

public class MainTeste {
    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();
        pilha.init();
        pilha.push(10);
        pilha.push(12);
        pilha.push(10);
        pilha.push(22);
        pilha.push(33);
        pilha.push(33);
        pilha.push(44);
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
    }
}

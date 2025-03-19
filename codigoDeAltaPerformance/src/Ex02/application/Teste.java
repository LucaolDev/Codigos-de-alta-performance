package Ex02.application;

import Ex02.pilhas.PilhaInt;

public class Teste {

    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();
        pilha.init();
        pilha.push(10);
        pilha.push(12);
        pilha.push(5);
        pilha.push(80);
        pilha.push(42);
        pilha.push(29);
        pilha.push(29);
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
        System.out.println("Valor retirado da pilha: " + pilha.pop());
    }

}

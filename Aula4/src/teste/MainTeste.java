package teste;

import Pilhas.PilhaInt;

import java.util.Stack;

public class MainTeste {
    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();
        pilha.init();
        pilha.push(11);
        pilha.push(22);
        pilha.push(33);
        pilha.push(44);
        pilha.push(55);
        pilha.push(66);
        if (pilha.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Valor no topo da pilha: " + pilha.top());
        }
        pilha.esvaziar();
        System.out.println();
        System.out.println(pilha.isEmpty());
    }
}

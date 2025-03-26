package Ex03.application;

import Ex03.pilhas.PilhaInt;

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
        if (pilha.isEmpty()){
            System.out.println("Stack is empty");
        }else {
            System.out.println("Valor no topo da pilha " + pilha.top());
            System.out.println("Apresentando todos os valores que foram empilhados");

        }
        pilha.esvaziar();

    }

}

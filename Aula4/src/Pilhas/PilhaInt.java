package Pilhas;

public class PilhaInt {
    final int N = 6;
    int[] dados = new int[N];
    int topo;

    public void init() {
        topo = 0;
    }

    public boolean isFull() {
        return topo == N;
    }

    public boolean isEmpty() {
        return topo == 0;
    }

    public int top() {
        return dados[topo - 1];
    }

    public void push(int elem) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        dados[topo] = elem;
        topo++;
    }

    public int pop() {
        topo--;
        return dados[topo];
    }

    public void esvaziar() {
        while(!isEmpty()) {
            System.out.print("\t" + pop());
        }
    }
}

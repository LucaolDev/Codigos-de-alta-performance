package filas;

public class FilaInt {

    private class NO{
        int dado;
        NO prox;
    }
    private NO ini, fim;

    public void init(){
        ini = fim = null;
    }

    public boolean isEmpty(){
        return (ini == null) && (fim == null);
    }
}

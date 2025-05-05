package exemplo2;

public class Ex2_ListaEncadeada {
    public static void main(String[] args) {
        NO lista = new NO();
        lista.dado = 1;
        lista.prox = null;

        NO novo = new NO();
        novo.dado = 2;
        novo.prox = null;

        lista.prox = novo;
        NO novo2 = new NO();
        novo2.dado = 3;
        novo2.prox = lista;
        System.out.println("novo2: " + novo2 + "\tdado: " + novo2.dado + "\tprox: " + novo2.prox);

        System.out.println("lista: " + lista + "\tdado: " + lista.dado + "\tprox: " + lista.prox);
        System.out.println("novo: " + novo + "\tdado: " + novo.dado + "\tprox: " + novo.prox);

        lista = novo2;
        System.out.println("Apresentando NOs na lista");
        NO aux = lista;
        while(aux != null) {
            System.out.println(aux.dado);
            aux = aux.prox;
        }
    }
}

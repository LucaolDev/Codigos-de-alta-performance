package Ex02.application;

import Ex02.model.Aluno;

public class PlanilhaNotas {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.leitura();
        a1.calculaMedia();
        a1.apresenta();

    }
}

package Ex01.application;

import Ex01.model.Aluno;

public class PlanilhaNotas {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.leitura();
        a1.calculaMedia();
        a1.apresenta();

    }
}

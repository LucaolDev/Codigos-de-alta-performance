package app;

import model.Aluno;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.leitura();
        aluno.calcularMedia();
        aluno.imprimir();

    }
}
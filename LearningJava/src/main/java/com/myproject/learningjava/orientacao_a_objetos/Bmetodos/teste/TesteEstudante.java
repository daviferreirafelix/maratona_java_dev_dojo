package com.myproject.learningjava.orientacao_a_objetos.Bmetodos.teste;
import com.myproject.learningjava.orientacao_a_objetos.Bmetodos.dominio.Estudante;
import com.myproject.learningjava.orientacao_a_objetos.Bmetodos.dominio.ImprimeEstudante;

public class TesteEstudante {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();

        estudante.age = 22;
        estudante.nome = "Davi";
        estudante.id = 01234;
        estudante.sexo = 'm';

        estudante2.age = 18;
        estudante2.nome = "Ana";
        estudante2.id = 56789;
        estudante2.sexo = 'f';

        imprimeEstudante.imprimeEstudante(estudante);
        imprimeEstudante.imprimeEstudante(estudante2);
    }
}

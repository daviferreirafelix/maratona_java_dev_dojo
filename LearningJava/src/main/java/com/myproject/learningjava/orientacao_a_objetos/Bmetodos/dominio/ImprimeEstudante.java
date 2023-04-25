package com.myproject.learningjava.orientacao_a_objetos.Bmetodos.dominio;

public class ImprimeEstudante {
    public void imprimeEstudante(Estudante estudante) {
        System.out.println("---------------------------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.age);
        System.out.println(estudante.sexo);
        System.out.println(estudante.id);
    }
}
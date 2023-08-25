package com.myproject.learningjava.orientacao_a_objetos.Minterfaces.dominio;

public interface LancaNota {

    int lancaNotas();

    default void alunoReprovou(){
        System.out.println("O aluno foi reprovado");
    }
}

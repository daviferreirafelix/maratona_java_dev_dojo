package com.myproject.learningjava.objects.Minterfaces.dominio;

public interface LancaNota {

    int lancaNotas();

    default void alunoReprovou(){
        System.out.println("O aluno foi reprovado");
    }
}

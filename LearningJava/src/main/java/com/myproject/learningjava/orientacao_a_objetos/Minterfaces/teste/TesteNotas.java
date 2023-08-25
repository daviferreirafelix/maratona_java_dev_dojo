package com.myproject.learningjava.orientacao_a_objetos.Minterfaces.teste;

import com.myproject.learningjava.orientacao_a_objetos.Minterfaces.dominio.Notas;

public class TesteNotas {
    public static void main(String[] args) {
        Notas nota = new Notas();

        System.out.println("Sua nota foi: " + nota.lancaNotas());

        nota.alunoReprovou();
    }
}

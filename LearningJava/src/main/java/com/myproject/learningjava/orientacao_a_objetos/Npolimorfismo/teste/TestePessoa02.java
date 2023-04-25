package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.teste;

import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio.*;

public class TestePessoa02 {
    public static void main(String[] args) {
        Maria maria = new Maria("Maria", 22, 5000, Profissoes.PROFESSOR);

        // é possivel alterar de qual subclasse da superclasse virá os dados do método apenas trocando o objeto referente
        CalcularAposentadoria calcularAposentadoria = new Joao("João", 23, 2500, Profissoes.FAXINEIRO);

        maria.setCorPele("branca");
        System.out.println(calcularAposentadoria.porcentagemSalarioParaAposentadoria());
    }
}

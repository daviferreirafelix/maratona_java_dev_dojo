package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.teste;

import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio.*;
import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.servico.RelatorioFuncionarios;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa maria = new Maria("Maria", 22, 5500, Profissoes.PROFESSOR);
        Pessoa joao = new Joao("Jão", 21, 2000, Profissoes.FAXINEIRO);
        Pessoa davi = new Davi("Davi", 22, 0, Profissoes.FAXINEIRO);
        Pessoa ana = new Ana("Ana", 34,  5400, Profissoes.COZINHEIRO);


        RelatorioFuncionarios.relatorioPessoa(joao);
        System.out.println("---------------------------------------------------------");
        RelatorioFuncionarios.relatorioPessoa(maria);
        System.out.println("---------------------------------------------------------");
        RelatorioFuncionarios.relatorioPessoa(davi);
        System.out.println("---------------------------------------------------------");
        RelatorioFuncionarios.relatorioPessoa(ana);
        System.out.println("---------------------------------------------------------");

        // por conta do tipo do parâmetro do método ser do mesmo tipo da superclasse do objeto Jose, podemos passar a sua criação
        // diretamente como argumento pra chamada deste método
        RelatorioFuncionarios.relatorioPessoa(new Jose("José", 21, 2000, Profissoes.COZINHEIRO));
        System.out.println("---------------------------------------------------------");
        RelatorioFuncionarios.relatorioPessoa(new Ana("Anaaaaaaaaa2", 22, 0, Profissoes.PROFESSOR));

    }
}

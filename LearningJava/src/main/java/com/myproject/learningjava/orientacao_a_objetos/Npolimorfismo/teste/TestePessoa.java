package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.teste;

import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio.*;
import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.servico.RelatorioFuncionarios;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa maria = new Maria("Maria", 22, 5500, Profissoes.PROFESSOR, "branca");
        Pessoa ana = new Ana("Ana", 34,  5400, Profissoes.COZINHEIRO);


        RelatorioFuncionarios.relatorioPessoa(maria);
        System.out.println("---------------------------------------------------------");
        RelatorioFuncionarios.relatorioPessoa(ana);
        System.out.println("---------------------------------------------------------");
    }
}

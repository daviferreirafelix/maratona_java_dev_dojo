package com.myproject.learningjava.objects.Npolimorfismo.teste;

import com.myproject.learningjava.objects.Npolimorfismo.dominio.Joao;
import com.myproject.learningjava.objects.Npolimorfismo.dominio.Maria;
import com.myproject.learningjava.objects.Npolimorfismo.dominio.Profissoes;

public class TestePessoa {
    public static void main(String[] args) {
        Maria maria = new Maria("Maria", 22, 2.500, Profissoes.PROFESSOR);
        Joao joao = new Joao("Jão", 21, 2.000, Profissoes.FAXINEIRO);

        System.out.println(joao.porcentagemSalarioParaAposentadoria() + " valor do salário que João tem que dedicar.");
        System.out.println("Sua prfissão é "+ Profissoes.FAXINEIRO.getTipoProfissao());
        System.out.println(maria.porcentagemSalarioParaAposentadoria() + " valor do salário que Maria tem que dedicar.");
    }
}

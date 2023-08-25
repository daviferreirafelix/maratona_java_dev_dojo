package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.servico;

import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio.Maria;
import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio.Pessoa;

public class RelatorioFuncionarios {

    // imprime os dados de qualquer classe do tipo Funcionario criado através da superclasse dele (Pesssoa)
    public static void relatorioPessoa(Pessoa pessoa){
        System.out.println("RELATÓRIO COM REFERENCIA A SUPERCLASSE");
        System.out.println("Funcionário(a): "+pessoa.getNome());
        System.out.println("Profissão: "+pessoa.getProfissoes());
        System.out.println("Salário: "+pessoa.getSalario());
        System.out.println("Idade: "+pessoa.getIdade());
        double valorImposto = pessoa.porcentagemSalarioParaAposentadoria();

        
        if (pessoa instanceof Maria)  {   
            Maria maria = (Maria) pessoa;
            System.out.println("Cor da pele Maria: "+maria.getCorPele());
        } else System.out.println("impossível buscar a cor de pele de Maria.");

        System.out.println("Porcentagem a dedicar do salário para aposentadoria: "+valorImposto);
    }
}

package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.servico;

import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio.Maria;
import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio.Pessoa;

public class RelatorioFuncionarios {

    // imprime os dados de qualquer funcionario criado através da superclasse Pessoa
    public static void relatorioPessoa(Pessoa pessoa){
        System.out.println("RELATÓRIO COM REFERENCIA GENÉRICA A SUPERCLASSE");
        System.out.println("Funcionário(a): "+pessoa.getNome());
        System.out.println("Profissão: "+pessoa.getProfissoes());
        System.out.println("Salário: "+pessoa.getSalario());
        System.out.println("Idade: "+pessoa.getIdade());
        double valorImposto = pessoa.porcentagemSalarioParaAposentadoria();

        // por este método receber como parametro uma superclasse generica, se torna impossivel acessar qualquer propriedade
        // especifica de suas subclasses, pra ser possivel existe o narrowing cast que consiste em "pegar de volta o objeto
        // especifico que foi passado" da superclasse parametro deste método

        // faz a análise se a instancia do parametro é Maria e retorna a cor de pele dela caso sim
        if (pessoa instanceof Maria)  {
            Maria maria = (Maria) pessoa;
            System.out.println("Cor da pele Maria: "+maria.getCorPele());
        } else System.out.println("impossível buscar a cor de pele de Maria.");

        System.out.println("Porcentagem a dedicar do salário para aposentadoria: "+valorImposto);
    }
}

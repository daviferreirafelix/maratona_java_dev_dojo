package com.myproject.learningjava.objects.Npolimorfismo.dominio;

public class Joao extends Pessoa{
    public Joao(String nome, int idade, double salario, Profissoes profissoes){
        super(nome, idade, salario, profissoes);
    }

    @Override
    public double porcentagemSalarioParaAposentadoria() {
        for (Profissoes prof : Profissoes.values()){
            if (!(prof.equals(Profissoes.ENEGENHEIRO)) && !(prof.equals(Profissoes.PROFESSOR))){
                return super.salario * 0.05;
            }
        }

        return super.salario * 0.2;
    }
}

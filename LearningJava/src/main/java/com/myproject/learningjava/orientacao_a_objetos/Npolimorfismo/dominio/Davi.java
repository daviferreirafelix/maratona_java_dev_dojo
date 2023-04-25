package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio;

public class Davi extends Pessoa{
    public final double PORCENTAGEM_APOSENTADORIA_SALARIO_ALTO = 0.2;
    public final double PORCENTAGEM_APOSENTADORIA_SALARIO_BAIXO = 0.05;

    public Davi(String nome, int idade, double salario, Profissoes profissoes) {
        super(nome, idade, salario, profissoes);
    }

    @Override
    public double porcentagemSalarioParaAposentadoria() {
        if (super.getSalario() > 3.500){
            return super.getSalario() * PORCENTAGEM_APOSENTADORIA_SALARIO_ALTO;
        }
        return super.getSalario() * PORCENTAGEM_APOSENTADORIA_SALARIO_BAIXO;
    }
}

package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio;

public abstract class Pessoa implements CalcularAposentadoria{
    private final String nome;
    private final int idade;
    private final double salario;
    private final Profissoes profissoes;
    protected static final double PORCENTAGEM_APOSENTADORIA_SALARIO_ALTO = 0.2;
    protected static final double PORCENTAGEM_APOSENTADORIA_SALARIO_BAIXO = 0.05;

    public Pessoa(String nome, int idade, double salario, Profissoes profissoes){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.profissoes = profissoes;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public Profissoes getProfissoes() {
        return profissoes;
    }



}

package com.myproject.learningjava.objects.Npolimorfismo.dominio;

public abstract class Pessoa implements CalcularAposentadoria{
    protected String nome;
    protected int idade;
    protected double salario;
    protected  Profissoes profissoes;

    public Pessoa(String nome, int idade, double salario, Profissoes profissoes){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.profissoes = profissoes;
    }
}

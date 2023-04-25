package com.myproject.learningjava.orientacao_a_objetos.Lclassesabstratas.dominio;

public abstract class Animal extends Natureza{
    protected String nome;
    protected int idade;

    public Animal(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
        // chamada do método da classe abstrata, onde apenas as classes filhas o executarão pois somente elas possuem
        // os objetos
        adicionarSobreNome();
    }

    public abstract void adicionarSobreNome();

    // o método foi sobrescrito na classe filha da classe abstrata natureza
    @Override
    public void imprimeNatureza(){
        System.out.println("Natureza");
    }
}

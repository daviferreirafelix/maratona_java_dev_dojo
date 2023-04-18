package com.myproject.learningjava.objects.Lclassesabstratas.dominio;

public abstract class Animal extends Natureza{
    protected String nome;
    protected int idade;

    public Animal(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
        adicionarSobreNome();
    }

    public abstract void adicionarSobreNome();

    // o método foi sobrescrito na classe filha da classe abstrata natureza
    @Override
    public void imprimeNatureza(){
        System.out.println("Natureza");
    }
}

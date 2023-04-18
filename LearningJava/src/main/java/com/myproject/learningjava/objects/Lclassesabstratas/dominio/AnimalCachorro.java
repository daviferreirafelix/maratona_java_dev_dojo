package com.myproject.learningjava.objects.Lclassesabstratas.dominio;

public class AnimalCachorro extends Animal{
    protected String especieAnimal;

    public AnimalCachorro(int idade, String nome, String especieAnimal){
        super(idade, nome);
        this.especieAnimal = especieAnimal;
    }

    @Override
    public void adicionarSobreNome() {
        super.nome = super.nome + " " + "Lourenço";
    }
}

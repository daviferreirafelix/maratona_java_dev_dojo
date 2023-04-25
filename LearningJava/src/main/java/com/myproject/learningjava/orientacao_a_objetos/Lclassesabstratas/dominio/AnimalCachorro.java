package com.myproject.learningjava.orientacao_a_objetos.Lclassesabstratas.dominio;

// primeira generalização da classe abstrata
public class AnimalCachorro extends Animal{
    protected String especieAnimal;

    public AnimalCachorro(int idade, String nome, String especieAnimal){
        super(idade, nome);
        this.especieAnimal = especieAnimal;
    }

    // sobrescrita do método da classe abstrata
    @Override
    public void adicionarSobreNome() {
        super.nome = super.nome + " " + "Lourenço";
    }
}

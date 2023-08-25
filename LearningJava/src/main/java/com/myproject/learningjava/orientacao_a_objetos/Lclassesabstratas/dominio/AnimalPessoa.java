package com.myproject.learningjava.orientacao_a_objetos.Lclassesabstratas.dominio;

public class AnimalPessoa extends Animal{
    protected String especieAnimal;

    public AnimalPessoa(int idade, String nome, String especieAnimal){
        super(idade, nome);
        this.especieAnimal = especieAnimal;
    }


    // o método foi sobrescrito na classe neta da classe abstrata natureza
    @Override
    public void imprimeNatureza(){
        System.out.println("Naturezaaaaaaaaaaaaaaaa");
    }

    @Override
    public void adicionarSobreNome() {
        super.nome = super.nome + " " + "da Silva";
    }

    @Override
    public String toString() {
        return "AnimalPessoa{" +
                "especieAnimal='" + especieAnimal + '\'' + " Nome: " + super.nome +
                '}';
    }

    public String getEspecieAnimal(){
        return this.especieAnimal;
    }
}

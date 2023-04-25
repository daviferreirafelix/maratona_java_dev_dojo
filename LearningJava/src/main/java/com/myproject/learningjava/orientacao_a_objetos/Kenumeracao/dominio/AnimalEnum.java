package com.myproject.learningjava.orientacao_a_objetos.Kenumeracao.dominio;

public enum AnimalEnum {
    CACHORRO("Totó"),
    HUMANO("Davi"),
    GATO("Floquinho");

    private String nome;

    AnimalEnum(String nome){
        this.nome = nome;
    }

    // método para capturar a propriedade "nome"
    public String getNome(){
        return nome;
    }
}

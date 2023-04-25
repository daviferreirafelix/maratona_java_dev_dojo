package com.myproject.learningjava.orientacao_a_objetos.Fmodificadoresestaticos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;

//  o modificador STATIC serve para levar a variável a pertencer totalmente à classe e não mais apenas como uma
//  instância dela, igual é com os objetos, com isso, qualquer modificação feita nela por qualquer objeto
//  instanciado da sua classe fará alterações na mesma num escopo global, alterando-a em todos os objetos existentes
    public static double velocidadeLimite;
        {
        velocidadeLimite = 250;
    }

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = this.velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("------------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima(){
        return velocidadeMaxima;
    }
}

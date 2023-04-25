package com.myproject.learningjava.orientacao_a_objetos.Bmetodos.dominio;

public class Funcionario {
    private String nome;
    private int cpf;
    private String nascimento;
    private double[] salarios = {0.0,0.0,0.0};
    private int id_cargo;
    private double mediaSalarial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public double getMediaSalarial() {
        return mediaSalarial;
    }

    public void setMediaSalarial(double mediaSalarial) {
        this.mediaSalarial = mediaSalarial;
    }
}

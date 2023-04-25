package com.myproject.learningjava.orientacao_a_objetos.Hheranca.dominio;

public class Professor {
    private String nome;
    private long cpf;
    private String email_institucional;
    private double salario;

    public void imprime() {
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Email Institucional: "+this.email_institucional);
        System.out.println("Salário professor: "+this.salario);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public String getEmail_institucional() {
        return email_institucional;
    }
    public void setEmail_institucional(String email_institucional) {
        this.email_institucional = email_institucional;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

package com.myproject.learningjava.orientacao_a_objetos.Csobrecargametodos.dominio;

public class Cliente {
    private String nome;
    private String endereco;
    private int cpf;
    private char sexo;
    private int telefone;

    public void cliente(String nome, String endereco, int cpf, char sexo){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.sexo = sexo;
    }

// SOBRECARGA DE MÉTODOS É UMA FORMA DE ALTERAR AS PROPRIEDADES E PARÂMETROS DE UM MÉTODO SEM OCORRER A QUEBRA
// DO RESTANTE DO CÓDIGO, FAZENDO A REPETIÇÃO DO NOME DE UM MÉTODO EM OUTRO MÉTODO NOVO, MAS ADICIONANDO
// OU ALTERANDO ALGUM PARÂMETRO, BASICAMENTE SOBREESCREVER UM ANTIGO MÉTODO

    public void cliente(String nome, String endereco, int cpf, char sexo, int telefone){
        this.cliente(nome, endereco, cpf, sexo);
        this.telefone = telefone;
    }

    public void imprimeCliente(){
        System.out.println(this.nome);
        System.out.println(this.sexo);
        System.out.println(this.cpf);
        System.out.println(this.endereco);
        System.out.println(this.telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}



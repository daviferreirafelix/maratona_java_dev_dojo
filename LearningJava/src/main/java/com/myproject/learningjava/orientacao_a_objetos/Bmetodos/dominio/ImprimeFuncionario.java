package com.myproject.learningjava.orientacao_a_objetos.Bmetodos.dominio;

public class ImprimeFuncionario {
    public void imprimeFuncionairo(Funcionario funcionario){
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Data de Nascimento: " + funcionario.getNascimento());
        System.out.println("Identificador de Cargo: " + funcionario.getId_cargo());

        double salario = 0;
        for (int i = 0; i < funcionario.getSalarios().length; i++){
            System.out.println("Salário " + (i+1) + ": " + funcionario.getSalarios()[i]);
        }
    }

//  Sobrecarga de método: técnica para evitar a quebra de código durante a passagem de novos
//  parãmetros ou alteração à um método já existente

    public void imprimeFuncionairo(Funcionario funcionario, String abs){
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Data de Nascimento: " + funcionario.getNascimento());
        System.out.println("Identificador de Cargo: " + funcionario.getId_cargo());
        System.out.println("A média salarial é: " + funcionario.getMediaSalarial());

        double salario = 0;
        for (int i = 0; i < funcionario.getSalarios().length; i++){
            System.out.println("Salário " + (i+1) + ": " + funcionario.getSalarios()[i]);
        }
    }
}

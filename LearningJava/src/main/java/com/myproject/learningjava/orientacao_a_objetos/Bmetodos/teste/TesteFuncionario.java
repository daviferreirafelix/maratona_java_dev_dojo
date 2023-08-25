package com.myproject.learningjava.orientacao_a_objetos.Bmetodos.teste;
import com.myproject.learningjava.orientacao_a_objetos.Bmetodos.dominio.Funcionario;
import com.myproject.learningjava.orientacao_a_objetos.Bmetodos.dominio.ImprimeFuncionario;
import com.myproject.learningjava.orientacao_a_objetos.Bmetodos.dominio.MediaSalarial;

import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImprimeFuncionario imprime = new ImprimeFuncionario();
        Funcionario funcionario01 = new Funcionario();
        MediaSalarial mediaSalarial = new MediaSalarial();

        System.out.println("Insira o nome do funcionário: ");
        funcionario01.setNome(scanner.next());
        System.out.println("Insira o CPF do funcionário: ");
        funcionario01.setCpf(scanner.nextInt());
        System.out.println("Insira a data de nascimento do funcionário no formato DD-MM-AAAA: ");
        funcionario01.setNascimento(scanner.next());
        System.out.println("Insira o número de identificação do cargo: ");
        funcionario01.setId_cargo(scanner.nextInt());
        funcionario01.setSalarios(new double[] {2500,1500,1000});

        imprime.imprimeFuncionairo(funcionario01);
        mediaSalarial.calculoMediaSalarial(funcionario01);
    }
}

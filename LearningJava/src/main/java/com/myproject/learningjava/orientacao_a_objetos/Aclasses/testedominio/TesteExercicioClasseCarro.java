package com.myproject.learningjava.orientacao_a_objetos.Aclasses.testedominio;

import java.util.Scanner;
import com.myproject.learningjava.orientacao_a_objetos.Aclasses.dominio.ExercicioClasseCarro;

public class TesteExercicioClasseCarro {

    public static void main(String[] args) {
        ExercicioClasseCarro carro = new ExercicioClasseCarro();
        ExercicioClasseCarro novoCarro = new ExercicioClasseCarro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o ano de lançamento do primeiro carro: ");
        carro.ano = scanner.nextInt();
        System.out.println("Insira o fabricante do primeiro carro: ");
        carro.fabricante = scanner.next();
        System.out.println("Por fim, o nome do primeiro carro: ");
        carro.nome = scanner.next();

        System.out.println("Primeiro carro: "
                + carro.fabricante + " "
                + carro.nome + " "
                + carro.ano);
        
        System.out.println("----------------------------------------------");
        
        System.out.println("Insira o ano de lançamento do segundo carro: ");
        novoCarro.ano = scanner.nextInt();
        System.out.println("Insira o fabricante do segundo carro: ");
        novoCarro.fabricante = scanner.next();
        System.out.println("Por fim, o nome do segundo carro: ");
        novoCarro.nome = scanner.next();
        
        System.out.println("Segundo carro: "
                + novoCarro.fabricante + " "
                + novoCarro.nome + " "
                + novoCarro.ano);
    }
}

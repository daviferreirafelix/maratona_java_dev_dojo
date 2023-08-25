package com.myproject.learningjava.orientacao_a_objetos.Bmetodos.teste;
import com.myproject.learningjava.orientacao_a_objetos.Bmetodos.dominio.Calculadora;

import java.util.Scanner;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        
        // métodos são basicamente funções
        
        System.out.println("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Insira o segundo número: ");
        double num2 = scanner.nextDouble();
        
        calculadora.dividir(num1, num2);

        // VarArgs é uma forma mais prática de passar array como parâmetro sem precisar inicalizá-lo
        calculadora.somaComVarArgs(1,2,3);
    }
}

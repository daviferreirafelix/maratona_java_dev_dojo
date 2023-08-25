package com.myproject.learningjava.orientacao_a_objetos.Bmetodos.dominio;

public class Calculadora {

    // já na declaração do método, a variável passada é o PARÂMETRO
    public int somar(int num1, int num2){
        return num1+num2;
    }
    
    public void dividir(double num2, double num3){
        if (num2 != 0 && num3 != 0){
            System.out.println(num2/num3);
            return;
        }
        
        System.out.println("Não existe divisão por 0.");
    }

    public void somaComVarArgs(int... numeros){
        int resultado = 0;
        for (int num : numeros) {
            resultado += num;
        }
        System.out.println(resultado);
    }
}

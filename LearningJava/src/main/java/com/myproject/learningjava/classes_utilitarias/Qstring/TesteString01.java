package com.myproject.learningjava.classes_utilitarias.Qstring;

public class TesteString01 {
    public static void main(String[] args) {
        String nome = "Davi";
        String nome2 = "Davi";

        System.out.println(nome == nome2);
        
        nome = nome.concat("Antonio");
        System.out.println(nome);
        // neste momento, duas variáveis de referência estão apontando para o mesmo valor dentro do pool de strings
    }
}

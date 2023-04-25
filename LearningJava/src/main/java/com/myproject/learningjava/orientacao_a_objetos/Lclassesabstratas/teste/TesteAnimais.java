package com.myproject.learningjava.orientacao_a_objetos.Lclassesabstratas.teste;

import com.myproject.learningjava.orientacao_a_objetos.Lclassesabstratas.dominio.AnimalCachorro;
import com.myproject.learningjava.orientacao_a_objetos.Lclassesabstratas.dominio.AnimalPessoa;

public class TesteAnimais {
    public static void main(String[] args) {
        AnimalPessoa pessoa = new AnimalPessoa(22, "Davi", "Humano");
        AnimalCachorro cachorro = new AnimalCachorro(10, "Adão", "Cachorro");

        System.out.println(pessoa);

        pessoa.imprimeNatureza();
        cachorro.imprimeNatureza();
    }
}

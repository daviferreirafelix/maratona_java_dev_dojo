package com.myproject.learningjava.orientacao_a_objetos.Fmodificadoresestaticos.teste;

import com.myproject.learningjava.orientacao_a_objetos.Fmodificadoresestaticos.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", 290);
        Carro carro2 = new Carro("Audi", 300);
        Carro carro3 = new Carro("Porsche", 320);

        Carro.velocidadeLimite = 200;

        carro.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}

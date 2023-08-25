package com.myproject.learningjava.orientacao_a_objetos.Kenumeracao.teste;

import com.myproject.learningjava.orientacao_a_objetos.Kenumeracao.dominio.Animal;
import com.myproject.learningjava.orientacao_a_objetos.Kenumeracao.dominio.AnimalEnum;

public class TesteAnimalEnum {
    public static void main(String[] args) {
        // na instanciação do animal, passamos como parâmetro o animal que queremos chamar da enumeração
        Animal animal = new Animal(AnimalEnum.GATO);

        System.out.println(animal);
    }
}

package com.myproject.learningjava.objects.Kenumeracao.teste;

import com.myproject.learningjava.objects.Kenumeracao.dominio.Animal;
import com.myproject.learningjava.objects.Kenumeracao.dominio.AnimalEnum;

public class TesteAnimalEnum {
    public static void main(String[] args) {
        // na instanciação do animal, passamos como parâmetro o animal que queremos chamar da enumeração
        Animal animal = new Animal(AnimalEnum.GATO);

        System.out.println(animal);
    }
}

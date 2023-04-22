package com.myproject.learningjava.objects.Kenumeracao.dominio;

public class Animal {
    private final AnimalEnum ANIMAL_ENUM;

    public Animal(AnimalEnum animal){
        this.ANIMAL_ENUM = animal;
    }

    @Override
    public String toString(){
        return "O tipo do animal é: "  + this.ANIMAL_ENUM + " chamado de: " + ANIMAL_ENUM.getNome();
    }
}

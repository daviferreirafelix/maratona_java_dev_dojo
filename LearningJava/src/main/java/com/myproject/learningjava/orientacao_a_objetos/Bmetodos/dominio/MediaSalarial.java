package com.myproject.learningjava.orientacao_a_objetos.Bmetodos.dominio;

public class MediaSalarial {
    public void calculoMediaSalarial(Funcionario funcionario){

        double mediaSalarial = 0;
        for (int i = 0; i < funcionario.getSalarios().length; i++) mediaSalarial += funcionario.getSalarios()[i];

        mediaSalarial /= funcionario.getSalarios().length;
        funcionario.setMediaSalarial(mediaSalarial);
        System.out.println("A média salarial do funcionário " + funcionario.getNome() + " é: " + mediaSalarial);
    }
}

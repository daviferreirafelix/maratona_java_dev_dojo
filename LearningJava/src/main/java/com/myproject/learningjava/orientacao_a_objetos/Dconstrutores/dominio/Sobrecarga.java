package com.myproject.learningjava.orientacao_a_objetos.Dconstrutores.dominio;

public class Sobrecarga {
    private String anime;
    private int episodios;
    private String genero;
    private String estudio;

    public Sobrecarga(String anime, int episodios, String genero){
        System.out.println("Dentro do primeiro construtor");
        this.anime = anime;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Sobrecarga(String anime, int episodios, String genero, String estudio){
        this(anime, episodios, genero);
        System.out.println("Dentro do segundo construtor");
        this.estudio = estudio;
    }

    public void imprimeSobrecargaConstrutores(){
        System.out.println(this.anime);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.estudio);
    }
}

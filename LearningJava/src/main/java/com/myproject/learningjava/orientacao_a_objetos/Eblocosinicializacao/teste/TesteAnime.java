package com.myproject.learningjava.orientacao_a_objetos.Eblocosinicializacao.teste;
import com.myproject.learningjava.orientacao_a_objetos.Eblocosinicializacao.dominio.Anime;

public class TesteAnime {
    public static void main(String[] args) {
        Anime anime = new Anime("avi");
        System.out.println(anime.getEpisodios());
        System.out.println(anime.getNome());
    }
}

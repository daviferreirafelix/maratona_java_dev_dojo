package com.myproject.learningjava.objects.Eblocosinicializacao.teste;
import com.myproject.learningjava.objects.Eblocosinicializacao.dominio.Anime;

public class TesteAnime {
    public static void main(String[] args) {
        Anime anime = new Anime("avi");
        System.out.println(anime.getEpisodios());
        System.out.println(anime.getNome());
    }
}

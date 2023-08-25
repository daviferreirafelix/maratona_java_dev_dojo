package com.myproject.learningjava.orientacao_a_objetos.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

//  bloco de inicialização vai ser executado sempre que uma nova instancia do objeto for criada
    {
        this.episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) episodios[i] = i+1;
        for(int i: this.episodios) System.out.println(i + " ");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

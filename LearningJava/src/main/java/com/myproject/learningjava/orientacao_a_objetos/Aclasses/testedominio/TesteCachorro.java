package com.myproject.learningjava.orientacao_a_objetos.Aclasses.testedominio;
import com.myproject.learningjava.orientacao_a_objetos.Aclasses.dominio.Cachorro;

public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        
        cachorro.cor = "marrom";
        cachorro.idade = 5;
        cachorro.nome = "Rex";
        cachorro.patas = 4;
        
        System.out.println(cachorro.cor + cachorro.idade + cachorro.nome + cachorro.patas);
    }
}

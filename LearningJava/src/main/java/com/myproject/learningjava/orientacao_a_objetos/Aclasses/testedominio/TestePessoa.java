package com.myproject.learningjava.orientacao_a_objetos.Aclasses.testedominio;
import com.myproject.learningjava.orientacao_a_objetos.Aclasses.dominio.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.name = "Davi";
        pessoa.age = 22;
        pessoa.sex = 'M';
        pessoa.wheigt = 60;
        
        System.out.println(pessoa.name);
    }
}

package com.myproject.learningjava.objects.Aclasses.testedominio;
import com.myproject.learningjava.objects.Aclasses.dominio.Pessoa;

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

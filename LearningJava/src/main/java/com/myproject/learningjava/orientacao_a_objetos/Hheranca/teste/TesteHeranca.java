package com.myproject.learningjava.orientacao_a_objetos.Hheranca.teste;

import com.myproject.learningjava.orientacao_a_objetos.Hheranca.dominio.Coordenador;
import com.myproject.learningjava.orientacao_a_objetos.Hheranca.dominio.Professor;

public class TesteHeranca {
        public static void main(String[] args){
            Professor professor = new Professor();
            Coordenador coordenador = new Coordenador();

            professor.setCpf(12345);
            professor.setNome("Davi");
            professor.setSalario(123456);
            professor.setEmail_institucional("abc@ifgoiano.edu.br");

            coordenador.setCpf(professor.getCpf());
            coordenador.setNome(professor.getNome());
            coordenador.setEmail_institucional(professor.getEmail_institucional());
            coordenador.setNovo_salario(1234);
            coordenador.setFuncao("Reprovar os otários.");

            System.out.println("-------------------------PROFESSOR-------------------------");
            professor.imprime();

            System.out.println("-------------------------COORDENADOR-------------------------");
            coordenador.imprime();
    }
}

package com.myproject.learningjava.orientacao_a_objetos.Gassociacao.exercicio1.teste;

import com.myproject.learningjava.orientacao_a_objetos.Gassociacao.exercicio1.dominio.Aluno;
import com.myproject.learningjava.orientacao_a_objetos.Gassociacao.exercicio1.dominio.Local;
import com.myproject.learningjava.orientacao_a_objetos.Gassociacao.exercicio1.dominio.Professor;
import com.myproject.learningjava.orientacao_a_objetos.Gassociacao.exercicio1.dominio.Seminario;

public class TesteSeminario {

	public static void main(String[] args) {
		Seminario seminario = new Seminario();
		
		Professor professor = new Professor("José", 35, "IF Goiano", seminario, "Ser especialista");
		Aluno aluno = new Aluno("Davi", 22, "IF Goiano", seminario, 123);
		Aluno aluno2 = new Aluno("Ana", 21, "IF Goiano", seminario, 321);
		Aluno aluno3 = new Aluno("Maria", 20, "IF Goiano", seminario, 231);
		Local local = new Local("Das Araras", "Ipameri", "Pecuária");
		
		Aluno[] alunos = {};
		Professor[] professores = {professor};
		

		seminario.setNomeSeminario("Como ser bonito");
		seminario.setAluno(alunos);
		seminario.setProfessores(professores);
		seminario.setLocal(local);
		seminario.printDadosSeminario();		
	}
}

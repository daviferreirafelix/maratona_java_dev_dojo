package com.myproject.learningjava.objects.Gassociacao.exercicio1.dominio;

public class Aluno extends Pessoa {
	private int matricula;
	
	public Aluno(String nome, int idade, String escola, Seminario seminario, int  matricula) {
		super(nome, idade, escola, seminario);
		this.setMatricula(matricula);
	}
	
	@Override
	public void printDadosPessoas() {
		super.printDadosPessoas();
		System.out.println("Matrícula: "+this.matricula);
		System.out.println(" ");
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}	
}

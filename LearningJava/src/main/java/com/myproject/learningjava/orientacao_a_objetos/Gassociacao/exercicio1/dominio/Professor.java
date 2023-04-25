package com.myproject.learningjava.orientacao_a_objetos.Gassociacao.exercicio1.dominio;

public class Professor extends Pessoa {
	private String especialidade;
	
	public Professor(String nome, int idade, String escola, Seminario seminario, String especialidade) {
		super(nome, idade, escola, seminario);
		this.setEspecialidade("Especialidade: "+especialidade);
	}
	
	@Override
	public void printDadosPessoas() {
		super.printDadosPessoas();
		System.out.println(this.especialidade);
		System.out.println(" ");
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}

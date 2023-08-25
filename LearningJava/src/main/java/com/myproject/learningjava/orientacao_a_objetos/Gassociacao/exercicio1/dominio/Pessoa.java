package com.myproject.learningjava.orientacao_a_objetos.Gassociacao.exercicio1.dominio;

public class Pessoa {
	private Seminario seminario;
	private String nome;
	private int idade;
	private String escola;
	
	public Pessoa(String nome, int idade, String escola, Seminario seminario) {
		this.nome = nome;
		this.idade = idade;
		this.escola = escola;
		this.seminario = seminario;
	}
	
	public void printDadosPessoas() {
		if (this.nome == null && this.idade == 0 && this.escola == null) {
			System.out.println("ERRO. Há um problema com os dados cadastrados.");
			return;
		}
		else {
			System.out.println("Nome: "+this.nome);
			System.out.println("Idade: "+this.idade);
			System.out.println("Escola representante: "+this.escola);
			System.out.println("Seminário cadastrado: "+this.seminario.getNomeSeminario());
		}
	}

	public Seminario getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}
	
}

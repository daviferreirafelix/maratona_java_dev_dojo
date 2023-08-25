package com.myproject.learningjava.orientacao_a_objetos.Gassociacao.exercicio1.dominio;

public class Local {
	private String rua;
	private String cidade;
	private String bairro;
	
	public Local(String rua, String cidade, String bairro) {
		this.rua = rua;
		this.cidade = cidade;
		this.bairro = bairro;
	}

	public void printLocal() {
		System.out.println("Rua: "+this.rua);
		System.out.println("Bairro: "+this.bairro);
		System.out.println("Cidade: "+this.cidade);
	}
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}

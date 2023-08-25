package com.myproject.learningjava.orientacao_a_objetos.Jmodificadorfinal.dominio;

public class CompradorCarro {
	private String nomeComprador;
	public static final Carro CARRO = new Carro();
	
	public String getNomeComprador() {
		return nomeComprador;
	}
	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}
}

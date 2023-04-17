package com.myproject.learningjava.objects.Jmodificadorfinal.dominio;

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

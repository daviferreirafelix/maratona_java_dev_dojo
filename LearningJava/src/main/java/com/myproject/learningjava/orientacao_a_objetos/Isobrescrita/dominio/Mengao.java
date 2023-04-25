package com.myproject.learningjava.orientacao_a_objetos.Isobrescrita.dominio;

public class Mengao {
	private String mengao;
	
	public Mengao() {
		
	}
	
	@Override
	public String toString() {
		return "Mengão " + this.mengao;
	}

	public String getMengao() {
		return mengao;
	}

	public void setMengao(String mengao) {
		this.mengao = mengao;
	}
	
	
}

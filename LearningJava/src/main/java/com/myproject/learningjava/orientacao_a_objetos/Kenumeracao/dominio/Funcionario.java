package com.myproject.learningjava.orientacao_a_objetos.Kenumeracao.dominio;

public class Funcionario {
	private String nome;
	private final TIPO_FUNCIONARIO TIPOFUNCIONARIO;
	private final MESES_ANO mes;
	
	public Funcionario(String nome, TIPO_FUNCIONARIO TIPOFUNCIONARIO, MESES_ANO mes) {
		this.nome = nome;
		this.TIPOFUNCIONARIO = TIPOFUNCIONARIO;
		this.mes = mes;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome:  " + this.nome + ", Tipo do funcionário:  " + this.TIPOFUNCIONARIO + ", identificador:  " + this.TIPOFUNCIONARIO.getId()
		+ ", Mês que foi contratado: "+this.mes + ", O que temos neste mês? " + this.mes.caracteristicaMes(this.mes) +  "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

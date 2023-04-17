package com.myproject.learningjava.objects.Kenumeracao.dominio;

public class Funcionario {
	private String nome;
	private final TipoFuncionario tipoFuncionario;
	private final MesesAno mes;
	
	public Funcionario(String nome, TipoFuncionario tipoFuncionario, MesesAno mes) {
		this.nome = nome;
		this.tipoFuncionario = tipoFuncionario;
		this.mes = mes;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome:  " + this.nome + ", Tipo do funcionário:  " + this.tipoFuncionario + ", identificador:  " + this.tipoFuncionario.getId()
		+ ", Mês que foi contratado: "+this.mes + ", O que temos neste mês? " + this.mes.caracteristicaMes(this.mes) +  "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

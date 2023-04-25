package com.myproject.learningjava.orientacao_a_objetos.Kenumeracao.dominio;

public enum TIPO_FUNCIONARIO {
	PROFESSOR(1, "Professor"),
	COORDENADOR(2, "Coordenador" );
	
	private int id;
	private String funcao;
	
	TIPO_FUNCIONARIO(int id, String funcao){
		this.id = id;
		this.funcao = funcao;
	}

	// retorna o funcionaario com base nas propriedades dele
	public static TIPO_FUNCIONARIO buscarEnumPorPropriedade(String propriedade) {
		for (TIPO_FUNCIONARIO tipoFunc: values()) {
			if (tipoFunc.getFuncao().equals(propriedade)) return tipoFunc;
		}

		return null;
	}

	// retorna a propriedade ID de cada enum
	public int getId() {
		return this.id;
	}

	// retorna a propriedade "FUNÇÃO" de cada enum
	public String getFuncao() {
		return this.funcao;
	}
}

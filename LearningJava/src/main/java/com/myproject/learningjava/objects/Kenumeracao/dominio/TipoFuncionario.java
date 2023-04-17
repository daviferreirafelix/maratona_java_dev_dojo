package com.myproject.learningjava.objects.Kenumeracao.dominio;

public enum TipoFuncionario {
	PROFESSOR(1, "Professor"),
	COORDENADOR(2, "Coordenador" );
	
	private int id;
	private String funcao;
	
	TipoFuncionario(int id, String funcao){
		this.id = id;
		this.funcao = funcao;
	}

	// retorna o funcionaario com base nas propriedades dele
	public static TipoFuncionario buscarEnumPorPropriedade(String propriedade) {
		for (TipoFuncionario tipoFunc: values()) {
			if (tipoFunc.getFuncao().equals(propriedade)) return tipoFunc;
		}

		return null;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getFuncao() {
		return this.funcao;
	}
}

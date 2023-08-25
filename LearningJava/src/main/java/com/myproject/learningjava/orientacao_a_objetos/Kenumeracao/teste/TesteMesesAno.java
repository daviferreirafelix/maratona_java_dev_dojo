package com.myproject.learningjava.orientacao_a_objetos.Kenumeracao.teste;

import com.myproject.learningjava.orientacao_a_objetos.Kenumeracao.dominio.Funcionario;
import com.myproject.learningjava.orientacao_a_objetos.Kenumeracao.dominio.MESES_ANO;
import com.myproject.learningjava.orientacao_a_objetos.Kenumeracao.dominio.TIPO_FUNCIONARIO;

public class TesteMesesAno {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("David", TIPO_FUNCIONARIO.PROFESSOR, MESES_ANO.SETEMBRO);
		Funcionario func2 = new Funcionario("Josefa", TIPO_FUNCIONARIO.COORDENADOR, MESES_ANO.JANEIRO);
		TIPO_FUNCIONARIO TIPOFUNCIONARIO = TIPO_FUNCIONARIO.buscarEnumPorPropriedade("Professor");

		System.out.println(funcionario);
		System.out.println(func2);
		System.out.println("Tipo do funcionário: "+ TIPOFUNCIONARIO);
	}

}

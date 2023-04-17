package com.myproject.learningjava.objects.Kenumeracao.teste;

import com.myproject.learningjava.objects.Kenumeracao.dominio.Funcionario;
import com.myproject.learningjava.objects.Kenumeracao.dominio.MesesAno;
import com.myproject.learningjava.objects.Kenumeracao.dominio.TipoFuncionario;

public class TesteMesesAno {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("David", TipoFuncionario.PROFESSOR, MesesAno.SETEMBRO);
		Funcionario func2 = new Funcionario("Josefa", TipoFuncionario.COORDENADOR, MesesAno.JANEIRO);
		TipoFuncionario tipoFuncionario = TipoFuncionario.buscarEnumPorPropriedade("Professor");

		System.out.println(funcionario);
		System.out.println(func2);
		System.out.println("Tipo do funcionário: "+tipoFuncionario);
	}

}

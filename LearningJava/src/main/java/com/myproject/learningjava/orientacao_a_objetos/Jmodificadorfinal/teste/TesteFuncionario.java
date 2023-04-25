package com.myproject.learningjava.orientacao_a_objetos.Jmodificadorfinal.teste;

import com.myproject.learningjava.orientacao_a_objetos.Jmodificadorfinal.dominio.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		Funcionario func2 = new Funcionario();
		Funcionario func3 = new Funcionario();
		
		func.setNome("Davi");
		System.out.println("Nome: "+func.getNome());
		System.out.println("Este funcionário está cadastrado na empresa:  "+Funcionario.EMPRESA);

		System.out.println("-----------------------------------------------------------------------------");
		
		func2.setNome("José");
		System.out.println("Nome 2: "+func2.getNome());
		System.out.println("Este funcionário está cadastrado na empresa:  "+Funcionario.EMPRESA);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		func3.setNome("Ana");
		System.out.println("Nome 2: "+func3.getNome());
		System.out.println("Este funcionário está cadastrado na empresa:  "+Funcionario.EMPRESA);
	}

}

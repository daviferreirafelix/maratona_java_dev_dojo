package com.myproject.learningjava.orientacao_a_objetos.Jmodificadorfinal.teste;

import com.myproject.learningjava.orientacao_a_objetos.Jmodificadorfinal.dominio.CompradorCarro;

public class TesteCarro {
	public static void main(String[] args) {
		CompradorCarro comprador = new CompradorCarro();
		CompradorCarro comprador2 = new CompradorCarro();
		
		comprador.setNomeComprador("Davi");
		CompradorCarro.CARRO.setNome("Palio");
		CompradorCarro.CARRO.setMarca("FIAT");
		CompradorCarro.CARRO.setAno(2010);
		
		System.out.println(comprador.getNomeComprador());
		System.out.print(CompradorCarro.CARRO.getMarca()+" ");
		System.out.print(CompradorCarro.CARRO.getNome()+" ");
		System.out.println(CompradorCarro.CARRO.getAno()+" ");
		
		System.out.println("-----------------------------------------------------------------------");
		
		comprador2.setNomeComprador("Davi");
		CompradorCarro.CARRO.setAno(2010);
		CompradorCarro.CARRO.setNome("Uno");
		CompradorCarro.CARRO.setMarca("FIAT");
		
		System.out.println(comprador2.getNomeComprador());
		System.out.print(CompradorCarro.CARRO.getMarca()+" ");
		System.out.print(CompradorCarro.CARRO.getNome()+" ");
		System.out.print(CompradorCarro.CARRO.getAno()+" ");
	}
}

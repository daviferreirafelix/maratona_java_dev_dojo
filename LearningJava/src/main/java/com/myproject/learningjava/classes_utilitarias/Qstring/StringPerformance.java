package com.myproject.learningjava.classes_utilitarias.Qstring;

public class StringPerformance {

	public static void main(String[] args) {
		
		long inicio =  System.currentTimeMillis();
		stringPerformance(70_000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo de execução em ms: "+(fim - inicio));
	}
	
	public static void stringPerformance(int tempo) {
		String string = "";
		
		for (int i = 0; i < tempo; i++) {
			string += i;
		}
	}

}

package com.myproject.learningjava.classes_utilitarias.Rformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {

	public static void main(String[] args) {
		/*
		 * Esta é a nova classe responsável pela formatação de datas e horas. Primeiro de tudo,
		 * quando estamos trabalhando com formatações, devemos lembrar uma coisa: ao ver a palavra
		 * Format, saiba que estamos formatando um objeto para uma String, e quando vemos a palavra
		 * Parse, estamos formatando uma String para um objeto. Ao fazer o Parse, devemos ter
		 * cuidado e indicar no parametro do metodo, além da string, o tipo de objeto que essa 
		 * String deverá se tornar.
		 * Agora, a classe DateTimeFormatter tem varios tipo de formatação pré-definidos, como a
		 * .ISO_DATE e .BASIC_ISO_DATE. Há também um método para formatação da escrita das datas,
		 *  sejam elas em dd/MM/yyy, MM/dd/yyyy e sucessivamente, esse método da classe DateTimeFormatter
		 *  é o .ofPattern(), onde passamos em uma string dentro do parametro o formato da nossa data.
		 * */
		
		LocalDate date = LocalDate.now();
		String df = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(date);
		
		LocalDate parse1 = date.parse("20230907", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(parse1); 
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.format(DateTimeFormatter.ISO_DATE));
		
		DateTimeFormatter padraoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate now = LocalDate.now();
		String padraoBr2 = now.format(padraoBr);
		
		LocalDate padraoBrFormated = LocalDate.parse(padraoBr2, padraoBr);
		
		System.out.println(padraoBr2);
		System.out.println(padraoBrFormated);
	}

}

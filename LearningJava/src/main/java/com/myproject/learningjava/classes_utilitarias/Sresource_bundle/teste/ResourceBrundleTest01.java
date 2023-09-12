package com.myproject.learningjava.classes_utilitarias.Sresource_bundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBrundleTest01 {

	public static void main(String[] args) {

		/*
		 * É uma forma de internacionalizar as mensagens do seu site, ou seja, transferir o conteúdo
		 * textual do site baseado em uma língua/localização.
		 * */
		
		 ResourceBundle resource = ResourceBundle.getBundle("message_en_US", new Locale("en", "US"));
		 System.out.println(resource.getString("good.morning"));
		 System.out.println("------------------------------------------------------------");
		 resource = ResourceBundle.getBundle("message_pt_BR", new Locale("pt", "BR"));
		 System.out.println(resource.getString("hello"));
		 
	}

}

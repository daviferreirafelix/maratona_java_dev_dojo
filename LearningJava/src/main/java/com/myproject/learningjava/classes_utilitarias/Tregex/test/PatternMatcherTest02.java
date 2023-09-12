package com.myproject.learningjava.classes_utilitarias.Tregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        /*
        * Os meta-caraceres servem como uma representação de uma informação que se deseja encontrar dentro do texto.
        * Por exemplo, em um texto complexo, ao ser necessário encontrar apenas os números, podemos usar um
        * meta-caractere para isso, servindo como um atalho que vai direto ao ponto da informação desejada. São alguns
        * exemplos dos caracteres especiais: \d (retorna todos os digitos numericos), \D (retorna tudo oq não for digito
        * numerico), \s (retorna todos os espaços em branco), \S (retorna todos os caracteres exceto os espaços
        * em branco), \w (retorna todas as letras, digitos numericos e _),  \W (retorna tudo oq não for incluso no
        * \w)
        * */

        String expression = "\\d";
        String expression2 = "\\s";
        String texto = "abca@sdfsab\ncdfsdfsdfsdf1231231,.,;sdfsfdsdfsdf";

        Pattern pattern = Pattern.compile(expression2);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}

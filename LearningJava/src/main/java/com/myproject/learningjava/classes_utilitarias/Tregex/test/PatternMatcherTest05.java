package com.myproject.learningjava.classes_utilitarias.Tregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        /*
        * Quantificadores são caracteres especiais que te permitem quantificar todos os caracteres existentes em
        * dado índice da expressão regular. Sõa esses caracteres: ? (representa 0 ou 1 ocorrência de determinada
        * expressão especifica), * (representa 0 ou mais ocorrencias de determinada expressao especifica),
        * + (representa 1 ou mais ocorrencias de determinada expressao especifica), {n, m} (representa um range
        * especifico de n até m da leitura da expressao especifica), () (representa agrupamento), | (representa OU),
        * $ (representa o fim da linha da expressao especifica), . (representa qualquer elemento entre o caractere
        * à esquerda e à direita do ponto. Exemplo: 1.3 pode retorna 123, 1a3, 1@3, etc, sempre agindo como
        * caractere coringa)
        * EXERCÍCIO - ACHAR EMAILS
        * */

        String regex = "([a-zA-Z0-9\\._-])+@([a-z])+(\\.([a-z])+)+";
        String texto = "adb@adc.com safgdfghfghfd h123_a@fffaa.com.br";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()){
            System.out.println("Indice onde está a expresssao: " + matcher.start() + "; Expressão: " + matcher.group() + ";\n");
        }
    }
}

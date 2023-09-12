package com.myproject.learningjava.classes_utilitarias.Tregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        /*
        * Expressões Regulares são uma linguagem que usa meta-caracteres/simbolos que se traduzem em padrões
        * de linguagem escritos num texto. Bastante utilizado para buscar padrões de escrita num texto e validações,
        * onde se tal campo, por exemplo, não for preenchido conforme determinado na expressão regular ele não é
        * válido. Caso não seja usado um meta-caractere/seimbolo na expressão regular e sim linguagem normal, ela
        * irá procurar exatamente os caracteres conforme passados nesta linguagem normal. Java usa duas classes para
        * trabalhar com expressões regulares: Pattern, que compila o padrão/expressão, e a Matcher, que encontra esse
        * padrão. O java trabalha para encontrar as expressões regulares com o Matcher através de índices, onde
        * cada expressão encontrada no texto corresponde a um indice. Por exemplo, a expressão "abc" foi encontrada
        * no indice 0 da String texto. Portanto, precisamos percorrer o texto como se estivessemos percorrendo
        * um array usando um laço de repetição para podermos encontrar a posição onde aparece a expressão regular.
        * */

        String expression = "abc";
        String texto = "abcasdfsabcdfsdfsdfsdfsdfsfdsdfsdf";

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}

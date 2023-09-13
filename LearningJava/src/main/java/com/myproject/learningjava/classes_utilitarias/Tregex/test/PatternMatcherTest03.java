package com.myproject.learningjava.classes_utilitarias.Tregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        /*
        * Existe também o meta-caractere Range, representado por []. Este caracatere, diferente da esccrita normal
        * da expressão regular, busca especificamente por cada letra/numero/simbolo/caractere colocado dentro dele,
        * ao invés de buscar pelo conjunto inteiro das letras/simbolos/numeros/caracteres, filtrando inclusive se
        * os dados caracteres estão em caixa alta ou não. Para evitar também de escrever em excesso as letras do
        * alfabeto, podemos usar um traço - entre a letra que irá iniciar e a que irá terminar para indicar
        * o range/alcançe da busca.
        * */

        String expression = "[a-cA-C]";
        String expressionHex = "0[xX][\\da-fA-F]";
        String numHex = "0x sadfb444 0x43f sdf__ 0x0";
        String expression2 = "[abcABC]";
        String texto = "abca@sdfsab\ncdfsdfsdfsdf1231231,.ABC,;sdfsfdsdfsdf";

        Pattern pattern = Pattern.compile(expressionHex);
        Matcher matcher = pattern.matcher(numHex);

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}

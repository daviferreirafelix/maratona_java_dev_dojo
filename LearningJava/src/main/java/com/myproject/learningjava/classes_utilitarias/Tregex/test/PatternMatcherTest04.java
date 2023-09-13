package com.myproject.learningjava.classes_utilitarias.Tregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        /*
        * Quantificadores são caracteres especiais que te permitem quantificar todos os caracteres existentes em
        * dado índice da expressão regular. Sõa esses caracteres: ? (representa 0 ou 1 ocorrência de determinada
        * expressão especifica), * (representa 0 ou mais ocorrencias de determinada expressao especifica),
        * + (representa 1 ou mais ocorrencias de determinada expressao especifica), {n, m} (representa um range
        * especifico de n até m da leitura da expressao especifica), () (representa agrupamento), | (representa OU),
        * $ (representa o fim da linha da expressao especifica)
        * */

        String expressionHex = "0[xX]([\\da-fA-F])+(\\s|$)";
        String numHex = "0x sadfb444 0x43g 32 sdf__ 0xa230f";

        Pattern pattern = Pattern.compile(expressionHex);
        Matcher matcher = pattern.matcher(numHex);

        while (matcher.find()){
            System.out.print("Indice onde está a expresssao: " + matcher.start() + "; Expressão: " + matcher.group() + ";\n");
        }
    }
}

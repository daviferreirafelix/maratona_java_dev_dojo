package com.myproject.learningjava.classes_utilitarias.Rformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) throws ParseException {
        // para formatação de moedas, usa-se o método de criação de instancia .getCurrencyInstance
        // e não mais apenas o .getInstance
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        // a conversão de valores de textos Strings para valores reais devem seguir o tipo de moeda
        // aplicado no valor da String. Por exemplo, se quero converter uma String que está eu dólar, devo
        // utilizar o método formatador do dólar ou então será lançada uma excessão

        String numeroString = "$100_000";

        System.out.println(nf.parse(numeroString));

        int number = 100_000_321;

        System.out.println(nf.format(number));
    }
}

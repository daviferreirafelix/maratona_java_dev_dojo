package com.myproject.learningjava.classes_utilitarias.Rformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        int number = 100_000_123;

        NumberFormat nf = NumberFormat.getInstance(Locale.CHINESE);

        // método formatador que formatará o numero com base no local passada no parâmetro do método que
        // cria uma instancia do local da classe formatadora
        System.out.println(nf.format(number));
    }
}

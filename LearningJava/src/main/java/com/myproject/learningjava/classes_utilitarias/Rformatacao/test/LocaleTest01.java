package com.myproject.learningjava.classes_utilitarias.Rformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        // criação de uma instância que captura os dados atuais do calendário do sistema
        Calendar c = Calendar.getInstance();

        // definindo o estilo da formatação desses dados capturados através da classe formatadora
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALIAN);

// capturando efetivamente os dados do calendário e relógio, e formatando-os com base no modelo de formatação pre definido
        System.out.println(df.format(c.getTime()));
    }
}

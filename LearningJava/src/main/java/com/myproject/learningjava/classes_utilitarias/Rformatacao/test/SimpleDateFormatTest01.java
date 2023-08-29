package com.myproject.learningjava.classes_utilitarias.Rformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        // essa classe permite, de forma mais simples, a formatação de datas com base em letras que significam
        // qual o tipo de formatação desejada

        // o uso das aspas simples ' ' na string pattern da classe SimpleDateFormat irá ignorar a string
        // dentro das mesmas, portanto ela não será uma letra de código a ser utilizada pelo método e sim
        // uma string normal que será impressa

        // buscando pais atual do local onde se encontra o computador do usuario
        Locale localeDefault = Locale.getDefault();
        // atribuindo o nome do pais envolto ao local onde se encontra o PC do usuario a uma variavel
        String country = localeDefault.getDisplayCountry(localeDefault);

        String pattern = "'"+ country +",'" + " dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss'.'";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(Calendar.getInstance().getTime()));

        // esta classe também tem o seu método .parse(), que trasnforma as strings recebidas em formato de
        // datas, mas ela também possui as mesmas características do .parse() para moedas, portanto a string
        // deve estar identica a escrita da string passada no pattern que vai dentro do método construtor
        // da classe
    }
}

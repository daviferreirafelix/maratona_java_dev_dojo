package com.myproject.learningjava.classes_utilitarias.Rformatacao.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        /*
        * ChronoUnit é a classe responsável por padronizar a formatação de unidades de data e periodo de tempo.
        * É mais simples pegar a quantidade de dias, meses e anos pelos métodos desta classe do que pela DateTIme
        * */

        LocalDate aniversario = LocalDate.of(2000, Month.SEPTEMBER, 13);
        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDate.now()));
    }
}

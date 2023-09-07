package com.myproject.learningjava.classes_utilitarias.Rformatacao.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        /*
        * TemporalAdjusters é uma classe repleta de métodos estáticos voltada para ajustes temporais, mas de
        * forma diferente das classes estudadas até então. O método .next() utilizado abaixo, por exemplo,
        * retornará a data referente ao proximo dia da semana passado como parametro, ajustando a data do
        * sistema/execução para a primeira data de ocorrencia do dia da semana referido. Tem outros métodos,
        * como o .previous(), que retorna a data anterior da ocorrencia deste dia da semana, o .firsDayOfTMonth(),
        * que retorna o primeiro dia do mês atual, .lastDayOfMonth(), que retorna o último dia do mês atual, etc.
        * */

       LocalDate day = LocalDate.now().with(TemporalAdjusters.next((DayOfWeek.FRIDAY)));
        System.out.println(day + ", " + day.getDayOfWeek());
    }
}

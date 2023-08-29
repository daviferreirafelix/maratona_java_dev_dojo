package com.myproject.learningjava.classes_utilitarias.Rformatacao.test;

import java.time.*;

/*
* LocalDate, LocalTime e LocalDateTime são as formas mais fáceis e modernas de manipular datas e horaŕios
* em Java. São novas classes pertencentes ao pacote Time e trazem vantagens como a conversão direta de valores
* de datas e horários em Strings e vice-versa, e a formatação de datas para compatibilidade com banco de dados.
* É também possível fazer uma união entre as classes LocalDate e LocalTIme em uma única variável de referẽncia
* LocalDateTIme, como nos exemplos ld1 e ld2 abaixo.
* */

public class LocaDateTimeTest01 {
    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.of(2023, Month.APRIL, 4));

        LocalTime time = LocalTime.of(23, 34, 55);
        LocalDate date = LocalDate.of(2023, Month.DECEMBER, 24);

        LocalDateTime ld1 = time.atDate(date);
        LocalDateTime ld2 = date.atTime(time);
        System.out.println(ld1);
        System.out.println(ld2);
    }
}

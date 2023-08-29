package com.myproject.learningjava.classes_utilitarias.Rformatacao.test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {
        /*
        * Duration é uma classe que vem para estipular, em segundos e nanosegundos, a duração e passagem de tempo
        * de um valor em horas ao outro. Ela traz como formatação alguns símbolos, como o P, que indica
        * a duração do período de tempo do calendário, e o T, que indica a duração do período de tempo do horário
        * */

        Duration durationMinuts = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusMinutes(5));
        Duration durationDays = Duration.ofDays(2);

        System.out.println("Passagem de tempo entre minutos: " + durationMinuts);
        System.out.println("Duração de 2 dias em horas: " + durationDays);
    }
}

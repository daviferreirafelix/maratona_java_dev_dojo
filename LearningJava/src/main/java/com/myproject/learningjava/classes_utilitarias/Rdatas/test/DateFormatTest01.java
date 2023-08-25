package com.myproject.learningjava.classes_utilitarias.Rdatas.test;


import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];

        // estilos de formatação disponiveis
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.FULL);
        df[4] = DateFormat.getDateInstance(DateFormat.LONG);
        df[5] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[6] = DateFormat.getDateInstance(DateFormat.SHORT);

        for (DateFormat format: df){
            System.out.println(format.format(c.getTime()));
        }

    }
}

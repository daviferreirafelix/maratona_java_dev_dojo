package com.myproject.learningjava.classes_utilitarias.Tregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        /*
        *
        * */

        String expression = "\\d";
        String expression2 = "\\s";
        String texto = "abca@sdfsab\ncdfsdfsdfsdf1231231,.,;sdfsfdsdfsdf";

        Pattern pattern = Pattern.compile(expression2);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}

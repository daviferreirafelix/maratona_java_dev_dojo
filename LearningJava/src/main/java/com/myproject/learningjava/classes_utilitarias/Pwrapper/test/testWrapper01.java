package com.myproject.learningjava.classes_utilitarias.Pwrapper.test;

public class testWrapper01 {
    byte byteP = 1;
    short shortP = 1;
    int intP = 1;
    long longP = 10L;
    float floatP = 10F;
    double doubleP = 10D;
    char charP = 'D';
    boolean booleanP = true;

// Agora, em baixo os tipos primitivos serão encapsulados, ou seja, se tornarão objetos que extendem a classe Number

    Byte byteF = 1;
    Short shortF = 1;
    Integer intF = 1; // autoboxing ou apenas boxing
    Long longF = 10L;
    Float floatF = 10F;
    Double doubleF = 10D;
    Character charF = 'D';
    Boolean booleanF = true;

    int i = intF; // unboxing

    int o = Integer.parseInt("2");

}

package com.myproject.learningjava.classes_utilitarias.Tregex.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Eu, Maria, Alguém, Não_Sei, 23, false";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while(scanner.hasNext()){
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i);
            }
            else if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println(b);
            }

        }
    }
}

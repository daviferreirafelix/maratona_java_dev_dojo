package com.myproject.learningjava.classes_utilitarias.Uio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("teste2.txt");

        try (FileWriter fr = new FileWriter(file)){
            fr.write("morango");
            fr.flush();
            System.out.println("Arquvio criado.");
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        try (FileReader fr = new FileReader(file)){
            int i;
            while ((i=fr.read()) != -1){
               System.out.print((char)i);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

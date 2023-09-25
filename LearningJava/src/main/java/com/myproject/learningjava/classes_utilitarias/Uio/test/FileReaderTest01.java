package com.myproject.learningjava.classes_utilitarias.Uio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {

        /*
        * Já a FileReader irá fazer a leitura do arquivo criado pelo File e escrito pelo FileWriter. Porém, nesta
        * classe temos uma metodologia diferente: o método de leitura .read() retorna um código numperico int
        * referente a um caractere, ou seja, ele não retorna uma string. Portanto, devemos iterar sobre todos os
        * caracteres presentes no arquivo e traduzir cada código numérico retornado para uma letra e aí sim
        * faremos a leitura em palavras do conteúdo nele escrito.
        * */

        File file = new File("teste2.html");

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

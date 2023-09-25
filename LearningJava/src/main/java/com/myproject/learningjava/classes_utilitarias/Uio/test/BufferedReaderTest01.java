package com.myproject.learningjava.classes_utilitarias.Uio.test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {

        /*
        * Idêntico ao BufferedWriter, mas com um porém. Neste caso, essa classe possui o método .readLine() ao invés
        * de somente .read(), assim ele lê linhas inteiras do arquivo ao invés de apenas caracteres e retorna null
        * quando chega ao final ao invés de -1.
        * */

        File file = new File("teste2.txt");

        try (FileReader fr = new FileReader(file)){
            BufferedReader br = new BufferedReader(fr);
            String i;
            while ((i=br.readLine()) != null){
                System.out.print(i);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

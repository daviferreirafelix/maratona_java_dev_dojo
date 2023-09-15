package com.myproject.learningjava.classes_utilitarias.Uio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {

        /*
        * IO em Java são manipuladas por classes, sendo a mais simples delas a File.
        * */

        File file = new File("teste.html");
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);

            if (file.exists()){
                System.out.println("Caminho relativo: "+ file.getPath());
                System.out.println("Caminho absoluto: "+ file.getAbsolutePath());
                System.out.println("È um diretorio? " + file.isDirectory());
                System.out.println("Ou é um arquivo? " + file.isFile());
                System.out.println("É possivel lê-lo? " + file.canRead());
                System.out.println("E escrtevê-lo? " + file.canWrite());
                System.out.println("Ùltima vez que foi modificado? " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
                System.out.println("Foi deletado? " + file.delete());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

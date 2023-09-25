package com.myproject.learningjava.classes_utilitarias.Uio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        /*
        * BufferedWirter é a classe voltada para escrita em arquivos muito maiores ou em maiores quantidades.
        * A classe FileWriter não é indicada quando se deseja obter um bom desempenho, então o ideal é utilziar a
        * BufferedWriter para os arquivos maiores em tamanho ou/e quantidade. A sua escrita é idêntica a da
        * FileWriter, aproveitando a mesma estrutura de código utilizada nela, porém, a BufferedWriter ainda pode
        * receber como parametro a FileWriter e, ao invés de usar os métodos de escrita da FileWriter, utiliza-se
        * os da BufferedWirter. Seu desempenho melhor provém do fato de utilizar dados em memória.
        * */

        File file = new File("teste3.txt");

        try (FileWriter fw = new FileWriter(file)){
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write("banana");
            bf.flush();
            System.out.println("Arquivo criado.");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

package com.myproject.learningjava.classes_utilitarias.Uio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilWriterTest01 {
    public static void main(String[] args) {
        /*
        * FileWriter é uma classe voltada para a escrita, em baixo nível, de arquivos. Ela não é tão utilizada
        * devido a ser menos forte que a BufferdWriter. Com isso, as classes do pacote IO terão bastante encadea_
        * mento entre si, ou seja, ao fazer uma leitura de um arquvio com FileWriter, podemos passar uma propria
        * instancia da classe File que criou o arquivo que será escrito pela FileWirter, por exemplo.
        * o método fw.flush() é importante pois ele ordena que o S.O envie todos os dados da escrita/ciração do
        * arquvio e evite que haja perda de informação após fechar a janela de comunicação da aplicação com o
        * S.O.
        * */

        File file = new File("teste.txt");

        try (FileWriter fw = new FileWriter(file)){
            fw.write("abc");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

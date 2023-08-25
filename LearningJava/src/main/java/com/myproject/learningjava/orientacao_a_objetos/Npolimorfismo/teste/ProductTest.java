package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.teste;

import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio.NotebookProduct;
import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio.Products;
import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.servico.ProductReport;

public class ProductTest {
    public static void main(String[] args) {
        Products notebookProduct = new NotebookProduct("Lenovo V14", "Zé da Manga", "Vibe", "Intel", 3000);

        ProductReport.productReport(notebookProduct);
    }
}

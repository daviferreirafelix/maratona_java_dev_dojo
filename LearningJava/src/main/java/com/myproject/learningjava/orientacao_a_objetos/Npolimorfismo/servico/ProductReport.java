package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.servico;

import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio.NotebookProduct;
import com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio.Products;

public class ProductReport {
    public static void productReport(Products products){
        System.out.println("PRODUCT REPORT");
        System.out.println("Product Name: " + products.getProductName());
        System.out.println("Product Model: " + products.getProductModel());
        System.out.println("Product Engineer: " + products.getProductEngineer());

        if (products instanceof NotebookProduct){
            NotebookProduct note = (NotebookProduct) products;
            System.out.println("Notebook CPU SUpplier: " + note.getCpuSupplier());
            double notebookPrice = note.productTax();
            System.out.println("Notebook Price: " + notebookPrice);
        }
    }
}

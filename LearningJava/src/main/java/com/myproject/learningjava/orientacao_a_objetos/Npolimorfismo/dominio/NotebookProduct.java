package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio;

public class NotebookProduct extends Products {
    private String cpuSUpplier;
    private double notebookPrice;

    public NotebookProduct(String productName, String productEngineer, String productModel, String cpuSupplier, double notebookPrice) {
        super(productName, productEngineer, productModel);
        this.cpuSUpplier = cpuSupplier;
        this.notebookPrice = notebookPrice;
    }
    
    @Override
    public double productTax(){
        if (this.notebookPrice > 2500){
            double newPrice = this.notebookPrice + (this.notebookPrice * TAX_IF_PRICE_MORE_THAN_2500_DOL);
            return newPrice;
        } else {
            double newPrice = this.notebookPrice + (this.notebookPrice * TAX_IF_PRICE_LESS_THAN_2500_DOL);
            return newPrice;
        }
    }

    public String getCpuSupplier(){
        return this.cpuSUpplier;
    }

    public double getNotebookPrice(){
        return this.notebookPrice;
    }
}

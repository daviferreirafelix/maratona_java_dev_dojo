package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio;

public abstract class Products implements ProductTaxInterface {
    private String productName;
    private String productEngineer;
    private String productModel;
    protected static final double TAX_IF_PRICE_LESS_THAN_2500_DOL = 0.05;
    protected static final double TAX_IF_PRICE_MORE_THAN_2500_DOL = 0.15;

    public Products(String productName, String productEngineer, String productModel){
        this.productName = productName;
        this.productEngineer = productEngineer;
        this.productModel = productModel;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductModel() {
        return productModel;
    }
    
    public String getProductEngineer() {
        return productEngineer;
    }

    
}
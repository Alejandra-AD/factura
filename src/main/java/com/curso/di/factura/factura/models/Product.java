package com.curso.di.factura.factura.models;

public class Product {

    private String productName;
    private Integer price;

    

    public Product(String productName, Integer price) {
        this.productName = productName;
        this.price = price;
    }
    
    //getters and setters
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    

}

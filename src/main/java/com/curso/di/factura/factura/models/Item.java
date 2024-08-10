package com.curso.di.factura.factura.models;

public class Item {

    private Product product;
    private Integer quantity;

    
    public Item(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    //getters and setters
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTotalItem(){

        return product.getPrice() * quantity;
    }

    

}

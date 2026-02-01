package com.example.assessments.assessment3_sharon_opudo.problem3;

public abstract class Product {
        protected String productId;
    protected String name;
    protected double price;
    protected int stock;

    public Product(String productId, String name, double price, int stock) {
        if (price <= 0 || stock < 0) {
            throw new InvalidProductException("Invalid price or stock value");
        }
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public abstract double calculateDiscount(); 
    public abstract String getProductType();

    public double applyTax() {
        return price * 0.16; // 16% tax
    }

    public void displayProductInfo() {
        System.out.println("ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + getProductType());
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }

    public void reduceStock(int quantity) throws OutOfStockException {
        if (quantity > stock) {
            throw new OutOfStockException("Product is out of stock");
        }
        stock -= quantity;
    }
    
}

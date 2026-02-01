package com.example.assessments.assessment3_sharon_opudo.problem3;

public class Clothing extends Product {
    private String size;
    private String material;
    private String color;

    public Clothing(String productId, String name, double price, int stock,
        String size, String material, String color) {
        super(productId, name, price, stock);
        this.size = size;
        this.material = material;
        this.color = color;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20;
    }

    @Override
    public String getProductType() {
        return "Clothing";
    }
    
}

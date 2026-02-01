package com.example.assessments.assessment3_sharon_opudo.problem3;

public class Electronics extends Product {
    private int    warrantyPeriod;
    private double powerConsumption;

    public Electronics(String productId, String name, double price, int stock,
        int warrantyPeriod, double powerConsumption) {
        super(productId, name, price, stock);
        this.warrantyPeriod = warrantyPeriod;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10;
    }

    @Override
    public String getProductType() {
        return "Electronics";
    }
    
}

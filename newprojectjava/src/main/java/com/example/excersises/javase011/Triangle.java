package com.example.excersises.javase011;


public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height, String color, boolean filled) {
        super(color, filled);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    // Simple perimeter example (not real triangle math, just for practice)
    @Override
    public double getPerimeter() {
        return base + height + height;
    }
}

    
 

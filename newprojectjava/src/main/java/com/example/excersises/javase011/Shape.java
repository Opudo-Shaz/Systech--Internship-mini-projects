package com.example.excersises.javase011;


public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Abstract methods (must be implemented by children)
    public abstract double getArea();
    public abstract double getPerimeter();

    // Concrete method
    @Override
    public String toString() {
        return "Color: " + color + ", Filled: " + filled;
    }
}

    


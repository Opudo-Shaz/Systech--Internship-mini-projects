package com.example.excersises.javase008;

public class Rectangle {
    private double length;
    private double width;
    
    //default constructor for a 1 by 1 rectangle
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    //constructor with specified length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //constructor with specified side for square
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("Area: " + area);
    }
    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter: " + perimeter);
    }

    public boolean isSquare() {
        return length == width;
    }
    
    //getter methods
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

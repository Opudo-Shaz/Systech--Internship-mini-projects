package com.example.excersises.javase011;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(5, "Red", true),
            new Rectangle(4, 6, "Blue", false),
            new Triangle(3, 4, "Green", true)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }
    }
}

    


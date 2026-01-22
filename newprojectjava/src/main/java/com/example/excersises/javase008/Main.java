package com.example.excersises.javase008;

public class Main { 
        public static void main(String[] args) {

        // Valid student
        Student s1 = new Student("A123B4", "Alice", 20, 3.6);
        s1.displayInfo();

        // Invalid student shows validation messages

        Student s2 = new Student("12", "", 10, 5.5);
        s2.displayInfo();

        // Testing setters to check validations
        s1.setGpa(3.9);
        s1.setAge(22);
        s1.displayInfo(); 

        //calling rectangle class
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Rectangle Perimeter: " + rect.getPerimeter());
        System.out.println("Is Square: " + rect.isSquare());
    }
    
}

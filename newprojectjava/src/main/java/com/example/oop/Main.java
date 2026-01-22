package com.example.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("OOP Module");

        // Creating Student objects
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;

        Student student2 = new Student();
        student2.name = "Bob";
        student2.age = 22;

        // Displaying student information
        System.out.println("Student 1: Name = " + student1.name + ", Age = " + student1.age);
        System.out.println("Student 2: Name = " + student2.name + ", Age = " + student2.age);
        System.out.println(student1);
        System.out.println(student2);
        student1.displayInfo();
        student2.displayInfo();
    }
    
}

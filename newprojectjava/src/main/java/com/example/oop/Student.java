package com.example.oop;

public class Student {
    public String name;
    public int age;

    public Student(){

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

  @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
} 
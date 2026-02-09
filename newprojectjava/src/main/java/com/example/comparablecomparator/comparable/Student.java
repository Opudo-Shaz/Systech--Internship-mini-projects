package com.example.comparablecomparator.comparable;

public class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age; 
    }

    @Override
    public int compareTo(Student other){
        return this.name.compareTo(other.name);
    }

    
}

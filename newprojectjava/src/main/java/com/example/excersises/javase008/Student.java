package com.example.excersises.javase008;

public class Student {

    // encapsulation , keeping fields private
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    // Constructor using setters for validation
    public Student(String studentId, String name, int age, double gpa) {
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setGpa(gpa);
    }

    // Getter and Setter for studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId != null && studentId.matches("[a-zA-Z0-9]{6}")) {
            this.studentId = studentId;
        } else {
            System.out.println("Invalid student ID. Must be 6 alphanumeric characters.");
        }
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.trim().length() >= 2) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Must be at least 2 characters.");
        }
    }

    // Getter and Setter for age
    public int getAge() {
        return age;  
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Must be between 16 and 100.");
        }
    }

    // Getter and Setter for gpa
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA. Must be between 0.0 and 4.0.");
        }
    }

    // Display method
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("--------------------");
    }
}

package com.example.excersises.javase008.studentmanager;

public class Main {
    public static void main(String[] args) {
        // Creating StudentManager instances using different constructors

        // Using Constructor 1
        StudentManager student1 = new StudentManager("Alice", "S001");
        student1.addGrade(85.5);
        student1.addGrade(90.0);
        System.out.println("Student 1 GPA: " + student1.getGpa());

        // Using Constructor 2
        StudentManager student2 = new StudentManager("Bob", "S002", 3);
        student2.addGrade(78.0);
        student2.addGrade(82.5);
        student2.addGrade(88.0);
        System.out.println("Student 2 GPA: " + student2.getGpa());

        // Using Constructor 3
        double[] initialGrades = {92.0, 87.5, 85.0}; 
        StudentManager student3 = new StudentManager("Charlie", "S003", initialGrades);
        System.out.println("Student 3 GPA: " + student3.getGpa());
    }
    
}

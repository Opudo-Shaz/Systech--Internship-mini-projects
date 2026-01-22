package com.example.excersises.javase008.studentmanager;

public class StudentManager {

    private String name;
    private String id;
    private double[] grades;
    private int gradeCount;
    private double gpa;

    // Constructor 1: name and id only
    public StudentManager(String name, String id) {
        this.name = name;
        this.id = id;
        this.grades = new double[5];   // can store up to 5 grades
        this.gradeCount = 0;
        this.gpa = 0.0;
    }

    // Constructor 2: name, id, and max number of grades
    public StudentManager(String name, String id, int maxGrades) {
        this.name = name;
        this.id = id;
        this.grades = new double[maxGrades];
        this.gradeCount = 0;
        this.gpa = 0.0;
    }

    // Constructor 3: full initialization with existing grades
    public StudentManager(String name, String id, double[] initialGrades) {
        this.name = name;
        this.id = id;
        this.grades = initialGrades;
        this.gradeCount = initialGrades.length;
        calculateGpa();
    }

    // Add a grade
    public void addGrade(double grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade.");
            return;
        }

        if (gradeCount < grades.length) {
            grades[gradeCount] = grade;
            gradeCount++;
            calculateGpa();
        } else {
            System.out.println("Grade list is full for " + name);
        }
    }

    // Calculate GPA
    public void calculateGpa() {
        if (gradeCount == 0) {
            gpa = 0.0;
            return;
        }

        double total = 0;
        for (int i = 0; i < gradeCount; i++) {
            total += grades[i];
        }

        double average = total / gradeCount;

        // Simple GPA conversion
        if (average >= 90) gpa = 4.0;
        else if (average >= 80) gpa = 3.0;
        else if (average >= 70) gpa = 2.0;
        else if (average >= 60) gpa = 1.0;
        else gpa = 0.0;
    }

    // Display student info
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grades:");

        for (int i = 0; i < gradeCount; i++) {
            System.out.print(grades[i] + " ");
        }

        System.out.println();
        System.out.println("GPA: " + gpa);
        System.out.println("--------------------");
    }


    //getters
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public double getGpa() {
        return gpa;
    }
}

    

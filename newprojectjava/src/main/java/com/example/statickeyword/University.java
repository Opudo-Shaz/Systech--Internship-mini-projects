package com.example.statickeyword;

public class University { 

    private static String universityName = "Tech University";
        // Static nested class
        public static class Student {
        private String name;
        private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        }
    public void displayInfo() {
        // Can access static members of outer class
        System.out.println("University: " + universityName);
        System.out.println("Student: " + name + " (ID: " + studentId + ")");
    }
    // Static method in static nested class
    public static void universityInfo() {
        System.out.println("Welcome to " + universityName);
    }
    } // Another static nested class
    public static class Professor {
        private String name;
        private String department;
        public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public void teach() {
    System.out.println("Professor " + name + " teaches in " + department);
    }
        
    }
    public static void main(String[] args) {
        // Accessing static nested class Student
        Student.universityInfo();
        Student student1 = new Student("Alice", 1001);
        student1.displayInfo(); 
        // Accessing static nested class Professor
        Professor professor1 = new Professor("Dr. Smith", "Computer Science");
        professor1.teach();
        University.Student.universityInfo();
    }

}

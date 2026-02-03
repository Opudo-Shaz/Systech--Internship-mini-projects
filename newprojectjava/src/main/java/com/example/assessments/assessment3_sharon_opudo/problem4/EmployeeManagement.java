package com.example.assessments.assessment3_sharon_opudo.problem4;

public class EmployeeManagement {

    public static String companyName = "Systech Corporation";
    private String employeeName;
    private double salary;

    public EmployeeManagement(String name) {
        employeeName = name;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative");
            return;
        }
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }
}
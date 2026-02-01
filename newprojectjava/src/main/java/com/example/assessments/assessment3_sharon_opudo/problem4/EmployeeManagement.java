package com.example.assessments.assessment3_sharon_opudo.problem4;

public class EmployeeManagement {
    // companyName is declared but never initialized
    public static String companyName;
    private String employeeName;
    private double salary;


    public EmployeeManagement(String name) {
    employeeName = name;
    }

    public void setSalary(double salary) {
    // the check does not stop code from executing even if salary is negative
    if (salary < 0) {
    System.out.println("Salary cannot be negative");
    }
    //use this keyword  to assign salary
    salary = salary;
    }
    //void method can not return a value
    public void calculateBonus() {
    return salary * 0.1;
        
}

//corrected version


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
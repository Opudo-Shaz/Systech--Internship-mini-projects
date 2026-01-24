package com.example.assessments.javase010;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        setName(name);
        setId(id);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name != null && !name.trim().isEmpty())
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if(id > 0)
        this.id = id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary >= 0)
        this.salary = salary; 
    }

    //calculateBonus() method (returns 5% of salary)
    public double calculateBonus() {
        return salary * 0.05;
    }
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Bonus: " + calculateBonus());
    }
    

}
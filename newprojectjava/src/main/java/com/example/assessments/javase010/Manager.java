package com.example.assessments.javase010;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if(department != null && !department.trim().isEmpty())
        this.department = department;
    }

    // Overriding calculateBonus() method (returns 10% of salary)
    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Manager Department: " + department);
    }
    
}

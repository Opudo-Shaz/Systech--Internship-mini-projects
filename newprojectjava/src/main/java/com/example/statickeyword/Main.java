package com.example.statickeyword;

public class Main {

    public static void main(String[] args) {
        System.out.println("Company Name: " + Employee.COMPANY_NAME);
System.out.println("Total Employees: " + Employee.getEmployeeCount());

        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie", 103);

        System.out.println("Employee 1: " + emp1.getName() + ", ID: " + emp1.getId());
        System.out.println("Employee 2: " + emp2.getName() + ", ID: " + emp2.getId());
        System.out.println("Employee 3: " + emp3.getName() + ", ID: " + emp3.getId());

        System.out.println("Total Employees: " + Employee.getEmployeeCount());
    }
    
}
  
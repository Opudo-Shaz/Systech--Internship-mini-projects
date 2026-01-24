package com.example.assessments.javase010;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage != null && !programmingLanguage.trim().isEmpty())
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding calculateBonus() method (returns 7% of salary)
    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Developer Programming Language: " + programmingLanguage);
    }
    
}

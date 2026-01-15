package com.example.descisions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        idRegistration(scanner);
        loanEligibility(scanner); 
        gradeCalculator(scanner);

        scanner.close();
    }

    // ---------------- ID Registration ----------------
    public static void idRegistration(Scanner scanner) {
        int finalAge = 18;

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (age >= finalAge) {
            System.out.println("Welcome " + name + ", you are eligible to vote.");
        } else {
            System.out.println("Sorry " + name + ", you are not eligible to vote.");
        }
    }

    // ---------------- Loan Eligibility ----------------
    public static void loanEligibility(Scanner scanner) {
        boolean isActive = true;

        System.out.print("Enter your age for loan eligibility: ");
        int loanAge = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double loanSalary = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        if (isActive && loanSalary >= 50000 && loanAge >= 21) {
            System.out.println("You are eligible for a loan.");
        } else {
            System.out.println("You are not eligible for a loan.");
        }
    }

    // ---------------- Grade Calculator + Switch ----------------
    public static void gradeCalculator(Scanner scanner) {

        System.out.print("Enter your marks (0-100): ");
        int marks = scanner.nextInt();

        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("Your grade is: " + grade);

        // Day switch
        System.out.print("Enter day number (1-7): ");
        int day = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day: " + dayName);

        // String switch
        String response = "01";

        switch (response) {
            case "01":
            case "05":
                System.out.println("You selected option 1");
                break;
            case "02":
                System.out.println("You selected option 2");
                break;
            case "03":
                System.out.println("You selected option 3");
                break;
            default:
                System.out.println("Invalid option selected");
        }
    }
}

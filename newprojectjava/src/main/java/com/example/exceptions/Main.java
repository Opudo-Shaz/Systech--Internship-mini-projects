package com.example.exceptions;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int result = divide(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
        userInput();
    }

    public static int divide(int a, int b) { 
        return a / b;
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            String input = scanner.nextLine();
            int age = Integer.parseInt(input);
            System.out.println("Your age is: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer for age.");
        } finally {
            scanner.close(); 
        }
    }

}
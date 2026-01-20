//Assessment1_Sharon_Opudo.java

package com.example.methods;

import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        //System.out.println("Sum: " + addThreeNumbers(15, 4, 7));
       // System.out.println("Product: " + multiply(15, 4));
        //System.out.println("Add and Multiply: " + addMultiply(15, 4, 7));
        //67System.out.println("Remainder: " + remainder(15, 4));

        printNumbers();
        factorialProgram();
 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score (0 - 100): ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a value between 0 and 100.");
        } else {
            char grade = calculateGrade(score);
            System.out.println("Your grade is: " + grade);
        }

        scanner.close();
    }
    int a = 15;
    int b = 4;
    int c = 7;

    public static int addThreeNumbers(int a, int b, int c){
        int sum = a + b + c;
        return sum; 

    }
    public static int multiply(int a, int b){
        return a * b;
    }

    public static int addMultiply(int a, int b, int c){
        int sum1 = a + b;
        return sum1 * c;

    }
    //remainder when a is divided by b
    public static int remainder(int a, int b){
        return a % b;
    
}

//Grade calculator
    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }

    }
// print numbers from 1 to 20 with even, odd, multiple of 5

    public static void printNumbers() {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " : ");

            if (i % 5 == 0) {
                System.out.println("Multiple of 5");
            }
            else if (i % 2 == 0) {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
    }
    // A Program to ask user for positive integer and calculate factorial
    public static void factorialProgram() {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        while (number <= 0) {
            System.out.print("Enter a positive integer: ");

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                if (number <= 0) {
                    System.out.println("Please enter a number greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next(); 
            }
        }

        long factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }

    // program that uses nested for loops to print asterisks in a right angle triangle 5 rows
    public static void printAsteriskTriangle() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
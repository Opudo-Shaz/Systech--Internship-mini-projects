/**
* Simple Console Calculator
* Student Name: Sharon
* Date: January 20, 2026
*
* Features:
* - Basic arithmetic operations (+, -, *, /)
* - Continuous operation (loop for multiple calculations)
* - Error handling for division by zero
* - Input validation for operators
*
* Bonus Features:
* - Modulo operation (%)
* - Power operation (^)
* - Percentage calculation
* - Invalid operator detection with user-friendly error messages
*/

package com.example.calculator;
import java.util.Scanner;
 
public class Calculator { 

    public static void main(String[] args) {
        System.out.println("Calculator Module");
        Scanner scanner = new Scanner(System.in);
        String continueCalc = "yes";
         
        while (continueCalc.equalsIgnoreCase("yes")) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            
            System.out.print("Enter operator (+, -, *, /, %, ^, #): ");
            char op = scanner.next().charAt(0);
            
            Calculator calc = new Calculator(num1, num2, op);
            double result = calc.calculate();
            System.out.println("Result: " + result);
            
            System.out.print("Do you want to calculate again? (yes/no): ");
            continueCalc = scanner.next();  
        }
        
        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
    // program that takes two numbers and does math operations depending with operator user puts
    int a;
    int b;
    char operator; 
    public Calculator(int a, int b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }
    public double calculate() {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return (double) a / b;
                } else {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
            case '%':
                if (b != 0) {
                    return a % b;
                } else {
                    throw new IllegalArgumentException("Modulo by zero is not allowed.");
                }
            case '^':
                return Math.pow(a, b);
            case '#':
                return (a * b) / 100.0;  // Calculate percentage: a% of b
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public String message(){
        String status = "Calculator is operational.";
        return status;
    }

    public void testIncrementOperators(){
        int x = 100; 
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a<b)? (a<c)? a: (b<c)? b:c:x;
        System.out.println(d);
    }
}

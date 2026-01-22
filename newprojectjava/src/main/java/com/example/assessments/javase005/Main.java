package com.example.assessments.javase005;

import java.util.Scanner;

public class Main {
    
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
            
            Assessment1_sharon_opudo assessment = new Assessment1_sharon_opudo();
            Assessment1_sharon_opudo.Calculator calc = assessment.new Calculator(num1, num2, op);
            double result = calc.calculate();
            System.out.println("Result: " + result);
            
            System.out.print("Do you want to calculate again? (yes/no): ");
            continueCalc = scanner.next();  
        }
        
        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}

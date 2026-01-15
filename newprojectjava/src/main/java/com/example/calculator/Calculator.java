package com.example.calculator;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculator Module");
        Calculator calc = new Calculator(10, 5, '+');
        double result = calc.calculate();
        System.out.println("Result: " + result);
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
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }


    
}

package com.example.calculator; 

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculator Module");
        Calculator calc = new Calculator(10, 5, '+');
        double result = calc.calculate();
        System.out.println("Result: " + result);
        System.out.println(calc.message());
        calc.testIncrementOperators();
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

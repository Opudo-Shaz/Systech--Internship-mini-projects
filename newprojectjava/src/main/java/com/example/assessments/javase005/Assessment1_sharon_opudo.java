package com.example.assessments.javase005;

public class Assessment1_sharon_opudo {

    public class Calculator { 

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
}

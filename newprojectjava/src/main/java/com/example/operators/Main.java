package com.example.operators;

public class Main {
    public static void main(String[] args) {
        arithmeticOperators();
        comparisonOperators();
        assignmentOperators();
        logicalOperators();
        incrementDecrementOperators();
        add(6, 9);

    }

    public static int add(int a, int b) {
        return a + b;
    }


    public static void arithmeticOperators(){
        System.out.println("Arithmetic Operators");
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));  
    }

    public static void comparisonOperators(){
        System.out.println("Comparison Operators");
        int a = 10;
        int b = 5;
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

    }

    public static void assignmentOperators(){
        System.out.println("Assignment Operators");
        int balance = 1000;

        //deposit = 500
        balance = balance + 500;
        System.out.println("Updated Balance: " + balance);

        //withdraw = 800 + charges 50
        balance = balance - (800 + 50);
        System.out.println("Updated Balance: " + balance);

        //charity work 3 children , balance divided by 3
        balance = balance / 3;
        System.out.println("Updated Balance to be disbursed to each child: " + balance);
        
    }

    public static void logicalOperators(){
        System.out.println("Logical Operators");
        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;  
        boolean isEligible = hasHighIncome && hasGoodCredit;
        System.out.println("Is Eligible for loan: " + isEligible);

        int balance = 1200;
        int charges = 200;
        int withdrawAmount = 1000;
        boolean canWithdraw = (balance >= withdrawAmount + charges) || hasHighIncome;
        boolean isLoggedIn = true;
        canWithdraw = canWithdraw && isLoggedIn;
        System.out.println("Can Withdraw: " + canWithdraw);
    }

    public static void incrementDecrementOperators(){
        System.out.println("Increment/Decrement Operators");
        int a = 10;
        System.out.println("Initial value of a: " + a);
        System.out.println("Post-increment: " + (a++));
        System.out.println("Value of a after post-increment: " + a);
        System.out.println("Pre-increment: " + (++a));
        System.out.println("Value of a after pre-increment: " + a);
    }
}
    


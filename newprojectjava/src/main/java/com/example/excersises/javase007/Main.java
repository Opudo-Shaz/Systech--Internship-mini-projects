package com.example.excersises.javase007;

public class Main {
    public static void main(String[] args) {
          // Using default constructor
        BankAccount acc1 = new BankAccount();
        acc1.displayBalance();

        // Using constructor with account number and holder
        BankAccount acc2 = new BankAccount("ACC1001", "Alice");
        acc2.deposit(500);
        acc2.withdraw(150);
        acc2.displayBalance();

        // Using constructor with all properties
        BankAccount acc3 = new BankAccount("ACC2002", "Bob", 1000);
        acc3.withdraw(300);
        acc3.deposit(200);
        acc3.displayBalance();
    }
}
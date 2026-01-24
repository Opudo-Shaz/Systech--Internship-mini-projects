package com.example.assessments.javase010.Assignment2Assessment2;


/**
* Basic Bank Account System
* Student: Sharon Opudo
* Date: 24th January 2026
*
* Features Implemented:
* - Complete encapsulation with validation
* - Inheritance hierarchy (Savings/Checking accounts)
* - Polymorphic account management
* - Custom exception handling
*
* Bonus Features:1. Transaction history (last 10 transactions)
*                 2. Overdraft protection for checking accounts
*                 3. Interest application for savings accounts
*                 4. Bank transfer functionality
*/

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Creating accounts
        BankAccount acc1 = new CheckingAccount("CHK1001", "Alice", 500.0, 200.0);
        BankAccount acc2 = new SavingsAccount("SAV1001", "Bob", 1000.0, 300.0);

        // Adding  accounts to bank
        System.out.println(bank.addAccount(acc1));
        System.out.println(bank.addAccount(acc2));
        System.out.println(bank.addAccount(acc1)); // Duplicate account

        // Displaying all accounts
        bank.displayAllAccounts();

        // Performing  transactions
        System.out.println(acc1.deposit(150.0));
        System.out.println(acc1.withdraw(800.0)); // Within overdraft
        System.out.println(acc1.withdraw(200.0)); // Exceeds overdraft

        System.out.println(acc2.deposit(200.0));
        System.out.println(acc2.withdraw(50.0));
        System.out.println("9. Transfer Money");
        System.out.println(bank.transfer("SAV1001", "CHK1001", 300.0));

        // Applying interest to savings accounts
        bank.applyInterestToSavingsAccounts();

        // Displaying all accounts after transactions
        bank.displayAllAccounts();
    }
    
}

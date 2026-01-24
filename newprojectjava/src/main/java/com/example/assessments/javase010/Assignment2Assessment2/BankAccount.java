package com.example.assessments.javase010.Assignment2Assessment2;

import java.util.ArrayList;

public class BankAccount {



    private String accountNumber;
    private String accountHolder;
    protected double balance;


    private ArrayList<String> transactions = new ArrayList<>();
    private static final int MAX_HISTORY = 10;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            this.accountNumber = "UNKNOWN";
        } else {
            this.accountNumber = accountNumber;
        }

        if (accountHolder == null || accountHolder.isEmpty()) {
            this.accountHolder = "UNKNOWN";
        } else {
            this.accountHolder = accountHolder;
        }

        if (initialBalance < 0) {
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
 
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
    protected void addTransaction(String message) {
    if (transactions.size() == MAX_HISTORY) {
        transactions.remove(0);   
    }
    transactions.add(message);
}

public void showTransactions() {
    if (transactions.isEmpty()) {
        System.out.println("No transactions yet.");
        return;
    }

    System.out.println("Transaction History:");
    for (String t : transactions) {
        System.out.println("- " + t);
    }
}


    // Deposit 
    public String deposit(double amount) {
        if (amount <= 0) {
            return "Deposit amount must be positive.";
        }
        balance += amount;
        String msg = "Deposited $" + amount + ", Balance: $" + balance;
        addTransaction(msg);
        return msg;
    }


    // Withdraw 
    public String withdraw(double amount) {
        if (amount <= 0) {
            return "Withdrawal amount must be positive.";
        }

        if (amount > balance) {
            return "Insufficient funds.";
        }

        balance -= amount;
        String msg = "Withdrew $" + amount + ", Balance: $" + balance;
        addTransaction(msg);
        return msg;
    }


    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
               ", Holder: " + accountHolder +
               ", Balance: $" + balance;
    }



    
    public void applyInterest(double interestRate) {
    }
    }
 

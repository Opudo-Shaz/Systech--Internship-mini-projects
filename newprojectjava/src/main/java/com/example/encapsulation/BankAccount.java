package com.example.encapsulation;

public class BankAccount {
    
    private int balance;
    private String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountNumber, int initialBalance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountHolderName = accountHolderName;
    }
    public void printInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance + ", Account Holder Name: " + accountHolderName);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        if(balance >= 0){
            this.balance = amount;
        } else {
        throw new RuntimeException("Balance cannot be negative");
        }
    }

    //setter for boolean value
    public void isActive(boolean status) {
        if(status){
            System.out.println("Account is active");
        } else {
            System.out.println("Account is inactive");
        }
    }

    //getter for boolean value
    public boolean getStatus() {
        return true;
    }
}

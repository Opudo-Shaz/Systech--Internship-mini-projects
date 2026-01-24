package com.example.assessments.javase010.Assignment2Assessment2;

public class SavingsAccount extends BankAccount {
    
     private double overdraftLimit;

    public SavingsAccount(String accNum, String holder, double balance, double overdraftLimit) {
        super(accNum, holder, balance);

        if (overdraftLimit < 0) {
            this.overdraftLimit = 0; 
        } else {
            this.overdraftLimit = overdraftLimit;
        }
    }
    @Override
    public String withdraw(double amount) {
        if (amount <= 0) {
            return "Withdrawal amount must be positive.";}
        if (balance - amount < -overdraftLimit) {
            return "Overdraft limit exceeded.";}
        balance -= amount;
        addTransaction("Withdrew $" + amount + ", Balance: $" + balance);
        return "Withdrawal successful. New balance: $" + balance;
    }

    @Override
    public void applyInterest(double interestRate) {
        if (interestRate > 0) {
            balance += balance * interestRate / 100;
        }
    }

    //getter and setter for applyInterest
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit) {
        if (overdraftLimit >= 0) {
            this.overdraftLimit = overdraftLimit;
        }
    }



}

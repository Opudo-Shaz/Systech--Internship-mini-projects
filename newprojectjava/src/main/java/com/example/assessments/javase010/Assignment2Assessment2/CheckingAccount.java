package com.example.assessments.javase010.Assignment2Assessment2;

public class CheckingAccount extends BankAccount {
    
     private double overdraftLimit;

    public CheckingAccount(String accNum, String holder, double balance, double overdraftLimit) {
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
            return "Withdrawal amount must be positive.";
        }

        if (balance - amount < -overdraftLimit) {
            return "Overdraft limit exceeded.";
        }

        balance -= amount;
        return "Withdrawal successful. New balance: $" + balance;
    }

    @Override
    public String toString() {
        return "CheckingAccount -> " + super.toString() +
               ", Overdraft Limit: $" + overdraftLimit;
    }
    
}

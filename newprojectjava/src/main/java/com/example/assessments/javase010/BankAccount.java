package com.example.assessments.javase010;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if(accountNumber != null && !accountNumber.trim().isEmpty())
        this.accountNumber = accountNumber;
    else {
        throw new IllegalArgumentException("Account number cannot be null or empty");}
    }


    public void setBalance(double balance) {
        if(balance >= 0)
        this.balance = balance;
    else {
        throw new IllegalArgumentException("Balance cannot be negative");}  
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if(accountHolderName != null && !accountHolderName.trim().isEmpty())
        this.accountHolderName = accountHolderName;
    else {
        throw new IllegalArgumentException("Account holder name cannot be null or empty");}
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }
    public double withdraw(double amount) { 
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        return balance;
    }

    public double getBalance() {
    return balance;
}

     public void printBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void printInfo() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }


    public class SavingAccount extends BankAccount {
        private double interestRate;

        public SavingAccount(String accountNumber, double balance, String accountHolderName, double interestRate) {
            super(accountNumber, balance, accountHolderName);
            this.interestRate = interestRate;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public void applyInterest() {
            double interest = getBalance() * (interestRate / 100);
            deposit(interest);
        }
        public double withdraw(double amount) { 
            double fee = 2.0; // Fixed withdrawal fee
            if (amount > 0 && amount + fee <= getBalance()) {
                super.withdraw(amount + fee);
            }
            return getBalance();
        }
    }


    public class savingsAccountWithInterest extends BankAccount {
        private double interestRate;

        public savingsAccountWithInterest(String accountNumber, double balance, String accountHolderName, double interestRate) {
            super(accountNumber, balance, accountHolderName);
            this.interestRate = interestRate;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public void applyInterest() {
            double interest = getBalance() * (interestRate / 100);
            deposit(interest);
        }
        @Override
        public double withdraw(double amount) { 
            double fee = 2.0; 
            if (amount > 100 && amount + fee <= getBalance()) {
                super.withdraw(amount + fee);
            }
            return getBalance(); 
        }
    }

    public void checkingAccount() {
        System.out.println("This is a checking account.");
    }
    
}

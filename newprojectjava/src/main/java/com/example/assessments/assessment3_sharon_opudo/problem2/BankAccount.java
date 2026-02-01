package com.example.assessments.assessment3_sharon_opudo.problem2;

public class BankAccount {


    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) throws InvalidTransactionException {
        if (initialBalance < 0) {
            throw new InvalidTransactionException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundException, InvalidTransactionException  {
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundException("Insufficient funds for withdrawal");
        }
        balance -= amount;
    }

    public void transfer(BankAccount toAccount, double amount)
            throws InsufficientFundException, AccountNotFoundException, InvalidTransactionException {

        if (toAccount == null) {
            throw new AccountNotFoundException("Target account does not exist");
        }
        if (amount <= 0) {
            throw new InvalidTransactionException("Transfer amount must be positive");
        }

        this.withdraw(amount);
        toAccount.deposit(amount);
    }
    
    
}

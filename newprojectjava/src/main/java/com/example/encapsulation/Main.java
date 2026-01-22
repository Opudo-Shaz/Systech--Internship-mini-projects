package com.example.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000, "John Doe");
        account.printInfo();
        System.out.println("Current Balance: " + account.getBalance());
    }
}

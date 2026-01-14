package com.example.userInputs;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("User Inputs Module");

        double balance = 1200;
        Scanner input = new Scanner(System.in);

        // Deposit
        System.out.print("Enter deposit amount: ");
        double deposit = input.nextDouble();
        balance = balance + deposit;
        System.out.println("Balance after deposit: " + balance);

        // Withdrawal
        System.out.print("Enter withdrawal amount: ");
        double withdrawal = input.nextDouble();
        balance = balance - withdrawal;
        System.out.println("Balance after withdrawal: " + balance);

        // Charges
        System.out.print("Enter charges amount: ");
        double charges = input.nextDouble();
        balance = balance - charges;
        System.out.println("Final balance: " + balance);

        input.close();
    }
}


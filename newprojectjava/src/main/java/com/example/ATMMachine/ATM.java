package com.example.ATMMachine;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
       do{ System.out.println("Welcome to my ATM machine! ");
        System.out.println("Please enter your PIN: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Cash");
        System.out.println("4. Exit");
        choice = scanner.nextInt();
    }while(choice != 4);


    }
    
}

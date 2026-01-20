package com.example.loops;
 
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in); // one scanner for entire program

    public static void main(String[] args) {
 
        //printLoveYou100Times();
        //showMenu();
        printPrimeNumbers();
        //breakingStatement();
        //numberGuessingGame();

    }
 
    // for loop to print i love you 100 times
    static void printLoveYou100Times() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": I love you");
        }
    }

    // while loop to show menu until user exits
    static void showMenu() {
        int choice = 0;

        while (choice != 4) {
            System.out.println("\nMenu:");
            System.out.println("1. TEA");
            System.out.println("2. MANDAZI");
            System.out.println("3. CHAPATI");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
        }

        System.out.println("Exiting the menu. Goodbye!");
    }

    // while loop with counter
    public static void whileLoopWithCounter() {
        int counter = 1;
        while (counter <= 5) {
            System.out.println("Counter: " + counter);
            counter++;
        }
    }

    // do while loop to play number guessing game
    public static void numberGuessingGame() {
        int secretNumber = 7;
        int guess;

        do {
            System.out.print("Guess the number (1-10): ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }

        } while (guess != secretNumber);
    }

    // break and continue example
    public static void breakingStatement() {

        int[] numbers = {11, 23, 39, 47, 58, 69};

        for (int number : numbers) {
            if (number == 47) {
                System.out.println("Number 47 found! Exiting loop.");
                break;
            }
        }

        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    // print prime numbers between 1 and 50
    public static void printPrimeNumbers() {

        for (int i = 1; i <= 50; i++) {

            if (i < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

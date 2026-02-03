//program to group people in age categories
package com.example.descisions;
import java.util.Scanner;
public class AgeComparisons{
    
    public static void AgeChecker() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age <= 2) {
            System.out.println("You are n infant.");
        } else if (age >= 3 && age <= 12) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager.");
        } else if (age >= 20 && age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        scanner.close();
    }
}
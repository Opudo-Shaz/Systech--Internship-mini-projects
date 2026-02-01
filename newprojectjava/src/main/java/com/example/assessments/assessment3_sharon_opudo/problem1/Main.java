/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sharon Opudo
 * Submission Date: 31st Jan 2026
 * Problem: 1
 *
 * Key Features:
 * - Object-Oriented Programming using inheritance and polymorphism
 * - Base class (LibraryItem) with shared properties and methods
 * - Method overriding in subclasses (Book, DVD, Magazine)
 * - Runtime polymorphism using a common parent reference
 *
 * Exception Handling Techniques Used:
 * - Validation of item availability during checkout
 * - Correct handling of invalid checkout attempts
 *
 * Additional Notable Implementations:
 * - Use of abstract data type (LibraryItem reference) in collections
 * - Encapsulation through access modifiers
 * - Use of  array list to loop through the items and display details.
 */
 

package com.example.assessments.assessment3_sharon_opudo.problem1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "1984", "George Orwell", "9780451524935", "Dystopian"));
        items.add(new DVD(2, "Inception", "Christopher Nolan", 148, "PG-13"));
        items.add(new Magazine(3, "Time", "Time Editors", 120, "March 2024"));

        for (LibraryItem item : items) {
            item.displayDetails();   // different output
            item.checkout();         // different behavior
            System.out.println();
        }
    }
}

    

 
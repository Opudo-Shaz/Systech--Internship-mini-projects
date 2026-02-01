package com.example.assessments.assessment3_sharon_opudo.problem3;
 

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sharon Opudo
 * Date: 1 February 2026
 * Problem: Problem 3 – Integrated System (E-Commerce Product Management System)
 *
 * Key Features:
 * - Abstraction using an abstract Product base class
 * - Inheritance and polymorphism through concrete product subclasses
 * - Encapsulation of product data and behavior
 * - Method overriding for product-specific discount calculations
 *
 * Exception Handling:
 * - Custom checked exception for out-of-stock scenarios
 * - Runtime exception for invalid product data validation
 * - Use of try-catch-finally blocks for safe execution
 *
 * Additional Implementations:
 * - Stock level tracking within product classes
 * - Tax calculation and product information display methods
 */


public class ECommerceTest {

    public static void main(String[] args) {

     Product laptop = new Electronics(
            "E01", "Laptop", 80000, 5, 24, 65
        );

        Product shirt = new Clothing(
            "C01", "Shirt", 2500, 10, "M", "Cotton", "Blue"
        );

        Product book = new Books(
            "B01", "Java Basics", 1500, 2,
            "James", "TechPress", "1234567890"
        );

        try {
            laptop.reduceStock(2);
            shirt.reduceStock(5);
            book.reduceStock(3); //throws exception

        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Stock operation completed.");
        }

        System.out.println();
        laptop.displayProductInfo();
        System.out.println("Discount: " + laptop.calculateDiscount());
        System.out.println("Tax: " + laptop.applyTax());

        System.out.println();
        shirt.displayProductInfo();
        System.out.println("Discount: " + shirt.calculateDiscount());

        System.out.println();
        book.displayProductInfo();
    }
}   


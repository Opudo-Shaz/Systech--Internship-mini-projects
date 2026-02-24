package com.example.javasuppliers; 

public class Main {
    public static void main(String[] args) {
        // Supplier is a functional interface that takes no input and returns a result.
        // It is used to generate or supply values without taking any input.

        // Example of Supplier
        java.util.function.Supplier<String> stringSupplier = () -> "Hello, World!";
        System.out.println(stringSupplier.get());
    }
    
}

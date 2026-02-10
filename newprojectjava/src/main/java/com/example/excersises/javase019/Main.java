package com.example.excersises.javase019; 

public class Main {
    public static void main(String[] args) {
        // Calculator
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Add: " + add.calculate(3, 4));
        System.out.println("Multiply: " + multiply.calculate(3, 4));

        // Validator
        Validator notEmpty = input -> input != null && !input.isEmpty();

        System.out.println("Validate 'Hello': " + notEmpty.validate("Hello"));
        System.out.println("Validate '': " + notEmpty.validate(""));

        // Transformer
        Transformer toUpper = input -> input.toUpperCase();

        System.out.println("Transform 'java': " + toUpper.transform("java"));

        // Logger
        Logger logger = message -> System.out.println("LOG: " + message);

        logger.log("Application started");
        logger.log("Processing completed");
    }
    
}

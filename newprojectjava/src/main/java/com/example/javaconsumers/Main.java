package com.example.javaconsumers;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Consumer is a functional interface that takes a single input and returns no output.
        // It is used to perform some operation on the input without returning any result.

        // Example of Consumer
        java.util.function.Consumer<String> printConsumer = (s) -> System.out.println(s);
        printConsumer.accept("Hello, World!");

    }
            System.out.println(new LocalTime().now());

    
}

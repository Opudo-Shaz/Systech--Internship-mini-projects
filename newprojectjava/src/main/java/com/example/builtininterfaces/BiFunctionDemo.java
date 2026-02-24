package com.example.builtininterfaces;

public class BiFunctionDemo {
    public static void main(String[] args) {
        // BiFunction is a functional interface that takes two inputs and returns a result.
        // It is used to perform some operation on the two inputs and return a result.

        // Example of BiFunction
        java.util.function.BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 3)); // Output: 8
    }
    
}

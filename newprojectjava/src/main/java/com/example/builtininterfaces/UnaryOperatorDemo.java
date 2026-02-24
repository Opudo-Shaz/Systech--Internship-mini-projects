package com.example.builtininterfaces; 

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        // UnaryOperator is a functional interface that takes a single input and returns a result of the same type.
        // It is used to perform some operation on the input and return a result of the same type.

        // Example of UnaryOperator
        java.util.function.UnaryOperator<Integer> square = (x) -> x * x;
        System.out.println(square.apply(5)); // Output: 25
    }
    
}

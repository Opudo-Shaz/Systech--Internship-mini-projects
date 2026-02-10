package com.example.excersises.javase019;

@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);

    Calculator add = (a, b) -> a + b;
    Calculator multiply = (a, b) -> a * b;

}
    

 
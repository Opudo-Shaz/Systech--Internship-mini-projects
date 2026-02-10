package com.example.excersises.javase019;

@FunctionalInterface
public interface Transformer {
    String transform(String input);
    Transformer toUpper = input -> input.toUpperCase();

    }
    


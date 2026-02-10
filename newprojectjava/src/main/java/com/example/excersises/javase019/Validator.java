package com.example.excersises.javase019;

@FunctionalInterface
public interface Validator {
    boolean validate(String input);
    Validator notEmpty = input -> input != null && !input.isEmpty();

    }

 
package com.example.lambda; 

import java.util.*;

public class LambdaSyntax {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Chalie", "Bob", "Emmy", "Alice");

        //lambda to print each name
        System.out.println("----------Printing names----------");
        names.forEach(name -> System.out.println(names));

        //lambda with multiple parameters -- sorting
        System.out.println("-----------Sorting by length-------------");
        names.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
        names.forEach(System.out:: println);

        //lambda with multiple statements
        System.out.println("--------------Processing names--------------");
        names.forEach(name ->{
            String processed = name.toUpperCase();
            int length = name.length();
            System.out.println(processed + "("+length + "chars)");

        });

        //lambda with return statement
        System.out.println("-------------Lambda with return statement--------");
        List<Integer> numbers = Arrays.asList(4,8,9,4,6,4,8);
        List<Integer> squares = new ArrayList<>();
        numbers.forEach(n ->{
            int square = n*n;
            squares.add(square);
        });
        System.out.println("Squares are: " + squares);
    
    }
    
}

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
    }
    
}

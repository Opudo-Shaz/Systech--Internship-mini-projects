package com.example.streams; 

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDemo {
    public void streamOperations(){
        List<String> names = Arrays.asList("Alice", "John","Abedi","Jeff");

        Predicate<String> nameStartingWithA = name -> name.startsWith("A");

        Function<String, String> toUpperCaseFunction = name -> name.toUpperCase();

        //getting names starting with A using stream
        List<String> result = names.stream()
        .filter(nameStartingWithA)
        .map(toUpperCaseFunction)
        .collect(Collectors.toList());

        System.out.println(result);

        Function<String, Integer> toIntLength = name -> name.length();

        //calculate length of names
        List<Integer> lengths = names.stream()
        .map(toIntLength)
        .collect(Collectors.toList());

        System.out.println(lengths);

    }

    
}

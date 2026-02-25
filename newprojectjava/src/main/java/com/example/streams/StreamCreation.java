package com.example.streams;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        //generating infinite stream of natural numbers
        System.out.println("Generating infinite stream of natural numbers:");
        Stream<Double> stream = Stream.generate(() -> Math.random()).limit(5);

        //unary operator takes a single argument and returns a result of the same type. In this case, it takes an Integer and returns the next Integer by adding 1 to it.
        UnaryOperator<Integer> nextInt = n -> n + 1;
        Stream.iterate(0, nextInt).limit(5).forEach(System.out::println);
        stream.forEach(System.out::println);


        //Sorting and peeking elements in stream
        System.out.println("Sorting and peeking elements in stream:");
        List<String> namesList = List.of("Alice", "John","Abedi","Jeff");
        Stream<String> names = namesList.stream();
        names.sorted()
        .peek(System.out::println)
        .forEach(System.out::println);
        System.out.println(names);

        //filtering and peeking elements in stream
        System.out.println("Filtering and peeking elements in stream:");
        Stream<String> names2 = namesList.stream();
        names2.filter(name -> name.startsWith("A")).peek(System.out::println)
        .forEach(System.out::println);System.out.println(names2);

        //removing duplicates and peeking elements in stream
        System.out.println("Removing duplicates and peeking elements in stream:");
        List<String> namesWithDuplicates = List.of("Alice", "John","Abedi","Jeff","Alice");
        Stream<String> names3 = namesWithDuplicates.stream();
        names3.distinct().peek(System.out::println)
        .forEach(System.out::println);System.out.println(names3);

        //transforming elements to uppercase
        System.out.println("Transforming elements to uppercase:");
        Stream<String> names4 = namesList.stream();
        names4.map(String::toUpperCase).peek(System.out::println)
        .forEach(System.out::println);System.out.println(names4);
        
    }

    public static void mappingOperations(){
        List<String> namesList = List.of("Alice", "John","Abedi","Jeff");
        Stream<String> names = namesList.stream();
        names.map(String::toUpperCase).forEach(System.out::println);
    }
    
}

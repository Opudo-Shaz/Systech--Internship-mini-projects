package com.example.optional; 
import java.util.Arrays;
import java.util.List;


public class ParallelOptionalDemo {
    public static void parallelStreams(){
        System.out.println("Parallel Stream with Optionals:");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        names.parallelStream()
            .map(String::toUpperCase)
            .filter(name -> name.startsWith("A"))
            .forEach(System.out::println);
    }
     
}

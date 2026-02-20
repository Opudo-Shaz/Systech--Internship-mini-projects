package com.example.optional;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //java optionals
        System.out.println("Java Optionals:");
        String name = "Alice";
        String name2 = null;
        // Optional<String> optionalName = Optional.ofNullable(name);
        // Optional<String> optionalName2 = Optional.ofNullable(name2);
        // System.out.println("Optional name: " + optionalName);
        // System.out.println("Optional name2: " + optionalName2);
        // System.out.println("Is optionalName present? " + optionalName.isPresent());
        // System.out.println("Is optionalName2 present? " + optionalName2.isPresent());
        // System.out.println("Optional name value: " + optionalName.orElse("Default Name"));
        // System.out.println("Optional name2 value: " + optionalName2.orElse("Default Name"));


        //mapping and filtering optionals
        System.out.println("Mapping and filtering optionals:");
        Optional<String> optionalName3 = Optional.ofNullable("Bob");
        Optional<String> optionalName4 = Optional.ofNullable("Charlie");
        Optional<String> optionalName5 = Optional.ofNullable(null);
        optionalName3.map(String::toUpperCase).ifPresent(System.out::println);
        optionalName4.filter(name3 -> name3.startsWith("C")).ifPresent(System.out::println);
        optionalName5.map(String::toUpperCase).ifPresentOrElse(
            System.out::println,
            () -> System.out.println("Optional name5 is empty")
        );

        
        //illustrating the use of optionals in a class
        System.out.println("Illustrating the use of optionals in a class:");
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person(null, 25);
        System.out.println("Person 1 name: " + person1.getNameOptional().orElse("Default Name"));
        System.out.println("Person 1 age: " + person1.getAgeOptional().orElse(0));
        System.out.println("Person 2 name: " + person2.getNameOptional().orElse("Default Name"));
        System.out.println("Person 2 age: " + person2.getAgeOptional().orElse(0));
     
        
    
    
    
    }
    
}

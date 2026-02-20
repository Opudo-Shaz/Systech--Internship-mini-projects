package com.example.optional;

import java.util.Optional;

public class Person {
    //illustrating the use of optionals in a class
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;

    }
    Optional<String> getNameOptional() {
        return Optional.ofNullable(name);
    }
    Optional<Integer> getAgeOptional() {
        return Optional.of(age);
    }
    

    
}

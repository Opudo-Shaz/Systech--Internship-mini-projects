package com.example.polyabstract.polymorphism;

public class Dog extends Animal {
    
    
        public Dog(String name, int age) {
            super(name, age);
        }
    
        @Override
        public void makeSound() {
            System.out.println("The dog barks.");
        }
            
    }


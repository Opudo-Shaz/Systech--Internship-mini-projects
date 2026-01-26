package com.example.polyabstract.polymorphism;
 
public class Main {
        public static void main(String[] args) {

        Animal myCat = new  Cat("Whiskers", 3);
        Animal myDog = new Dog("Buddy", 5);

        myCat.makeSound();   
        myCat.displayInfo();

        myDog.makeSound();  
        myDog.displayInfo();

        Animal[] animals = {new Cat("Luna", 2), new Dog("Max", 4)};
        for (Animal animal : animals) {
            animal.makeSound(); 
            animal.displayInfo();
        } 
    }
    
}

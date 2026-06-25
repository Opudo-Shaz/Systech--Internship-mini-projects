package com.example.gratis;

public class AnimalMain {

    public static void main(String[] args) {

        Animal a = new Cat();

        if(a instanceof Dog) {
            Dog d = (Dog)a;
            System.out.println("Dog");
        }

        System.out.println("Done");
    }
    
}

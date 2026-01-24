package com.example.assessments.javase010.question5;

public class Answers {
    

    //method overloading is a feature that allows a class to have more than one method with the same name, but different parameters (type, number, or both).
    //method overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.

    //example of method overloading:
    public int multiply(int a, int b) {
        return a * b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    //example of method overriding:
    class Animal {
        public void sound() {
            System.out.println("Animal makes a sound"); 
        }
        public void move() {
            System.out.println("Animal moves"); 
        }
        public void eat() {
            System.out.println("Animal eats"); 
        }
        public void displayInfo() {
            System.out.println("This is an animal"); 
        }
        }
    class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
      }  

      // fields are declared as private to prevent direct access from outside the class, ensuring data encapsulation and integrity.
      public class Car{
        private String model;
        private String color;
        private double price;

        public Car(String model, String color, double price) {
            this.model = model;
            this.color = color;
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            if(model != null && !model.trim().isEmpty())
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            if(color != null && !color.trim().isEmpty())
            this.color = color;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if(price >= 0)
            this.price = price;
        }
      }

      //a super class is used when you want to create a general class that can be extended by other classes, promoting code reuse and establishing a common interface.
      //example of super class:
        class Vehicle {
            private String brand;
            private String model;

            public void start() {
                System.out.println("Vehicle started");
            }
        }
        class Motorcycle extends Vehicle {
            @Override
            public void start() {
                System.out.println("Motorcycle started with a roar!");
            }
        }

        //overriding is used when a subclass needs to provide a specific implementation of a method that is already defined in its superclass, allowing for polymorphism and dynamic method resolution.
        //example of overriding:
        class Cat extends Animal {
            @Override
            public void sound() {
                System.out.println("Cat meows");
            }



        
    }
}
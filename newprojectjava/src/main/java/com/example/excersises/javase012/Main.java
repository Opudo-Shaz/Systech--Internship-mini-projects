package com.example.excersises.javase012;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "Intel i7", 1200.00);

        // Creating an instance of the static nested class Processor
        Computer.Processor processor = new Computer.Processor("Intel i7-10700K", 3.8);

        // Creating an instance of the inner class Memory
        Computer.Memory memory = computer.new Memory(16, "DDR4");

        System.out.println("Computer Brand: " + computer.getBrand());
        System.out.println("Computer Processor: " + computer.getProcessor());
        System.out.println("Computer Price: $" + computer.getPrice());
        System.out.println("Processor Model: " + processor.getModel());
        System.out.println("Processor Speed: " + processor.getSpeed() + " GHz");
        System.out.println("Memory Size: " + memory.getSize() + " GB");
        System.out.println("Memory Type: " + memory.getType());

        //testing with different computers
        Computer computer2 = new Computer("Apple", "M1", 1500.00);
        Computer.Processor processor2 = new Computer.Processor("Apple M1", 3.2);
        Computer.Memory memory2 = computer2.new Memory(8, "Unified");  
        System.out.println("\nComputer Brand: " + computer2.getBrand());
        System.out.println("Computer Processor: " + computer2.getProcessor());
        System.out.println("Computer Price: $" + computer2.getPrice());
        System.out.println("Processor Model: " + processor2.getModel());
        System.out.println("Processor Speed: " + processor2.getSpeed() + " GHz");
        System.out.println("Memory Size: " + memory2.getSize() + " GB");
        System.out.println("Memory Type: " + memory2.getType());  
    }
    
}

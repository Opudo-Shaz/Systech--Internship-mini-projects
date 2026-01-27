package com.example.excersises.javase012;

public class Computer {
    private String brand;
    private String processor;
    private double price;
    
    //static nested class processor
    public static class Processor {
        private String model;
        private double speed; 

        public Processor(String model, double speed) {
            this.model = model;
            this.speed = speed;
        }
 
        public String getModel() {
            return model;
        }

        public double getSpeed() {
            return speed;
        }
    }

    //inner class memory
    public class Memory {
        private int size; 
        private String type;
        public Memory(int size, String type) {
            this.size = size;
            this.type = type;
        }
        public int getSize() {
            return size;
        }
        public String getType() {
            return type;
        }
    }

    public Computer(String brand, String processor, double price) {
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public double getPrice() {
        return price;
    }
}


package com.example.inheritance;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, int year, double loadCapacity) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() { 
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
    
}

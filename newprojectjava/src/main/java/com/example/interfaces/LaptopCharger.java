package com.example.interfaces;
 
public class LaptopCharger implements ThreePingPlug {
    @Override
    public void accessPower() {
        System.out.println("Accessing power through Laptop Charger.");
    }

    @Override
    public void printUsageDetails() {
        System.out.println("Laptop Charger is used to charge laptops.");
    }
    
}

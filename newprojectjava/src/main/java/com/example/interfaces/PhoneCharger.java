package com.example.interfaces;

public class PhoneCharger implements ThreePingPlug {
    @Override
    public void accessPower() {
        System.out.println("Accessing power through Phone Charger.");
    }

    @Override
    public void printUsageDetails() {
        System.out.println("Phone Charger is used to charge mobile phones.");
    }   
    
    
}

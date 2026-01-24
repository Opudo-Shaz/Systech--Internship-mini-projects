package com.example.inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", 2020);
        Truck truck = new Truck("Ford", 2018, 5.0);

        vehicle.displayInfo();
        truck.displayInfo();
    }
}
 
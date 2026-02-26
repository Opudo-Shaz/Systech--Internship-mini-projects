package com.example.revesionjavase; 

 public class WaterBottle {
 private String brand;
 private boolean empty;
 public static void main(String[] args) {
    short numPets = 5;
    numPets.lenthgth(); // This will cause a compilation error because 'short' is a primitive type and does not have methods.

    WaterBottle wb = new WaterBottle();


    System.out.print("Empty = " + wb.empty);

    System.out.print(", Brand = " + wb.brand);
} } 
    

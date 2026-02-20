package com.example.revesionjavase;  



    public class MathFunctions {

    public static void addToInt(int x, int amountToAdd) {

    x = x + amountToAdd;

    }


    public static void main(String[] args) {
        
    int a = 15;

    int b = 10;

    MathFunctions.addToInt(a, b);

    System.out.println(a);
} 
     //   System.out.print("a");
     //   try {

/*         System.out.print("b");
        throw new IllegalArgumentException();

        } catch (RuntimeException e) {

        System.out.print("c");
        } finally {

        System.out.print("d");
        }
        System.out.print("e");
            
    } */
}

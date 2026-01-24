package com.example.assessments.javase010;

public class calculator {
    public int add(int a, int b){
        return a + b;
    }
     public int add(int a, int b, int c){
        return a + b + c;
    
    }
    public double add(double a, double b){
        return a + b;
    }

    public String add(String a, String b){
        return a + b;
    }


    public class ScientificCalculator extends calculator {


        @Override
        public int add(int a, int b) {
           System.out.println("Adding numbers: " + a + " and " + b);

        return super.add(a, b); 
        }
         

        public double power(double base, double exponent) {
            return Math.pow(base, exponent);
        }

        public double squareRoot(double number) {
            return Math.sqrt(number);
        }
    }


    //overloading means having multiple methods with the same name but different parameters (type, number, or both) 
    //overriding means providing a new implementation for a method inherited from a superclass in a subclass

}

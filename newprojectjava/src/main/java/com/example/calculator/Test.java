package com.example.calculator;

public class Test {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x + x++ + --x;
        System.out.println(y);
    }
    
}

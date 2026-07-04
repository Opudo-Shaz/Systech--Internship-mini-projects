package com.example.gratis;

public class B  extends A {
    B() {
        this(5);
        System.out.println("B");
    }
    B(int x) {
        System.out.println("X = " + x);
    }

    
}

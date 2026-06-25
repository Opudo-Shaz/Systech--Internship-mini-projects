package com.example.gratis;

public class Test {
    int a1;
    public static void doProduct(int a){
        a = a * a;
    }
    public static void doString(java.lang.StringBuilder s){
        s.append(" " + s);
    }
    public static void main(String[] args) {
        Test item = new Test();
        item.a1 = 11;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
        Integer i = 10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i + " " + sb + " " + item.a1);

    }
}
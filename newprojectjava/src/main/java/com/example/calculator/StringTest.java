package com.example.calculator; 

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
    }
    
}

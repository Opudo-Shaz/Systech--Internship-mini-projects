package com.example.collections.datastructures.set;

import java.util.Set;
import java.util.TreeSet;

//Tree set does not allow null, sorts the list in order of insertion, ignores duplicates

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> Students = new TreeSet<>();
        Students.add("John");
        Students.add("Harry");
        Students.add("Alice");
        Students.add("May");

        System.out.println(Students); 
        System.out.println("size is " + Students.size());
    }
    
}

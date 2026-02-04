package com.example.collections.datastructures.set;

import java.util.LinkedHashSet;
import java.util.Set;

//LInked Hash allow upto one null, follows order of insertion
public class LinkedHashsetDemo {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add(null);
        names.add("Elly");
        names.add("Emmah");
        names.add("Elly");
        System.out.println(names); 
    }
    
}

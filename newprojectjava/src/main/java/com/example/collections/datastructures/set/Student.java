package com.example.collections.datastructures.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Hash set only removes duplicates from the list, no order
public class Student {
    public void removeDuplicates(){
        
    Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Joe"); 
        names.add(null);
        names.add(null);
        names.add("Enock");

        for(String name : names){
            System.out.println(name);
        }
        //using iterator interface
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            
        }

        System.out.println("\n=== forEach lambda ==="); 
         names.forEach(name -> System.out.println("Student Name: " + name));

        // System.out.println(names);
        // System.out.println(names.size());
        // System.out.println("contains Joe" + names.contains("Joe"));



    }
    
    
}

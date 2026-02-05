package com.example.collections.datastructures.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Alice", 1001);
        students.put("John", 1002);
        students.put("Angy", 1003);

        System.out.println(students);

        for(Map.Entry<String, Integer> entry : students.entrySet()){
            System.out.println(entry.getKey() + " = " +  entry.getValue());
        }
    }
      
} 
 
package com.example.collections.datastructures.map;

import java.util.HashMap;
import java.util.Map;


/* 
Key Characteristics:
Key-value pairs
Each key maps to exactly one value
No duplicate keys allowed 
Values can be duplicated 
*/

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> StudentGrades = new HashMap<>();
        Map<Integer, String> employeeMap = new HashMap<>(6);
        //adding key value pairs
        StudentGrades.put("Alice", 89);
        StudentGrades.put("Jon", 67);
        employeeMap.put(7, "Henrik");
        employeeMap.put(5, "Lucky");
        employeeMap.put(3, "Job");

        //printing the values in the map
        System.out.println(StudentGrades);
        System.out.println(employeeMap);

        //print size of the map, number of items
        System.out.println("Size of studentsGrade map is " + StudentGrades.size());
        System.out.println("Size of employee map is " + employeeMap.size());

        //getting  value for specific student and check if hashmap contains a value
        System.out.println("Jon's Grade is " + StudentGrades.get("Jon"));
        System.out.println(employeeMap.containsValue("Jeff"));

        // put values if absent
        employeeMap.putIfAbsent(1, "Jeff");
        }
    
    
}

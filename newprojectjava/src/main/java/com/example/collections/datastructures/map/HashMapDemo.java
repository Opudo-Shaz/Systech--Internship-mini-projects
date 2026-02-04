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

        System.out.println(StudentGrades);
        System.out.println(employeeMap);
        System.out.println("Size of studentsGrade map is " + StudentGrades.size());

        }
    
    
}

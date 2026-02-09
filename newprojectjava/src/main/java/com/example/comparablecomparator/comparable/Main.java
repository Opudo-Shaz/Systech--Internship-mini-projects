package com.example.comparablecomparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 22));
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 21));

        System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println(s.name + " " + s.age);
        }

        // This works because Student implements Comparable
        Collections.sort(students);

        System.out.println("\nAfter sorting (by name):");
        for (Student s : students) {
            System.out.println(s.name + " " + s.age);
        }
   }
    
}

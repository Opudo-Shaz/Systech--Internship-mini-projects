package com.example.collections.datastructures.linkedlist; 

import java.util.LinkedList;



public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        students.add("Emmah");
        students.add("Goddy");
        students.add("Moraa");
        students.add("Wes");

        students.add("Zara");
        students.add(4, "Angy");
        students.addLast("Ollah");
        students.addFirst("Aggrey");

 
        // students.remove(0);
        //System.out.println(students.get(4));

        System.out.println(students);

        for(String student : students){
            System.out.println(student);
        }



    
    }
    
}

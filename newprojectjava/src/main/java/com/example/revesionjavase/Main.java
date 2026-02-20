package com.example.revesionjavase;  

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    
    int[] array = {6,9,8};
    List<Integer> list = new ArrayList<>();

    list.add(array[0]);
    list.add(array[2]);
    list.add(10);
    list.set(1, array[1]);
    list.remove(0);
    System.out.println(list);
    System.out.println(java.util.Arrays.toString(array));
 }
}

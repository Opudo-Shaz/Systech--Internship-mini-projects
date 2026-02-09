package com.example.comparablecomparator;

import java.util.Arrays;
import java.util.Collections; 
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Sarah" , "Elly" , "Yonah");
        Collections.sort(names);
        System.out.println(names);
    }
    
}

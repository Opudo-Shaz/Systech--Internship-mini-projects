package com.example.collections.datastructures.map;

import java.util.Map;
import java.util.TreeMap;

/* 
TreeMap is ideal when:

You need sorted data 

You need range queries

You want ordered reports

You’re building leaderboards 

You’re indexing data 
*/

public class TreeMapDemo {
    public static void main(String[] args) {
        
        Map<String, Integer> scores = new TreeMap<>();

        scores.put("Charlie", 85);
        scores.put("Alice", 92);
        scores.put("Bob", 88);
        scores.put("Alice", 95); // overwrite

        System.out.println(scores);

    }
}

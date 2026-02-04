package com.example.excersises.javase016;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueWordCounter {
    public static void main(String[] args) {
        String txt = "hello world hello Java World Programming";

            // normalize text
        String cleanedText = txt.toLowerCase().replaceAll("[^a-z\\s]", "");

        String[] words = cleanedText.split("\\s+");

        // HashSet (no order)
        Set<String> hashSetWords = new HashSet<>();

        // LinkedHashSet preserves insertion order
        Set<String> linkedHashSetWords = new LinkedHashSet<>();

        for (String word : words) {
            hashSetWords.add(word);
            linkedHashSetWords.add(word);
        }

        System.out.println("Original Text:");
        System.out.println(txt);

        System.out.println("\n=== HashSet Results ===");
        System.out.println("Unique word count: " + hashSetWords.size());
        System.out.println(hashSetWords);

        System.out.println("\n=== LinkedHashSet Results ===");
        System.out.println("Unique word count: " + linkedHashSetWords.size());
        System.out.println(linkedHashSetWords);
    }
    
}

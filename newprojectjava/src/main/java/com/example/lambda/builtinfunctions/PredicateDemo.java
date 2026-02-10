package com.example.lambda.builtinfunctions;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
   
        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        for (Integer num : numbers) {
            System.out.println(num + " -> " + " is even? " + isEven.test(num));
        }
    }
}

   
    


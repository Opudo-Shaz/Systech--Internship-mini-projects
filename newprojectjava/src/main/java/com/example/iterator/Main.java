package com.example.iterator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
    List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(45); 
        numbers.add(67);

    Iterator<Integer> it = numbers.iterator();

    while(it.hasNext()){
        int value = it.next();
        System.out.println(value);
    }

//iterating through array of strings
    List<String> cities = new ArrayList<>(List.of("NY", "London", "Tokyo"));

        ListIterator<String> iterator = cities.listIterator();

        while (iterator.hasNext()) {
            String city = iterator.next();
            if(city.equals("London")){
                iterator.set("UK");
            }
            System.out.println(iterator.next());
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

}

    
    
}

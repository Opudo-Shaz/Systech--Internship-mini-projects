package com.example.strings2;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {{
            add("Hi");
            add("How");
            add("Are");
            add("You");
        }};
      
        list.removeIf(s -> {System.out.println(list);return s.length() <= 2;});
        System.out.println(list);
        //System.out.println("removed");
    }
    
}

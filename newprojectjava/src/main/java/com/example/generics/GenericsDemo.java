package com.example.generics;
import java.util.*;

public class GenericsDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(new Date());
    String first = (String) list.get(0);
    System.out.println(first);

    // String second = (String) list.get(1);
    // System.out.println(second);

    //rewriting with type casting 
    List<String> stringList = new ArrayList<>();
    stringList.add("Hello");
    stringList.add("World");
    //stringList.add(123);
    for(String s: stringList){
        System.out.println(s.length());
    }
    String x = stringList.get(0);
    String y = stringList.get(1);

    System.out.println(x);
    System.out.println(y);

    Box<String> strBox = new Box<>();
    strBox.set("Hello");
    String s = strBox.get();
    System.out.println(s);

    }
    
}

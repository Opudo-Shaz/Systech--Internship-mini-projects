package com.example.gratis;

public class StringBuilder {
    public static void main(String[] args) {
        String stuff = "TV";
        String res = null;

        res = stuff.equals("TV") ? "Walter" :stuff.equals("Movie")? "White" :"No results";

        System.out.println(res);
    }
    
}

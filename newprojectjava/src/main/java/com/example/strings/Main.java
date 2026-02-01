package com.example.strings;

public class Main {
    public static void main(String[] args) {
        System.out.println(1+2 + " Systech ");
        System.out.println(" Systech " + 1+2);
        System.out.println(" Systech " + (1+2) );

        garbageCollectionDemo();
    }

    public static void garbageCollectionDemo() {
        String str1 = new String("Hello");
        String str2 = new String("World");
        Book book1 = new Book("Java Programming", "Author A");
        Book book2 = new Book("Data Structures", "Author B");
        
        str1 = null; 
        str2 = null; 
        book1 = null; 
        book2 = null;
        
        System.gc(); 
    }
    public static void  printDetails(String str) {
        System.out.println("String details: " + str);
        System.out.println("Length: " + str.length());
    }

    public static void print(Book book) {
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
    }
    
}

package com.example.excersises.javase012.librarysystem;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Central Library", "Downtown");

        // Creating an instance of the static nested class Book
        Library.Book book1 = new Library.Book("Java Programming", "John Doe", "123456789");
        Library.Book book2 = new Library.Book("Data Structures", "Jane Smith", "987654321");

        // Creating an instance of the inner class Member
        Library.Member member1 = library.new Member("Alice Johnson", "M001");
        Library.Member member2 = library.new Member("Bob Williams", "M002");

        System.out.println("Library Name: " + library.getName());
        System.out.println("Library Location: " + library.getLocation());
        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Book Author: " + book1.getAuthor());
        System.out.println("Book ISBN: " + book1.getIsbn());
        System.out.println("Book Available: " + book1.isAvailable());

        //book 2 details
        System.out.println("\nBook Title: " + book2.getTitle());
        System.out.println("Book Author: " + book2.getAuthor());
        System.out.println("Book ISBN: " + book2.getIsbn());
        System.out.println("Book Available: " + book2.isAvailable());   

        //member details
        System.out.println("\nMember Name: " + member1.getName());
        System.out.println("Member ID: " + member1.getMemberId());
        System.out.println("Member Name: " + member2.getName());
        System.out.println("Member ID: " + member2.getMemberId());
    }
}
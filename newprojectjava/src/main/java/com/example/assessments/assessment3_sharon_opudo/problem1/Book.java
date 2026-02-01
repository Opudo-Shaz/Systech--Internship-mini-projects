package com.example.assessments.assessment3_sharon_opudo.problem1;

public class Book extends LibraryItem{
    private String isbn;
    private String genre;

    public Book(int itemId, String title, String author, String isbn, String genre) {
        super(itemId, title, author);
        this.isbn = isbn;
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("ISBN: " + isbn);
        System.out.println("Genre: " + genre);
    }
    
}

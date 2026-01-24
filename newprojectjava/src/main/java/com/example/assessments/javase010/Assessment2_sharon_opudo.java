package com.example.assessments.javase010;

public class Assessment2_sharon_opudo {

public static class Book {

    private String title;
    private String author;
    private String isbn;
    private double price;
    private boolean isAvailable;

    // Constructor using setters
    public Book(String title, String author, String isbn, double price) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setPrice(price);
        this.isAvailable = true;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            throw new RuntimeException("Title cannot be empty");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            throw new RuntimeException("Author cannot be empty");
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn != null && isbn.matches("\\d{13}")) {
            this.isbn = isbn;
        } else {
            throw new RuntimeException("ISBN must be exactly 13 digits");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new RuntimeException("Price cannot be negative");
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Borrow book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You borrowed: " + title);
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }
    }

    // Return book
    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }

    @Override
    public String toString() {
        return "Book {" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", Price=$" + price +
                ", Available=" + isAvailable +
                '}';
    }
}
}
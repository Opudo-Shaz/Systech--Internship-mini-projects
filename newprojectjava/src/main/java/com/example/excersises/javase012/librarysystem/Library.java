package com.example.excersises.javase012.librarysystem;

public class Library {
    private String name;
    private String location;

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public static class Book {
        private String title;
        private String author;
        private String isbn;
        private boolean isAvailable;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.isAvailable = true;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getIsbn() {
            return isbn;
        }
        public boolean isAvailable() {
            return isAvailable;
        }
    }
    public class Member {
        private String name;
        private String memberId;
        private Book[] borrowedBooks;

        public Member(String name, String memberId) {
            this.name = name;
            this.memberId = memberId;
        }

        public String getName() {
            return name;
        }

        public String getMemberId() {
            return memberId;
        }
        public Book[] getBorrowedBooks() {
            return borrowedBooks;
        }
    }

    
}

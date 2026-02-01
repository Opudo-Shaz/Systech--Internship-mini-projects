package com.example.assessments.assessment3_sharon_opudo.problem3;

public class Books extends Product {
    private String author;
    private String publisher;
    private String isbn;

    public Books(String productId, String name, double price, int stock,
                 String author, String publisher, String isbn) {
        super(productId, name, price, stock);
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05;
    }

    @Override
    public String getProductType() {
        return "Books";
    }
    
}

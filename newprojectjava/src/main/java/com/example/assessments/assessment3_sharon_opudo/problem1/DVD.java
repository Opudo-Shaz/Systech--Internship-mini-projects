package com.example.assessments.assessment3_sharon_opudo.problem1;

public class DVD extends LibraryItem{
    private int duration;
    private String rating;

    public DVD(int itemId, String title, String author, int duration, String rating){
        super(itemId, title, author);
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD \"" + title + "\" checked out. Please return within 3 days.");
        } else {
            System.out.println("DVD \"" + title + "\" is not available.");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Rating: " + rating);
    }
    
}

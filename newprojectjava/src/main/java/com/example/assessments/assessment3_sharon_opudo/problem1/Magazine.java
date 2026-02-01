package com.example.assessments.assessment3_sharon_opudo.problem1;

public class Magazine extends LibraryItem{
    private int issueNumber;
    private String publicationDate;

    public Magazine(int itemId, String title, String author, int issueNumber, String publicationDate){
        super(itemId, title, author);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Publication Date: " + publicationDate);
    }

    
}
 
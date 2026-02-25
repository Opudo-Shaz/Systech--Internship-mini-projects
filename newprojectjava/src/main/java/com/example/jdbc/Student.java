package com.example.jdbc; 

public class Student {
    private int id;
    private String RegNo;
    private String FirstName;
    private String LastName;
    private int IdNumber;
    private String email;

    public Student() {
    }

    public Student(int id, String RegNo, String FirstName, String LastName, int IdNumber, String email) {
        this.id = id;
        this.RegNo = RegNo;
        this.FirstName = FirstName;
        this.LastName = LastName    ;
        this.IdNumber = IdNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegNo() {
        return RegNo;
    }

    public void setRegNo(String RegNo) {
        this.RegNo = RegNo;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(int IdNumber) {
        this.IdNumber = IdNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

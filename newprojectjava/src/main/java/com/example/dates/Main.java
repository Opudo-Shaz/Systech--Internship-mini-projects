package com.example.dates;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;



public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date and time: " + date);
        
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 2);
        System.out.println("Date after adding 2 months: " + calendar.getTime());

    String userDate = "2023-08-15";
    LocalDate dob = LocalDate.parse(userDate);
    System.out.println("User's date of birth: " + dob);
    LocalDate userParsedDate = LocalDate.parse(userDate);
    System.out.println("User parsed date: " + userParsedDate);

    }
public static void workingWithLocalDate() {
    LocalDate today = LocalDate.now();
    System.out.println("Today's date: " + today);

    LocalDate specificDate = LocalDate.of(2020, 1, 1);
    System.out.println("Specific date: " + specificDate);

    LocalDate parsedDate = LocalDate.parse("2021-12-25");
    System.out.println("Parsed date: " + parsedDate);

  
}

//new date system
public static void newDateSystem() {
    LocalDate date1 = LocalDate.of(2022, 5, 15);
    LocalDate date2 = LocalDate.of(2023, 10, 20);

    ChronoUnit.DECADES.between(date1, date2);
    System.out.println("Date 1: " + date1);
    System.out.println("Date 2: " + date2);

    // Comparing dates
    if (date1.isBefore(date2)) {
        System.out.println("Date 1 is before Date 2");
    } else if (date1.isAfter(date2)) {
        System.out.println("Date 1 is after Date 2");
    } else {
        System.out.println("Both dates are the same");
    }
}
    
}

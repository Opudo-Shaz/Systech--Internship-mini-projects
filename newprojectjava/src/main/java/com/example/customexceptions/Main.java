package com.example.customexceptions;
 
public class Main {
    public static void main(String[] args) {
        try {
            StudentAlreadyExistException.createStudent("Alice", "R001", "Math");

        } catch (StudentAlreadyExistException e) {
            System.out.println("Error: " + e.getMessage());
         } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            
        String result = StudentAlreadyExistException.getStudentByName("David");
        System.out.println(result); 
    }



}
  

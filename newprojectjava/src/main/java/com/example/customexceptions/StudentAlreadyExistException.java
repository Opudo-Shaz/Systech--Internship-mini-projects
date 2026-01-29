package com.example.customexceptions;
import java.util.Set;
import java.util.HashSet;
 
public class StudentAlreadyExistException extends Exception {

    public StudentAlreadyExistException(String message) {
        super(message);
    }
    //method to create student
    public static void createStudent(String name, String rollNumber, String subject) throws StudentAlreadyExistException {
        HashSet<String> names = new HashSet<>();
        names.addAll(Set.of ("Alice", "Bob", "Charlie"));
        if (names.contains(name)) {
            throw new StudentAlreadyExistException("Student with name " + name + " already exists.");
        } else {
            System.out.println("Student created: " + name + ", Roll Number: " + rollNumber + ", Subject: " + subject);
        }   
    }
    //method to fetch student by name
    public static String getStudentByName(String name) throws StudentNotFoundException {
        HashSet<String> names = new HashSet<>();
        names.addAll(Set.of ("Alice", "Bob", "Charlie"));
        if (names.contains(name)) {
            throw new StudentNotFoundException("Student found: " + name);
        } else {
            return "Student with name " + name + " does not exist.";
        }
    }
    
}

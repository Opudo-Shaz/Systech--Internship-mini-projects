package com.example.customexceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {



    public static void main(String[] args) {
 
        BufferedReader reader = null;

        try {
            // May throw ArrayIndexOutOfBoundsException
            String filename = args[0];

            // May throw FileNotFoundException
            reader = new BufferedReader(new FileReader(filename));

            String line;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {   // May throw IOException
                System.out.println(line);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide a filename as a command line argument.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());

        } finally {
            // Always close the resource
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error while closing the file.");
            }
        }

        // Program continues after exception
        System.out.println("Program continues running...");
    }
}

    


package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        Config config = new Config(
                "jdbc:postgresql://localhost:5432/sharon_db",
                "sharon",
                "shara2010@"
        );

        try (Connection connection = DriverManager.getConnection(
                config.getDatabaseUrl(),
                config.getUsername(),
                config.getPassword());

             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {

            System.out.println("Connected successfully!\n");

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String regNo = resultSet.getString("reg_no");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int idNumber = resultSet.getInt("id_number");
                String email = resultSet.getString("email");

                System.out.println("ID: " + id);
                System.out.println("Reg No: " + regNo);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("ID Number: " + idNumber);
                System.out.println("Email: " + email);
                System.out.println("-----------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
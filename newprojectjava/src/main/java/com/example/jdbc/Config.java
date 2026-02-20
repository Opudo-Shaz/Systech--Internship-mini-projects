package com.example.jdbc; 

public class Config {
    private String databaseUrl;
    public static final String username = "sharon";
    public static final String password = "shara2010@";

    public Config(String databaseUrl, String username, String password) {
        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}

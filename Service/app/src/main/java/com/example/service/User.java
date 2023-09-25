package com.example.service;

public class User {
    private String username;
    private String account;
    private String password;

    public User(String username, String account, String password) {
        this.username = username;
        this.account = account;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

}

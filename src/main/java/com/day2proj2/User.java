package com.day2proj2;

public class User {

    private int userId;
    private String userName;
    private String email;

    public User(int userId, String userName, String email) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public void displayDetails() {
        System.out.println("  User ID   : " + userId);
        System.out.println("  User Name : " + userName);
        System.out.println("  Email     : " + email);
    }
}
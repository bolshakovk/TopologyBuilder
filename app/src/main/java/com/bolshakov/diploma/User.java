package com.bolshakov.diploma;

public class User {
    public String id;
    public String userName;
    public String password;
    public String email;

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String membership;

    public User(String id, String userName, String password, String email, String membership) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.membership = membership;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String id) {
        this.id = id;
    }
}

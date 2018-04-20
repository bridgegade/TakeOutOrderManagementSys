package com.example.varun.snapsauce;

/**
 * Created by anthony on 4/20/18.
 */

public class User {
    int ID;
    String type;
    String username;
    String password;
    String email;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public User(int ID, String type, String username, String password, String email) {

        this.ID = ID;
        this.type = type;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}

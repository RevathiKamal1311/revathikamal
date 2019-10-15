package com.example.loginpage;

public class User {
    int id;
    String name;
    String password;

    public User(String name, String password)
    {
        this.name = name;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    //setting id
    public void setId(int id) {
        this.id = id;
    }
    //getting name
    public String getName() {
        return name;
    }
    //setting name
    public void setName(String name) {
        this.name = name;
    }
    //getting password
    public String getPassword() {
        return password;
    }
    //setting password
    public void setPassword(String password) {
        this.password = password;
    }
}

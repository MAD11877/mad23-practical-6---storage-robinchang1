package com.example.emptybase;

public class User {
    String name;
    String description;
    int id;
    boolean followed;

    public User(String name, String description, int id, boolean followed) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }
}
package com.skypro.lyambdalion.introducing;

public class User {
    private String name;

    User(String n) {
        this.name = n;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

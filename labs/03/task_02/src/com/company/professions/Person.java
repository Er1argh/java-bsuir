package com.company.professions;

public class Person {
    private String fullName;

    public Person() {
        fullName = "null";
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

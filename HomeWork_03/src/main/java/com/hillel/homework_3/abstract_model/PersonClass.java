package com.hillel.homework_3.abstract_model;

public abstract class PersonClass {
    String firstName;
    String lastName;

    public PersonClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

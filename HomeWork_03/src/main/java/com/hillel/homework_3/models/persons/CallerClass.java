package com.hillel.homework_3.models.persons;

import com.hillel.homework_3.abstract_model.PersonClass;

public class CallerClass extends PersonClass {
    private final String city;
    private final String phoneNumber;

    public CallerClass(String firstName, String lastName, String city, String phoneNumber) {
        super(firstName, lastName);
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "FirstPersonClass{" +
                "city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName=" + getFirstName() + '\'' +
                ", lastName=" + getLastName() +
                '}';
    }
}

package com.hillel.homework_10.models;

public class UserClass {
    private final String name;
    private final String email;
    private final String phone_number;
    private String surname;
    private final int day;
    private final int month;
    private final int year;
    private int age;
    private int steps;
    private double weight;
    private double top_pressure;
    private double bottom_pressure;

    public UserClass(String name, String surname, String email, String phone_number, int day, int month, int year,
                     double weight, int steps, double top_pressure, double bottom_pressure) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone_number = phone_number;
        this.day = day;
        this.month = month;
        this.year = year;
        this.weight = weight;
        this.steps = steps;
        this.top_pressure = top_pressure;
        this.bottom_pressure = bottom_pressure;
    }

    public void setSurname(String surname) {
        if (!surname.isEmpty()) {
            this.surname = surname;
        } else {
            System.out.println("Error");
        }
    }

    public void setSteps(int steps) {
        if (steps > 0) {
            this.steps = steps;
        } else {
            System.out.println("Error");
        }
    }

    public void setWeight(double weight) {
        if (weight > 0.0) {
            this.weight = weight;
        } else {
            System.out.println("Error");
        }
    }

    public void setTop_pressure(double top_pressure) {
        if (top_pressure > 0.0) {
            this.top_pressure = top_pressure;
        } else {
            System.out.println("Error");
        }
    }

    public void setBottom_pressure(double bottom_pressure) {
        if (bottom_pressure > 0.0) {
            this.bottom_pressure = bottom_pressure;
        } else {
            System.out.println("Error");
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone_number() {
        return this.phone_number;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "-------------------------------------------------------------------------\n" +
                "Name: " + getName() + "\n" + "Surname: " + this.surname + "\n" + "Date of birth: "
                + getDay() + "." + getMonth() + "." + getYear() + "\n" + "Phone number: " + getPhone_number() + "\n"
                + "Email: " + getEmail() + "\n" + "Weight: " + this.weight + "\n" + "Steps: " + this.steps + "\n"
                + "Top Pressure: " + this.top_pressure + "\n" + "Bottom pressure: " + this.bottom_pressure + "\n"
                + "Age: " + getAge() + "\n";
    }

}

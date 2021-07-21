package com.hillel.homework_13.interfaces;

public interface SmartphonesInterface {
    default void call() {
        System.out.println("Yea, you can make calls.");
    }

    default void sms() {
        System.out.println("And send sms!");
    }

    default void internet() {
        System.out.println("In addition,u can surf the web");
    }
}

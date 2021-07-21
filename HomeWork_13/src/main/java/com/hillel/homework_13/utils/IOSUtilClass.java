package com.hillel.homework_13.utils;

import com.hillel.homework_13.interfaces.IOSInterface;
import com.hillel.homework_13.interfaces.SmartphonesInterface;

public class IOSUtilClass implements SmartphonesInterface, IOSInterface {
    @Override
    public void call() {
        System.out.println("Yea, you can make calls.");
        System.out.println("Or you can use integrated video calls.");
    }

    @Override
    public void sms() {
        System.out.println("You can send sms!");
        System.out.println("From iPhone to iPhone it is free, if you have internet.");
    }

    @Override
    public void internet() {
        System.out.println("U can surf the web");
        System.out.println("Using the super fast web browser <Safari> ");
    }

    @Override
    public void ios_os_feature() {
        System.out.println("Using iPhone you must buy music to support musicians, of course, if u want to listen\n" +
                "to the music legally.");
        System.out.println("It is benefits of IOS OS.");
    }
}

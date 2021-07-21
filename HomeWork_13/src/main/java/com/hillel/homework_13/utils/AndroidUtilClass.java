package com.hillel.homework_13.utils;

import com.hillel.homework_13.interfaces.LinuxInterface;
import com.hillel.homework_13.interfaces.SmartphonesInterface;

public class AndroidUtilClass implements SmartphonesInterface, LinuxInterface {
    @Override
    public void call() {
        System.out.println("Yea, you can make calls.");
        System.out.println("Instead use Telegram calls, it is free...");
    }

    @Override
    public void sms() {
        System.out.println("You can send sms!");
        System.out.println("Or use Telegram...");
    }

    @Override
    public void internet() {
        System.out.println("U can surf the web");
        System.out.println("Of course to download telegram!");
    }

    @Override
    public void linux_os_features() {
        System.out.println("""
                Using linux-friendly devices you can use tons of free and useful software, moreover,
                u can download any programme and song, but it is illegal :) (ukrainians don't care)
                It is benefits of LinuxOS.""");
    }
}

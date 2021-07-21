package com.hillel.homework_13.interfaces;

public interface LinuxInterface {
    default void linux_os_features() {
        System.out.println("Using linux-friendly devices you can use tons of free and useful software, moreover,\n" +
                "u can download any programme and song, but it is illegal :) (ukrainians don't care)\n");
    }
}

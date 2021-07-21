package com.hillel.homework_13.services;

import com.hillel.homework_13.utils.AndroidUtilClass;
import com.hillel.homework_13.utils.IOSUtilClass;

public class DeviceServiceClass {
    public static void showDevices() {
        int number_result;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("""
                    What can iPhones and Androids do:
                    Press 1 if you want to know about CALLS
                    Press 2 if you want to know about SMS
                    Press 3 if you want to know about INTERNET
                    Press 4 if you want to now about OS
                    Press 5 to exit""");
            System.out.println("----------------------------------------------------");
            number_result = setNumber();
            switch (number_result) {
                case 1 -> {
                    System.out.println("----------------------------------------------------");
                    IOSUtilClass iPhone_0 = new IOSUtilClass();
                    AndroidUtilClass android_0 = new AndroidUtilClass();
                    System.out.println("Calls in iPhones: ");
                    iPhone_0.call();
                    System.out.println("Calls in Androids: ");
                    android_0.call();
                }
                case 2 -> {
                    System.out.println("----------------------------------------------------");
                    IOSUtilClass iPhone_1 = new IOSUtilClass();
                    AndroidUtilClass android_1 = new AndroidUtilClass();
                    System.out.println("SMS in iPhones: ");
                    iPhone_1.sms();
                    System.out.println("SMS in Androids: ");
                    android_1.sms();
                }
                case 3 -> {
                    System.out.println("----------------------------------------------------");
                    IOSUtilClass iPhone_2 = new IOSUtilClass();
                    AndroidUtilClass android_2 = new AndroidUtilClass();
                    System.out.println("Internet in iPhones: ");
                    iPhone_2.internet();
                    System.out.println("Internet in Androids: ");
                    android_2.internet();
                }
                case 4 -> {
                    System.out.println("----------------------------------------------------");
                    IOSUtilClass iPhone_3 = new IOSUtilClass();
                    AndroidUtilClass android_3 = new AndroidUtilClass();
                    System.out.println("OS in iPhones: ");
                    iPhone_3.ios_os_feature();
                    System.out.println("OS in Androids: ");
                    android_3.linux_os_features();
                }
                case 5 -> {
                    System.out.println("----------------------------------------------------");
                    System.out.println("Bye ;) ");
                }
            }
        } while (number_result != 5);
    }

    public static int setNumber() {
        return MusicServiceClass.initOption();
    }
}

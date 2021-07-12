package com.hillel.homework_1.utils;

import java.util.Scanner;

public class ScannerUtilClass {
    public static int setOption() {
        int option;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please, set option: ");
            while (!sc.hasNextInt()) {
                System.out.println("Integer required!");
                sc.next();
            }
            option = sc.nextInt();
        } while (option != 1 && option != 2 && option != 3 && option != 4);
        return option;
    }

    public static int setAttribute() {
        int attribute;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please, set attribute(width, length, height): ");
            while (!sc.hasNextInt()) {
                System.out.println("Integer required!");
                sc.next();
            }
            attribute = sc.nextInt();
        } while (attribute <= 0);
        return attribute;
    }
}

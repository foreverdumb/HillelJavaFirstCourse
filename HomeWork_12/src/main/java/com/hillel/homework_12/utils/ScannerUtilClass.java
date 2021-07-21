package com.hillel.homework_12.utils;

import java.util.Scanner;

public class ScannerUtilClass {
    public static String getDrinkName() {
        String drink_choice;
        boolean isCorrect = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please, choose the drink: ");
            drink_choice = sc.next();
            if (drink_choice.matches("^[a-zA-Z]+$")) {
                isCorrect = false;
            }
        } while (isCorrect);
        return drink_choice;
    }

    public static String isContinue() {
        String continue_stop;
        boolean isCorrect = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Do you want to order more?\n" + "Yes/No?");
            continue_stop = sc.next();
            if (continue_stop.matches("^[a-zA-Z]+$")) {
                isCorrect = false;
            }
        } while (isCorrect);
        return continue_stop;
    }

    public static int number() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("How many do you want to order?");
            while (!sc.hasNextInt()) {
                System.out.println("Enter integer!");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);
        return number;
    }
}

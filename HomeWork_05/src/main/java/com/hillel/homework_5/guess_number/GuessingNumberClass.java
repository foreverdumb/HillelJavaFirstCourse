package com.hillel.homework_5.guess_number;

import java.util.Scanner;

public class GuessingNumberClass {
    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        int i;
        int counter = 3;
        int methodResult = getTheNumber();
        System.out.println(methodResult + " " + "You didn't have to see this...");

        outer:
        for (i = 0; i < 3; i++, counter--) {
            do {
                System.out.println("Please, guess the number between 0 to 10, you have:"
                        + " " + counter + " " + "tries!");
                while (!sc.hasNextInt()) {
                    System.out.println("Please, enter integer");
                    sc.next();
                }
                number = sc.nextInt();
                if (number != methodResult) {
                    System.out.println("Try more!");
                } else {
                    System.out.println("Yeeeeeeeeeees, you won 1000000$");
                    break outer;
                }
            } while (number < 0 || number > 10);
        }
    }

    private static int getTheNumber() {
        return (int) (Math.random() * 10);
    }
}

package com.hillel.homework_7.lottery;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryClass {
    public static void guessNumbers() {
        Scanner sc = new Scanner(System.in);
        int[] array0 = new int[7];
        int[] array1 = new int[7];
        int counterAr1 = 0;
        for (int i = 0; i < array0.length; i++) {
            array0[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(array0);
        System.out.println("Try to guess 7 numbers!");
        for (int i = 0; i < array1.length; i++) {
            do {
                System.out.println("The " + counterAr1++ + " number is equal: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Enter integer!");
                    sc.next();
                }
                array1[i] = sc.nextInt();
            } while (array1[i] <= 0);
        }
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array0) + " - system's array");
        System.out.println(Arrays.toString(array1) + " - user's array");
        int result = findSimilarElements(array0, array1);
        System.out.println("Amount of numbers that were guessed: " + result);
    }

    private static int findSimilarElements(int[] array0, int[] array1) {
        int counter = 0;
        for (int i = 0; i < 7; i++) {
            if (array0[i] == array1[i]) {
                counter++;
            }
        }
        return counter;
    }
}

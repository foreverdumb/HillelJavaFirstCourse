package com.hillel.homework_8.utils;

import java.util.Scanner;

public class TranspositionOfMatrixUtilClass {
    private static int rand() {
        return (int) (Math.random() * 100);
    }

    private static int[][] init() {
        Scanner sc = new Scanner(System.in);
        int n0, n1;
        do {
            System.out.println("Please, enter an amount of matrix rows and cols: ");
            while (!sc.hasNextInt()) {
                System.out.println("Integer is required!");
                sc.next();
            }
            n0 = sc.nextInt();
            n1 = sc.nextInt();
        } while (n0 <= 0 || n1 <= 0);
        int[][] init = new int[n0][n1];
        for (int i = 0; i < n0; i++) {
            for (int j = 0; j < n1; j++) {
                init[i][j] = rand();
            }
        }
        return init;
    }

    public static void transpose() {
        int[][] array = init();
        int[][] arrayC = new int[array[0].length][array.length];
        System.out.println("Origin matrix: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayC[j][i] = array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transposed matrix: ");
        for (int[] ints : arrayC) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
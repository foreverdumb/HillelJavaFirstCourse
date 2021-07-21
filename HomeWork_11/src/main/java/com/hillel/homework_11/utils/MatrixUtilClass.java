package com.hillel.homework_11.utils;

public class MatrixUtilClass {
    public static int isMatrixSquare(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                if (array.length == ints.length) {
                    System.out.println("Matrix is square, code 5");
                    return 0;
                }
            }
        }
        System.out.println("Matrix is not square, code 0");
        return 1;
    }
}

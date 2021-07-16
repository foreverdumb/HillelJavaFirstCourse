package com.hillel.homework_9.pyramid;

public class PyramidClass {
    public static void printPyramid(int value) {
        int[] array = new int[value];
        for (int row = array.length; row > 0; row--) {
            array[row - 1] = row;
            for (int j : array) {
                if (j != 0) {
                    System.out.print(0);
                } else {
                    System.out.print(' ');
                }
            }
            for (int i = array.length - 2; i >= row - 1; i--) {
                if (array[i] != 0) {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}

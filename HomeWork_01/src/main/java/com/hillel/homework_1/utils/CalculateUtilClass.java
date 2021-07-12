package com.hillel.homework_1.utils;

public class CalculateUtilClass {
    public static int calculateVolume(int width, int length, int height) {
        return width * length * height;
    }

    public static int calculateLength(int width, int length, int height) {
        int multiplicationBy = 4;
        return multiplicationBy * (width + length + height);
    }
}

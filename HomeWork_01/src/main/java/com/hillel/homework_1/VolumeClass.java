package com.hillel.homework_1;

import com.hillel.homework_1.utils.CalculateUtilClass;
import com.hillel.homework_1.utils.ScannerUtilClass;

public class VolumeClass {
    public static void main(String[] args) {
        int[] optionsArr = {1, 2, 3, 4};
        int counter = 0;
        int option;
        int width = 0;
        int length = 0;
        int height = 0;
        int result;

        do {
            counter++;
            System.out.println("""
                    1 - Calculate volume;
                    2 - Calculate length;
                    3 - Where am I;
                    4 - Exit.
                    """);
            option = ScannerUtilClass.setOption();

            for (int i = 0; i < optionsArr.length; i++) {
                if (option != optionsArr[counter - 1]) {
                    System.out.println("Correct way to use programme is to choose options " +
                            "in an appropriate way: 1, 2, 3, 4");
                    System.exit(1);
                }
            }

            switch (option) {
                case 1 -> {
                    width = ScannerUtilClass.setAttribute();
                    length = ScannerUtilClass.setAttribute();
                    height = ScannerUtilClass.setAttribute();
                    result = CalculateUtilClass.calculateVolume(width, length, height);
                    System.out.println("The volume equals: " + result);
                    System.out.println("----------------------------");
                }
                case 2 -> {
                    result = CalculateUtilClass.calculateLength(width, length, height);
                    System.out.println("The length equals: " + result);
                    System.out.println("----------------------------");
                }
                case 3 -> {
                    float latitude = 46.4775F;
                    float longitude = 30.7326F;
                    System.out.println("The latitude is: " + latitude + "\n"
                            + "The longitude is: " + longitude + "\n"
                            + "My location is Odessa, Ukraine");
                    System.out.println("----------------------------");
                }
                case 4 -> System.out.println("Bye");
            }
        } while (option != 4);
    }
}

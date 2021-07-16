package com.hillel.homework_9.service;

import com.hillel.homework_9.burger.util.BurgerUtilClass;
import com.hillel.homework_9.pyramid.PyramidClass;

import java.util.Scanner;

public class BPServiceClass {
    public static void selectTask() {
        int option;
        do {
            option = setOption();
            switch (option) {
                case 1 -> BurgerUtilClass.cookDefaultBurger();
                case 2 -> BurgerUtilClass.cookDietaryBurger();
                case 3 -> BurgerUtilClass.cookDoubleBurger();
                case 4 -> PyramidClass.printPyramid(10);
                case 5 -> System.out.println("Bye");
            }
        } while (option != 5);
    }

    private static int setOption() {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("""
                    Please, select your option:
                    1 - Cook default burger;
                    2 - Cook dietary burger;
                    3 - Cook double burger;
                    4 - Print pyramid;
                    5 - Exit.
                    """);
            while (!sc.hasNextInt()) {
                System.out.println("Integer required!");
                sc.next();
            }
            option = sc.nextInt();
        } while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5);
        return option;
    }
}

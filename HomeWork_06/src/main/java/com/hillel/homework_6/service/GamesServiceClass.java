package com.hillel.homework_6.service;

import com.hillel.homework_6.basketball.BasketballClass;
import com.hillel.homework_6.rugby.RugbyClass;

import java.util.Scanner;

public class GamesServiceClass {
    public static void selectTask() {
        int option;
        do {
            option = setOption();
            switch (option) {
                case 1 -> RugbyClass.showAverageAge();
                case 2 -> BasketballClass.showBasketballPoints();
                case 3 -> System.out.println("Bye");
            }
        } while (option != 3);
    }

    private static int setOption() {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("""
                    Please, select your option:
                    1 - Show average age;
                    2 - Show basketball points;
                    3 - Exit;
                    """);
            while (!sc.hasNextInt()) {
                System.out.println("Integer required!");
                sc.next();
            }
            option = sc.nextInt();
        } while (option != 1 && option != 2 && option != 3);
        return option;
    }
}

package com.hillel.homework_7.service;

import com.hillel.homework_7.first_and_second.FirstAndSecondClass;
import com.hillel.homework_7.lottery.LotteryClass;

import java.util.Scanner;

public class HomeTaskServiceClass {
    public static void selectTask() {
        int option;
        do {
            option = setOption();
            switch (option) {
                case 1 -> LotteryClass.guessNumbers();
                case 2 -> FirstAndSecondClass.replaceElements();
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
                    1 - Guess numbers;
                    2 - Replace elements;
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

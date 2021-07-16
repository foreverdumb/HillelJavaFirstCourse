package com.hillel.homework_5.service;

import com.hillel.homework_5.fibonacci.FibonacciRowClass;
import com.hillel.homework_5.guess_number.GuessingNumberClass;
import com.hillel.homework_5.lucky_numbers.LuckyNumbersClass;

import java.util.Scanner;

public class HomeTaskServiceClass {
    public static void selectTask() {
        int option;
        do {
            option = setOption();
            switch (option) {
                case 1 -> FibonacciRowClass.calculateFibonacci();
                case 2 -> LuckyNumbersClass.showLuckyShips();
                case 3 -> GuessingNumberClass.guessNumber();
            }
        } while (option != 4);
    }

    private static int setOption() {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("""
                    Please, select your option:
                    1 - Calculate Fibonacci row;
                    2 - Count lucky ships;
                    3 - Guess the number;
                    4 - Exit.
                    """);
            while (!sc.hasNextInt()) {
                System.out.println("Integer required!");
                sc.next();
            }
            option = sc.nextInt();
        } while (option != 1 && option != 2 && option != 3 && option != 4);
        return option;
    }
}

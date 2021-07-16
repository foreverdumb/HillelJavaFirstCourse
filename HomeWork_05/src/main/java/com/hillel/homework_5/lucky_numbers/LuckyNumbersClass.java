package com.hillel.homework_5.lucky_numbers;

public class LuckyNumbersClass {
    public static void showLuckyShips() {
        int count = 0, ship_name = 0;
        while (count < 100) {
            String ship_s = String.valueOf(++ship_name);
            if ((ship_s.contains("4") || ship_s.contains("9"))) continue;
            System.out.println(ship_s);
            count++;
        }
        System.out.println("Total ships: " + count);
    }
}

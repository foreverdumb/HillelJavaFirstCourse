package com.hillel.homework_12.service;

import com.hillel.homework_12.DrinksEnum;
import com.hillel.homework_12.utils.DrinksUtilClass;
import com.hillel.homework_12.utils.ScannerUtilClass;

public class OrderServiceClass {
    public static void chooseOrder() throws InterruptedException {
        String result_1;
        int result_2;
        do {
            System.out.println("Welcome to the 2 seconds cafe! We will do any order for 2 seconds!");
            System.out.println(java.util.Arrays.asList(DrinksEnum.values()));
            String result_0 = ScannerUtilClass.getDrinkName().toUpperCase();
            DrinksEnum drink_0 = DrinksEnum.valueOf(result_0);
            switch (drink_0) {
                case AMERICANO:
                    result_2 = ScannerUtilClass.number();
                    for (int i = 0; i < result_2; i++) {
                        DrinksUtilClass.americano();
                    }
                    break;
                case COCACOLA:
                    result_2 = ScannerUtilClass.number();
                    for (int i = 0; i < result_2; i++) {
                        DrinksUtilClass.coca_cola();
                    }
                    break;
                case TEA:
                    result_2 = ScannerUtilClass.number();
                    for (int i = 0; i < result_2; i++) {
                        DrinksUtilClass.tea();
                    }
                    break;
                case SODA:
                    result_2 = ScannerUtilClass.number();
                    for (int i = 0; i < result_2; i++) {
                        DrinksUtilClass.soda();
                    }
                    break;
                case MOJITO:
                    result_2 = ScannerUtilClass.number();
                    for (int i = 0; i < result_2; i++) {
                        DrinksUtilClass.mojito();
                    }
                    break;
                case LEMONADE:
                    result_2 = ScannerUtilClass.number();
                    for (int i = 0; i < result_2; i++) {
                        DrinksUtilClass.lemonade();
                    }
                    break;
            }
            result_1 = ScannerUtilClass.isContinue();
        } while ((result_1.equals("Yes")));
        DrinksUtilClass.totalOrder();
    }
}

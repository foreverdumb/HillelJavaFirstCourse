package com.hillel.homework_12.utils;

import com.hillel.homework_12.DrinksEnum;

public class DrinksUtilClass {
    static int counter0 = (int) 0.0;
    static int counter1 = (int) 0.0;
    static int counter2 = (int) 0.0;
    static int counter3 = (int) 0.0;
    static int counter4 = (int) 0.0;
    static int counter5 = (int) 0.0;
    static int counter_0 = 1;
    static int counter_1 = 1;
    static int counter_2 = 1;
    static int counter_3 = 1;
    static int counter_4 = 1;
    static int counter_5 = 1;
    static double v0;
    static double v1;
    static double v2;
    static double v3;
    static double v4;
    static double v5;
    public static final double americano = 4.50;
    public static final double tea = 2.30;
    public static final double lemonade = 3.40;
    public static final double mojito = 10;
    public static final double soda = 1.50;
    public static final double coca_cola = 1.99;

    public static void americano() throws InterruptedException {
        System.out.println("You ordered " + counter_0++ + " " + DrinksEnum.AMERICANO);
        Thread.sleep(2000);
        System.out.println("Your order is ready!");
        counter0++;
        v0 = counter0 * americano;
        System.out.println("Cost: " + v0);
    }

    public static void tea() throws InterruptedException {
        System.out.println("You ordered " + counter_1++ + " " + DrinksEnum.TEA);
        Thread.sleep(2000);
        System.out.println("Your order is ready!");
        counter1++;
        v1 = counter1 * tea;
        System.out.println("Cost: " + v1);
    }

    public static void lemonade() throws InterruptedException {
        System.out.println("You ordered " + counter_2++ + " " + DrinksEnum.LEMONADE);
        Thread.sleep(2000);
        System.out.println("Your order is ready!");
        counter2++;
        v2 = counter2 * lemonade;
        System.out.println("Cost: " + v2);
    }

    public static void mojito() throws InterruptedException {
        System.out.println("You ordered " + counter_3++ + " " + DrinksEnum.MOJITO);
        Thread.sleep(2000);
        System.out.println("Your order is ready!");
        counter3++;
        v3 = counter3 * mojito;
        System.out.println("Cost: " + v3);
    }

    public static void soda() throws InterruptedException {
        System.out.println("You ordered " + counter_4++ + " " + DrinksEnum.SODA);
        Thread.sleep(2000);
        System.out.println("Your order is ready!");
        counter4++;
        v4 = counter4 * soda;
        System.out.println("Cost: " + v4);
    }

    public static void coca_cola() throws InterruptedException {
        System.out.println("You ordered " + counter_5++ + " " + DrinksEnum.COCACOLA);
        Thread.sleep(2000);
        System.out.println("Your order is ready!");
        counter5++;
        v5 = counter5 * coca_cola;
        System.out.println("Cost: " + v5);
    }

    public static double totalResult() {
        return v0 + v1 + v2 + v3 + v4 + v5;
    }

    public static void totalOrder() {
        System.out.println("Your order is: " + counter0 + " " + DrinksEnum.AMERICANO + " price: " + v0 + "\n"
                + "Your order is: " + counter1 + " " + DrinksEnum.TEA + " price: " + v1 + "\n"
                + "Your order is: " + counter2 + " " + DrinksEnum.LEMONADE + " price: " + v2 + "\n"
                + "Your order is: " + counter3 + " " + DrinksEnum.MOJITO + " price: " + v3 + "\n"
                + "Your order is: " + counter4 + " " + DrinksEnum.SODA + " price: " + v4 + "\n"
                +"Your order is: " + counter5 + " " + DrinksEnum.COCACOLA + " price: " + v5 + "\n"
                + "With total price: " + totalResult());
    }
}

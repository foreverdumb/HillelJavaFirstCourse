package com.hillel.homework_2.utils;

public class MinArmyUtilClass {
    public static void showMinAttack() {
        double biggerThenLiArmyIn = 1.5D;
        double quantityOfEachType = 860.0D;
        final double finalQuantityOfEachType = quantityOfEachType * biggerThenLiArmyIn;
        int minWarrior = 9;
        int minArcher = 35;
        int minHorseman = 12;
        double minTotalAttack = ((finalQuantityOfEachType * minWarrior) +
                (finalQuantityOfEachType * minArcher) + (finalQuantityOfEachType * minHorseman));
        int result = (int) minTotalAttack;
        System.out.println("Total attack of Min army is: " + result);
    }
}

package com.hillel.homework_2.utils;

public class MinArmyUtilClass {
    public static void showMinAttack() {
        double biggerThenLiArmyIn = 1.5D;
        double quantityOfEachType = 860.0D;
        final double finalQuantityOfEachType = quantityOfEachType * biggerThenLiArmyIn;
        int minWarriorAttack = 9;
        int minArcherAttack = 35;
        int minHorsemanAttack = 12;
        double minTotalAttack = ((finalQuantityOfEachType * minWarriorAttack) +
                (finalQuantityOfEachType * minArcherAttack) + (finalQuantityOfEachType * minHorsemanAttack));
        int result = (int) minTotalAttack;
        System.out.println("Total attack of Min army is: " + result);
    }
}

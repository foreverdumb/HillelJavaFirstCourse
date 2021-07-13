package com.hillel.homework_2.utils;

public class LiArmyUtilClass {
    public static void showLiAttack() {
        final int quantityOfEachType = 860;
        int liWarriorAttack = 13;
        int liArcherAttack = 24;
        int liHorsemanAttack = 46;
        int liTotalAttack = ((quantityOfEachType * liWarriorAttack) + (quantityOfEachType * liArcherAttack) +
                (quantityOfEachType * liHorsemanAttack));
        System.out.println("Total attack of Li army is: " + liTotalAttack);
    }
}

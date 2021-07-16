package com.hillel.homework_9.burger.util;

import com.hillel.homework_9.burger.BurgerClass;

public class BurgerUtilClass {
    public static void cookDefaultBurger() {
        BurgerClass defaultBurger = new BurgerClass("bun", "meat", "cheese", "lettuce", "mayonnaise");

        System.out.println("Your order is: " + defaultBurger.getName0() + " which contains such ingredients as: "
                + defaultBurger.getIngredient0() + ", " + defaultBurger.getIngredient1() + ", "
                + defaultBurger.getIngredient2() + ", " + defaultBurger.getIngredient3() + ", "
                + defaultBurger.getIngredient4());
    }

    public static void cookDietaryBurger() {
        BurgerClass dietaryBurger = new BurgerClass("bun", "meat", "cheese", "lettuce");

        System.out.println("Your order is: " + dietaryBurger.getName1() + " which contains such ingredients as: "
                + dietaryBurger.getIngredient0() + ", " + dietaryBurger.getIngredient1() + ", "
                + dietaryBurger.getIngredient2() + ", " + dietaryBurger.getIngredient3());
    }

    public static void cookDoubleBurger() {
        BurgerClass doubleBurger = new BurgerClass("bun", "meat", "cheese", "meat", "lettuce",
                "mayonnaise");

        System.out.println("Your order is: " + doubleBurger.getName2() + " which contains such ingredients as: "
                + doubleBurger.getIngredient0() + ", " + doubleBurger.getIngredient1() + " with one more piece of" + " "
                + doubleBurger.getIngredient1_1() + ", " + doubleBurger.getIngredient2() + ", "
                + doubleBurger.getIngredient3() + ", " + doubleBurger.getIngredient4());
    }
}

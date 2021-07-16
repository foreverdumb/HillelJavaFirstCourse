package com.hillel.homework_9.burger;

public class BurgerClass {

    String name0 = "default burger";
    String name1 = "dietary burger";
    String name2 = "double burger";
    String ingredient0;
    String ingredient1;
    String ingredient1_1;
    String ingredient2;
    String ingredient3;
    String ingredient4;

    public BurgerClass(String in0, String in1, String in2, String in3, String in4) {
        this.ingredient0 = in0;
        this.ingredient1 = in1;
        this.ingredient2 = in2;
        this.ingredient3 = in3;
        this.ingredient4 = in4;
    }

    public BurgerClass(String in0, String in1, String in2, String in3) {
        this.ingredient0 = in0;
        this.ingredient1 = in1;
        this.ingredient2 = in2;
        this.ingredient3 = in3;
    }

    public BurgerClass(String in0, String in1, String in2, String in1_1, String in3, String in4) {
        this.ingredient0 = in0;
        this.ingredient1 = in1;
        this.ingredient2 = in2;
        this.ingredient1_1 = in1_1;
        this.ingredient3 = in3;
        this.ingredient4 = in4;
    }

    public String getName0() {
        return name0;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getIngredient0() {
        return ingredient0;
    }

    public String getIngredient1() {
        return ingredient1;
    }

    public String getIngredient1_1() {
        return ingredient1_1;
    }

    public String getIngredient2() {
        return ingredient2;
    }

    public String getIngredient3() {
        return ingredient3;
    }

    public String getIngredient4() {
        return ingredient4;
    }
}

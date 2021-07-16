package com.hillel.homework_6.rugby;

public class RugbyClass {
    public static void showAverageAge() {
        int[] rugby_team0 = new int[25];
        int[] rugby_team1 = new int[25];
        int counter = 0;
        double result0 = 0.0;
        double result1 = 0.0;
        double const0 = 12.0;
        double const1 = 13.0;
        int a_rand = 18;
        int b_rand = 40;

        System.out.println("TEAM#1");
        for (int i = 0; i < rugby_team0.length; i++, counter++) {
            rugby_team0[i] = a_rand + (int) (Math.random() * (b_rand - a_rand) + 1);
            result0 = result0 + rugby_team0[i] / const0;
            System.out.println("Member number: " + " " + counter + "  " + "Years: " + rugby_team0[i] + " ");
        }
        System.out.println("Average age is equal: " + result0);
        System.out.println();
        System.out.println("TEAM#2");

        for (int i = 0; i < rugby_team1.length; i++, counter++) {
            rugby_team1[i] = a_rand + (int) (Math.random() * (b_rand - a_rand) + 1);
            result1 = result1 + rugby_team1[i] / const1;
            System.out.println("Member number: " + counter + " " + "Years: " + rugby_team1[i] + " ");
        }
        System.out.println("Average age is equal: " + result1);
        System.out.println();
        System.out.println("--------------------------------");

        if (result0 > result1) {
            System.out.println("Average age of TEAM#1 is bigger!");
        } else if (result1 > result0) {
            System.out.println("Average age of TEAM#2 is bigger!");
        } else System.out.println("Average age is the same!");
    }
}

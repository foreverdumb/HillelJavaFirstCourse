package com.hillel.homework_6.basketball;

public class BasketballClass {
    public static void showBasketballPoints() {
        int i;
        int sum0 = 0;
        int sum1 = 0;
        int[] team_points = new int[10];

        System.out.println("The points of EACH PLAYER in the team are equal: ");
        for (i = 0; i < team_points.length; i++) {
            team_points[i] = (int) (Math.random() * 100);
            System.out.print(team_points[i] + " ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("The points of each MAIN player in the team");
        for (i = 0; i < team_points.length; i += 2) {
            System.out.print(team_points[i] + " ");
            sum0 = sum0 + team_points[i];
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("The total points of the MAIN players of the team are equal: ");
        System.out.print(sum0);
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("The points of each SPARE player in the team");
        for (i = 1; i < team_points.length; i += 2) {
            System.out.print(team_points[i] + " ");
            sum1 = sum1 + team_points[i];
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("The total points of the SPARE players of the team are equal: ");
        System.out.println(sum1);
        System.out.println("-----------------------------------------------------------");
        if (sum0 > sum1) {
            int result0 = sum0 - sum1;
            System.out.println("MAIN players got more points, breakaway equals: " + result0);
        } else if (sum1 > sum0) {
            int result1 = sum1 - sum0;
            System.out.println("SPARE players got more points, breakaway equals: " + result1);
        } else {
            System.out.println("The points are the same");
        }
    }
}

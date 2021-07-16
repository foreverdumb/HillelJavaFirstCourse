package com.hillel.homework_4.utils;

import java.util.Scanner;

public class FootballTeamsUtilClass {
    public static void showTeamPoints() {
        Scanner sc = new Scanner(System.in);
        int team;
        String team0;
        int points;
        int coefficient;
        int totalPoints;
        do {
            System.out.println("""
                    Please, enter a team-number between 1 to 10:\s
                     1 - Dinamo\s
                     2 - SC Abbeville\s
                     3 - Shahter
                     4 - Liverpool FC\s
                     5 - Paris Saint-Germain\s
                     6 - Manchester City\s
                     7 - Real Madrid
                     8 - Barcelona\s
                     9 - Atalanta\s
                     10 - Juventus""");
            while (!sc.hasNextInt()) {
                System.out.println("Please, input positive and integer number!");
                sc.next();
            }
            team = sc.nextInt();
        } while (team < 1 || team > 10);
        team0 = switch (team) {
            case 1 -> "Dinamo";
            case 2 -> "SC Abbeville";
            case 3 -> "Shahter";
            case 4 -> "Liverpool FC";
            case 5 -> "Paris Saint-Germain";
            case 6 -> "Manchester City";
            case 7 -> "Real Madrid";
            case 8 -> "Barcelona";
            case 9 -> "Atalanta";
            case 10 -> "Juventus";
            default -> "Unknown";
        };
        System.out.println("Your favourite team is: " + team0);

        do {
            System.out.println("Enter points between 0 to 200");
            while (!sc.hasNextInt()) {
                System.out.println("Please, input positive and integer number!");
                sc.next();
            }
            points = sc.nextInt();
        } while (points < 0 || points > 200);

        do {
            System.out.println("Enter coefficient between 1 to 10");
            while (!sc.hasNextInt()) {
                System.out.println("Please, input positive and integer number!");
                sc.next();
            }
            coefficient = sc.nextInt();
        } while (coefficient < 1 || coefficient > 10);
        totalPoints = coefficient * points;
        if (totalPoints < 1000) {
            System.out.println("The total points of the team " + team0 + " " + "is" + " " + totalPoints + " " +
                    "the team will take part in the Country Championship");
        } else if (totalPoints <= 1999) {
            System.out.println("The total points of the team " + team0 + " " + "is" + " " + totalPoints + " " +
                    "the team will take part in the Europe League");
        } else {
            System.out.println("The total points of the team " + team0 + " " + "is" + " " + totalPoints + " " +
                    "the team will take part in the League of Champions");
        }
    }
}

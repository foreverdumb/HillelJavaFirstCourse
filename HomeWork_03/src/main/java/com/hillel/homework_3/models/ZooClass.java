package com.hillel.homework_3.models;

public class ZooClass {
    static int bears = 64;
    static int giraffes = 128;
    static int elephants = 256;
    static int tigers = 512;
    static int parrots = 1024;
    static int raccoons = 2048;
    static double pBears = 0.5; //percent of populations' growth  per year
    static double pGiraffes = 0.7;
    static double pElephants = 0.4;
    static double pTigers = 0.3;
    static double pParrots = 1.2;
    static double pRaccoons = 0.25;

    private static int countAnimals(int b, int g, int e, int t, int p) {
        return b + g + e + t + p;
    }

    private static double countAnimalsNextYear(double p1, double p2, double p3, double p4, double p5, int b2, int g2,
                                               int e2, int t2, int pp2) {
        double const0 = 100.0;
        return ((b2 / const0) * p1 + b2) + ((g2 / const0) * p2 + g2) + ((e2 / const0) * p3 + e2) +
                ((t2 / const0) * p4 + t2) + ((pp2 / const0) * p5 + pp2);
    }

    private static double countAnimalsNextYear(double p1, double p2, double p3, double p4, double p5, double p6, int b2,
                                               int g2, int e2, int t2, int pp2, int r1) {
        double const0 = 100.0;
        return ((b2 / const0) * p1 + b2) + ((g2 / const0) * p2 + g2) + ((e2 / const0) * p3 + e2) +
                ((t2 / const0) * p4 + t2) + ((pp2 / const0) * p5 + pp2) + ((r1 / const0 * p6) + r1);
    }

    public static void printZooStatistics() {
        int countAnimals = countAnimals(bears, giraffes, elephants, tigers, parrots);
        System.out.println("The total number of animals in the zoo this year: " + countAnimals + "\n");

        double countAnimalsNextYear = countAnimalsNextYear(pBears, pGiraffes, pElephants, pTigers,
                pParrots, bears, giraffes, elephants, tigers, parrots);
        int intCountNextYear = (int) countAnimalsNextYear;
        System.out.println("The total number of animals in the zoo next year: " + intCountNextYear + "\n");

        double countAnimalsNextYearWithRaccoons = countAnimalsNextYear(pBears, pGiraffes, pElephants, pTigers,
                pParrots, pRaccoons, bears,
                giraffes, elephants, tigers, parrots, raccoons);
        int intCountNextYearWithRaccoons = (int) countAnimalsNextYearWithRaccoons;
        System.out.println("The total number of animals in the zoo next year with raccoons: "
                + intCountNextYearWithRaccoons + "\n");
    }
}

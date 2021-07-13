package com.hillel.homework_3;

import com.hillel.homework_3.models.ZooClass;
import com.hillel.homework_3.utils.AirplanesUtilClass;
import com.hillel.homework_3.utils.PersonUtilClass;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int option;
        do {
            System.out.println("""
                    1 - Show available planes;
                    2 - Show call info;
                    3 - Show zoo statistics;
                    4 - Exit.
                    """);
            option = setOption();
            switch (option) {
                case 1 -> AirplanesUtilClass.showPlanes();
                case 2 -> PersonUtilClass.printCallers();
                case 3 -> ZooClass.printZooStatistics();
                case 4 -> System.out.println("Bye!");
            }
        } while (option != 4);
    }

    public static int setOption() {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Please, enter your option: ");
            while (!sc.hasNextInt()) {
                System.out.println("Integer required!");
                sc.next();
            }
            option = sc.nextInt();
        } while (option != 1 && option != 2 && option != 3 && option != 4);
        return option;
    }
}

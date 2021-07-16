package com.hillel.homework_10.service;

import com.hillel.homework_10.models.UserClass;
import com.hillel.homework_10.utils.UserUtilClass;

public class UserServiceClass {
    public static void printUserInfoFromFitnessTracker() {
        UserClass user_0 = new UserClass("Boris", "Britva", "boris_britva@gmail.com",
                "+380000000000", 4, 5, 1985, 90.2, 17000, 138.3,
                78.4);
        UserUtilClass.calcAge(user_0);
        System.out.println(user_0);

        UserClass user_1 = new UserClass("Pavel", "Lomonosov", "pavel_lomonosov@gmail.com",
                "+380000000000", 7, 3, 1975, 84.4, 8000, 138.3,
                78.4);
        UserUtilClass.calcAge(user_1);
        System.out.println(user_1);

        UserClass user_2 = new UserClass("Petr", "Turgenev", "petr_turgenev@gmail.com",
                "+380000000000", 9, 2, 1998, 96.1, 30000, 138.3,
                78.4);
        UserUtilClass.calcAge(user_2);
        System.out.println(user_2);

        UserClass user_3 = new UserClass("Aleksandr", "Petrov", "aleks_petrov@gmail.com",
                "+380000000000", 1, 10, 2000, 75.9, 25000, 138.3,
                78.4);
        UserUtilClass.calcAge(user_3);
        System.out.println(user_3);

        UserClass user_4 = new UserClass("Maria", "Lebedeva", "maria_lebedeva@gmail.com",
                "+380000000000", 25, 6, 2005, 50.3, 10000, 138.3,
                78.4);
        UserUtilClass.calcAge(user_4);
        System.out.println(user_4);

        System.out.println("Edited user number 1: ");
        user_0.setSurname("Yaplakal");
        user_0.setSteps(35000);
        user_0.setTop_pressure(130.7);
        user_0.setBottom_pressure(45.8);
        user_0.setWeight(91.8);
        System.out.println(user_0);

        System.out.println("Edited user number 2: ");
        user_1.setSurname("Chernyshevsky");
        user_1.setSteps(20000);
        user_1.setTop_pressure(140.7);
        user_1.setBottom_pressure(60.8);
        user_1.setWeight(89.8);
        System.out.println(user_1);
    }
}

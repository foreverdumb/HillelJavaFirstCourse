package com.hillel.homework_10.utils;

import com.hillel.homework_10.models.UserClass;

public class UserUtilClass {
    public static void calcAge(UserClass user) {
        int curr_year = 2021;
        int user_year;
        user_year = curr_year - user.getYear();
        user.setAge(user_year);
    }
}

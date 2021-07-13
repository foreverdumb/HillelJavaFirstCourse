package com.hillel.homework_3.utils;

import com.hillel.homework_3.models.persons.CallerClass;

import java.util.ArrayList;

public class PersonUtilClass {
    private static ArrayList<CallerClass> createCaller() {
        CallerClass caller = new CallerClass("Bob", "Johnson",
                "London", "+0000000000");
        CallerClass caller_2 = new CallerClass("Helen", "Smith",
                "Warsaw", "+0000000001");
        CallerClass caller_3 = new CallerClass("Victoria", "Robertson",
                "Amsterdam", "+0000000002");
        ArrayList<CallerClass> callers = new ArrayList<>();
        callers.add(caller);
        callers.add(caller_2);
        callers.add(caller_3);
        return callers;
    }

    public static void printCallers() {
        ArrayList<CallerClass> callers = createCaller();
        String[] print = callers.toString().split("},");
        for (String s : print) {
            if (s.startsWith("[")) {
                s = s.replace("[", " ");
            }
            if (s.endsWith("]")) {
                s = s.replace("]", "");
            }
            System.out.println(s + "\n");
        }
    }
}

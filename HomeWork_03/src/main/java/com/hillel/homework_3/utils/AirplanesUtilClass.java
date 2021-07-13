package com.hillel.homework_3.utils;

import com.hillel.homework_3.models.airplanes.EconomyBusinessAirplaneClass;
import com.hillel.homework_3.models.airplanes.EconomyClassAirplane;
import com.hillel.homework_3.models.airplanes.FighterAirplaneClass;

public class AirplanesUtilClass {

    private static void showFighterPlane() {
        FighterAirplaneClass fighterPlane = new FighterAirplaneClass("F-15C Eagle", "Jet",
                30);
        System.out.println(fighterPlane + "\n");
    }

    private static void showEconomyPlane() {
        EconomyClassAirplane economyPlane = new EconomyClassAirplane("Aerobus 737", "Airliner",
                40);
        System.out.println(economyPlane + "\n");
    }

    private static void showEconomyBusinessPlane() {
        EconomyBusinessAirplaneClass e_b_plane = new EconomyBusinessAirplaneClass("Boeing 777", "Airliner",
                120, 30);
        System.out.println(e_b_plane + "\n");
    }

    public static void showPlanes() {
        showFighterPlane();
        showEconomyPlane();
        showEconomyBusinessPlane();
    }
}

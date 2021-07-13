package com.hillel.homework_3.models.airplanes;

import com.hillel.homework_3.abstract_model.AirplaneClass;

public class EconomyClassAirplane extends AirplaneClass {
    private final int numberOfPassengers;

    public EconomyClassAirplane(String modelName, String airplaneType, int numberOfPassengers) {
        super(modelName, airplaneType);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "EconomyClassAirplane{" +
                "numberOfPassengers=" + numberOfPassengers +
                ", modelName=" + getModelName() +
                ", planeType=" + getAirplaneType() +
                '}';
    }
}

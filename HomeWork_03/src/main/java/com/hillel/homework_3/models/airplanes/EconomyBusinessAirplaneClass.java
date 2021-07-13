package com.hillel.homework_3.models.airplanes;

import com.hillel.homework_3.abstract_model.AirplaneClass;

public class EconomyBusinessAirplaneClass extends AirplaneClass {
    private final int numberOfEconomyPassengers;
    private final int numberOfBusinessPassengers;

    public EconomyBusinessAirplaneClass(String modelName, String airplaneType,
                                        int numberOfPassengers, int numberOfBusinessPassengers) {
        super(modelName, airplaneType);
        this.numberOfEconomyPassengers = numberOfPassengers;
        this.numberOfBusinessPassengers = numberOfBusinessPassengers;
    }

    @Override
    public String toString() {
        return "EconomyBusinessAirplane{" +
                "numberOfEconomyPassengers=" + numberOfEconomyPassengers +
                ", numberOfBusinessPassengers=" + numberOfBusinessPassengers +
                ", modelName=" + getModelName() +
                ", planeType=" + getAirplaneType() +
                '}';
    }
}

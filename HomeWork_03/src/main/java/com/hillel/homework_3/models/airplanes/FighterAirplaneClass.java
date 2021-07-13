package com.hillel.homework_3.models.airplanes;

import com.hillel.homework_3.abstract_model.AirplaneClass;

public class FighterAirplaneClass extends AirplaneClass {
    private final int quantityOfBombs;

    public FighterAirplaneClass(String modelName, String airplaneType, int quantityOfBombs) {
        super(modelName, airplaneType);
        this.quantityOfBombs = quantityOfBombs;
    }

    @Override
    public String toString() {
        return "FighterAirplaneClass{" +
                "quantityOfBombs=" + quantityOfBombs +
                ", modelName=" + getModelName() +
                ", planeType=" + getAirplaneType() +
                '}';
    }
}

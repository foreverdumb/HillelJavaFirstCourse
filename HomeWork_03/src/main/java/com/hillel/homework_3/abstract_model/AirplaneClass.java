package com.hillel.homework_3.abstract_model;

public abstract class AirplaneClass {
    String modelName;
    String airplaneType;

    public AirplaneClass(String modelName, String airplaneType) {
        this.modelName = modelName;
        this.airplaneType = airplaneType;
    }

    public String getModelName() {
        return modelName;
    }

    public String getAirplaneType() {
        return airplaneType;
    }
}

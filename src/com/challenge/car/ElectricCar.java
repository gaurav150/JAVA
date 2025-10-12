package com.challenge.car;

public class ElectricCar extends ChallengeCar {
    private final double avgKmPerLitre;
    private final int batterySize;

    public ElectricCar(String description, double avgKmPerLitre, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }
}

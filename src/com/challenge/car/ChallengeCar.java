package com.challenge.car;


public class ChallengeCar {
    private final String description;

    public ChallengeCar(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> Engine started.");
    }

    protected void runEngine() {
        System.out.println("Car -> Engine is now running.");
    }

    public void drive() {
        System.out.println("Car -> Car is driving. Type: " + getClass().getSimpleName());
        runEngine();
    }
}

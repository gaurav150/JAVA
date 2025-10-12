package com.challenge.car;


public class ChallengeMain {

    public static void main(String[] args) {
        ChallengeCar car = new ChallengeCar("2022 Blue Ferrari 296 Gts");
        runRace(car);

        ChallengeCar Ferrari = new GasPoweredCar("2022 Blue Ferrari 296 Gts",
                15.4, 6);
        runRace(Ferrari);

    }

    public static void runRace(ChallengeCar car) {
        car.startEngine();
        car.drive();
    }
}

package com.challenge.interfaces;

import java.util.LinkedList;
import java.util.List;

public class MainInterFaces {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;
        animal.move();
        flier.fly();
        tracked.track();
        flier.land();
        flier.takeOff();
        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();
        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("the truck  traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);
        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);
        System.out.println("+".repeat(30));
        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);
        System.out.println("_".repeat(30));
        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);

    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.takeOff();

        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.fly();

        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.land();

        }
    }
}

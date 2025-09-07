package com.challenge.interfaces;

public class Bird extends Animal implements Trackable, FlightEnabled {
    @Override
    public void move() {
        System.out.println("Flaps wings.");
    }

    @Override
    public void track() {
        System.out.println(getClass().getName() + "'s coordinates recorded.");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getName() + " is taking Off.");
    }

    @Override
    public void land() {
        System.out.println(getClass().getName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getName() + " is flying.");

    }


}

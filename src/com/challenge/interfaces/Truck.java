package com.challenge.interfaces;

public class Truck implements Trackable {
    @Override
    public void track() {
        System.out.println(getClass().getName() + "'s coordinates recorded.");
    }

}

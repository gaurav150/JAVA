package com.challenge;

public class Song {
    // write code here

    private final String title;
    private final double duration;


    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }

}

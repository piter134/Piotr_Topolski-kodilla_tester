package com.kodilla.inheritance;

public class OperatingSystem {
    private int releaseDate;

    public OperatingSystem(int releaseDate) {
        this.releaseDate= releaseDate;
    }

    public void turnOn() {
        System.out.println("turn on system");
    }

    public void turnOff() {
        System.out.println("turn off system");
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void printReleaseDate() {
        System.out.println("release date: " + releaseDate);
    }

}
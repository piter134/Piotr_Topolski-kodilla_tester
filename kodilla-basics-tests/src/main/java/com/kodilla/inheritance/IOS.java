package com.kodilla.inheritance;

public class IOS extends OperatingSystem {

    public IOS(int releaseDate) {
        super(releaseDate);
    }

    public void turnOn() {
        System.out.println("turn on IOS");
    }

    public void turnOff() {
        System.out.println("turn on IOS");

    }

    public void printReleaseDate() {
        System.out.println("release IOS: " + getReleaseDate());

    }
}

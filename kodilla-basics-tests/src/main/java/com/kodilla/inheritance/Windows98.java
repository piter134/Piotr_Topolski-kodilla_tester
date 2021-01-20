package com.kodilla.inheritance;

public class Windows98 extends OperatingSystem {

    public Windows98(int releaseDate) {
        super(releaseDate);
    }

    public void turnOn() {
        System.out.println("turn on Windows98");
    }

    public void turnOff() {
        System.out.println("turn off Windows98");
    }

    public void printReleaseDate() {
        System.out.println("release Windows98: " + getReleaseDate());
    }
}

package com.kodilla.abstracts.homework.cwiczenie1.cwiczenie2;

public abstract class Aquarium {
    private double length;
    private double depth;
    private double height;

    public Aquarium(double length, double depth, double height) {
        this.length = length;
        this.depth = depth;
        this.height = height;
    }

    public void AquariumCapacity() {
        System.out.println("Aquarium capacity is " + length * depth * height / 1000 + " liters");

    }
}

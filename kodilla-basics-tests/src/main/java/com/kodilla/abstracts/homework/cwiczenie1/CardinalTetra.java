package com.kodilla.abstracts.homework.cwiczenie1;

public class CardinalTetra extends Tetra {

    private String color;
    private double centimeters;
    private int liters;

    public CardinalTetra(String color, double centimeters, int liters) {
        this.color = color;
        this.centimeters = centimeters;
        this.liters = liters;
    }

    @Override
    public void characteristic() {
        System.out.println("This fish is " + color + " color");
    }

    @Override
    public void size() {
        System.out.println("This fish is " + centimeters + " cm long");
    }

    @Override
    public void aquariumSize() {
        System.out.println("This fish need at least " + liters + " liters aquarium");
    }
}

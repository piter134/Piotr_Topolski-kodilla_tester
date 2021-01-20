package com.kodilla.abstracts.homework.cwiczenie3;

public class Fish {
    private String bodyColor;
    private String finsColor;
    private Occurrence occurrence;

    public Fish(String bodyColor, String finsColor, Occurrence occurrence) {
        this.bodyColor = bodyColor;
        this.finsColor = finsColor;
        this.occurrence = occurrence;
    }
    public void showEnvironment() {
        System.out.println(occurrence.getEnvironment());
    }
}
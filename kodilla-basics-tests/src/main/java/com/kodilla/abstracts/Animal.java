package com.kodilla.abstracts;

public abstract class Animal {
    private int numberOfLegs;

    public Animal(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }
    public void wyswietlLiczbeNog() {
        System.out.println("liczba nog wynosi: " + numberOfLegs);
    }
    public abstract void dajGlos();

}

package com.kodilla.abstracts.homework;

public class Trojkat extends Shape {
    private int podstawa;
    private int bok;
    private int bok2;
    private int wysokosc;


    public Trojkat(int bok, int bok2, int podstawa, int wysokosc) {
        this.podstawa = podstawa;
        this.bok = bok;
        this.bok2 = bok2;
        this.wysokosc = wysokosc;
    }

    @Override
    public void polePowierzchni() {
        System.out.println("pole powierzchni trojkata wynosi: " + (podstawa*wysokosc/2));
    }

    @Override
    public void obwod() {
        System.out.println("obwod trojkata wynosi: " + (podstawa+bok+bok2));
    }

}

package com.kodilla.abstracts.homework;

public class Prostokat extends Shape {
    private int bok;
    private int bok2;

    public Prostokat(int bok, int bok2) {
        this.bok = bok;
        this.bok2 = bok2;
    }

    @Override
    public void polePowierzchni() {
        System.out.println("pole powierzchni prostokata wynosi: " + bok*bok2);
    }

    @Override
    public void obwod() {
        System.out.println("obwod prostokata wynosi: " + (2*bok + 2*bok2));
    }

}

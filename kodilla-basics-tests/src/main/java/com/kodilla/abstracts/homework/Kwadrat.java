package com.kodilla.abstracts.homework;

public class Kwadrat extends Shape {
    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    @Override
    public void polePowierzchni() {
        System.out.println("pole powierzchni kwadratu wynosi: " + bok*bok);
    }

    @Override
    public void obwod() {
        System.out.println("obwod kwadratu wynosi: " + 4*bok);
    }

}

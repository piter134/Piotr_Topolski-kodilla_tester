package com.kodilla.abstracts;

public class Duck extends Animal {
    public Duck() {
        super(2);
    }
    @Override
    public void dajGlos() {
        System.out.println("quack");
    }
}

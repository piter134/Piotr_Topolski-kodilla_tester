package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private String tablica;
    private int acceleration = 50;
    private int speed = 0;
    private int maxSpeed = 180;

    public Ford(String tablica){
        this.tablica = tablica;
    }

    @Override
    public int getSpeed() {
        return this.speed;

    }

    @Override
    public void increaseSpeed() {
        if(this.speed + acceleration >= maxSpeed) {
            this.speed = maxSpeed;
        }else{
            this.speed = speed + acceleration;
        }
    }

    @Override
    public void decreaseSpeed() {
        if(this.speed - 50 <= 0) {
            this.speed = 0;
        }else{
            this.speed = speed - 50;
        }
    }
}

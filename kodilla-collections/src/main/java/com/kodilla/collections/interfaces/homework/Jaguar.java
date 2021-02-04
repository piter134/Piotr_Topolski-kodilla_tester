package com.kodilla.collections.interfaces.homework;

public class Jaguar implements Car{
    private int acceleration = 120;
    private int speed = 0;
    private int maxSpeed = 300;
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
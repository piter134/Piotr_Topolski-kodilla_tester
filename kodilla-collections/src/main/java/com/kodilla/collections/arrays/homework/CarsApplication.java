package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Jaguar;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
            int randomAccelerationTimes = random.nextInt(10) + 1;
            for (int n = 0; n < randomAccelerationTimes; n++){
                cars[i].increaseSpeed();
            }
        }
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarBrand = random.nextInt(3);
        if (drawCarBrand == 0)
            return new Ford();
        else if (drawCarBrand == 1)
            return new Jaguar();
        else
            return new Opel();
    }
}

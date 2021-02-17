package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Jaguar;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car kind: " + getCar(car));
        System.out.println("Speed : " + car.getSpeed());


    }

    private static String getCar(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Jaguar)
            return "Jaguar";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car name";
    }
}

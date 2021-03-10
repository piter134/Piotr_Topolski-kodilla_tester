package com.kodilla.collections.lists.homework;
import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Jaguar;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford("WZ12341"));
        cars.add(new Ford("WR23423"));
        cars.add(new Jaguar());
        cars.add(new Jaguar());
        Opel opel = new Opel();
        cars.add(opel);

        cars.remove(1);
        cars.remove(opel);

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}

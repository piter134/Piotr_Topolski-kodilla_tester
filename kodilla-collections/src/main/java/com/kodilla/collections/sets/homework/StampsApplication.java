package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Medium Stamp", "2cm x 1cm", "Yes"));
        stamps.add(new Stamp("Small Stamp", "1.5cm x 1.5cm", "Yes"));
        stamps.add(new Stamp("Large Stamp", "2.5cm x 1.5cm", "No"));
        stamps.add(new Stamp("Extra Large Stamp", "3cm x 3cm", "Yes"));
        stamps.add(new Stamp("Extra Large Stamp", "3cm x 3cm", "Yes"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);

        }
    }
}

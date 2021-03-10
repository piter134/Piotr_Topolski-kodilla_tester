package com.kodilla.collections.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();
        School one = new School("Szkola Podstawowa nr.1", 25,21,23,26,28);
        School two = new School("Szkoła Podstawowa nr.7",21,24,24,29,21);
        School three = new School("Szkoła Podstawowa nr.10",23,21,23,30,21);

        Principal principalOne = new Principal("Jan Nowak");
        Principal principalTwo = new Principal("Janusz Kowalski");
        Principal principalThree = new Principal("Marcin Wiśniewski");

        schools.put(principalOne,one);
        schools.put(principalTwo,three);
        schools.put(principalThree,two);

        for (Map.Entry<Principal, School> school : schools.entrySet())
            System.out.println(school.getKey() + ", sum: " +
                    school.getValue().getSum() + " " + school.getValue());

    }
}

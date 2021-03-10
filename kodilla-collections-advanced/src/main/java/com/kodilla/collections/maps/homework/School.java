package com.kodilla.collections.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> schools = new ArrayList<>();
    private String schoolName;
    public School(String schoolName, int... school) {
        this.schoolName = schoolName;
        for (int schools : school)
            this.schools.add(schools);

    }

    public int getSum() {
        int sum = 0;
        for (int studentCount : schools)
            sum += studentCount;
        return sum;
    }

    @Override
    public String toString() {
        return schoolName;
    }
}

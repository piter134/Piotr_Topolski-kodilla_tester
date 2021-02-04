package com.kodilla.Cwiczenie;

public class FishAverage {
    private double [] average = {7.5, 2.5, 3.5, 5.5, 1,5, 4.5};

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < average.length; i++){
            sum = sum + average[i];
        }
        sum = sum / average.length;

        return sum;
    }
    public int getBigFishNumber() {
        int bigFishNumber = 0;
        for (int i = 0; i < average.length; i++) {
            if (average[i] > 4.5) {
                System.out.println(average[i]);
                System.out.println(average[i] > 4.5);
                bigFishNumber = bigFishNumber + 1;
            }
        }
        return bigFishNumber;
    }
}

package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 10;
        int c = 5;

        int wynikDodawania = calculator.addition(a,b);
        System.out.println(wynikDodawania);

        int wynikOdejmowania = calculator.subtraction(b,a);
        System.out.println(wynikOdejmowania);

        int wynikDoKwadratu = calculator.squared(c);
        System.out.println(wynikDoKwadratu);


        boolean correct = ResultChecker.assertEquals(15, wynikDodawania);
        System.out.println(correct);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correct1 = ResultChecker.assertEquals(5, wynikOdejmowania);
        if (correct1) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + b + " i " + a);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + b + " i " + a);
        }
        boolean correct2 = ResultChecker.assertEquals(25, wynikDoKwadratu);
        if (correct2) {
            System.out.println("Metoda potęgowania działa poprawnie dla liczby " + c );
        } else {
            System.out.println("Metoda potęgowania nie działa poprawnie dla liczby " + c);
        }


    }
}


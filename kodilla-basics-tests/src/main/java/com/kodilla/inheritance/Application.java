package com.kodilla.inheritance;

import com.kodilla.abstracts.Dog;
import com.kodilla.abstracts.Duck;
import com.kodilla.abstracts.homework.*;

public class Application {

    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(2022);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        Windows98 windows98 = new Windows98(1998);
        windows98.turnOn();
        windows98.turnOff();

        IOS ios = new IOS(2007);
        ios.turnOn();
        ios.turnOff();

        operatingSystem.printReleaseDate();
        ios.printReleaseDate();
        windows98.printReleaseDate();

        Dog dog = new Dog();
        dog.dajGlos();

        Duck duck = new Duck();
        duck.dajGlos();

        Kwadrat kwadrat = new Kwadrat(10);
        kwadrat.polePowierzchni();
        kwadrat.obwod();

        Prostokat prostokat = new Prostokat(10, 15);
        prostokat.polePowierzchni();
        prostokat.obwod();

        Trojkat trojkat = new Trojkat(10, 15, 10, 20);
        trojkat.polePowierzchni();
        trojkat.obwod();


        String[] obowiazkiJavaDevelopera = {"Kodowanie", "pisanie testów", "pisanie dokumentacji"};
        String[] obowiazkiCleanera = {"Konserwacha powierzchni płaskich"};
        String[] obowiazkiTeachera = {"Realizacja programu nauczania", "Wychowywanie uczniów"};

        Person mariusz = new Person("Mariusz", 28, new JavaDeveloper(20000,obowiazkiJavaDevelopera));
        mariusz.showResponsibilities();
        Person stanislawa = new Person("Stanislawa", 57, new Cleaner(1500,obowiazkiCleanera));
        stanislawa.showResponsibilities();
        Person danuta = new Person("Danuta", 46,new Teacher(3000,obowiazkiTeachera));
        danuta.showResponsibilities();
    }
}
package com.kodilla.abstracts.homework.cwiczenie1;

import com.kodilla.abstracts.homework.cwiczenie1.cwiczenie2.OneHundredEightyP;
import com.kodilla.abstracts.homework.cwiczenie1.cwiczenie2.OneHundredTwentyP;
import com.kodilla.abstracts.homework.cwiczenie1.cwiczenie2.SixtyP;
import com.kodilla.abstracts.homework.cwiczenie3.Fish;

public class Application {

    public static void main(String[] args) {
        BlackNeonTetra blackNeonTetra = new BlackNeonTetra("black", 4, 70);
        blackNeonTetra.aquariumSize();
        blackNeonTetra.characteristic();
        blackNeonTetra.size();

        CardinalTetra cardinalTetra = new CardinalTetra("glowing blue and red", 5, 70);
        cardinalTetra.aquariumSize();
        cardinalTetra.characteristic();
        cardinalTetra.size();

        OrnateTetra ornateTetra = new OrnateTetra("orange with white and black fin", 4.5, 54);
        ornateTetra.aquariumSize();
        ornateTetra.characteristic();
        ornateTetra.size();

        OneHundredEightyP oneHundredEightyP = new OneHundredEightyP(180, 60, 60);
        oneHundredEightyP.AquariumCapacity();

        SixtyP sixtyP = new SixtyP(60.8,30,36);
        sixtyP.AquariumCapacity();

        OneHundredTwentyP oneHundredTwentyP = new OneHundredTwentyP(120, 45,45);
        oneHundredTwentyP.AquariumCapacity();

        Fish rybka1 = new Fish("połyskujący niebieski oraz czerwony pasek","przeźroczyste", new com.kodilla.abstracts.homework.cwiczenie3.CardinalTetra("Ameryka Południowa", "Zamieszkuje gęsto porośnięte, wolno płynące rzeki oraz rozlewiska w dorzeczach Orinoko i Rio Negro w Wenezueli, Brazylii i Kolumbii"));
        rybka1.showEnvironment();
        Fish rybka2 = new Fish("szaro-zielone z czarnym i białym połyslkującym paskiem", "przeźroczyste", new com.kodilla.abstracts.homework.cwiczenie3.BlackNeonTetra("Ameryka Południowa","Zamieszkuje strumienie i rzeki oraz dorzecza Paragwaju oraz płaskowyż Mato Grosso"));
        rybka2.showEnvironment();
        Fish rybka3 = new Fish("pomarańczowy","czerwone z białą oraz czarną plamą na płetwie grzbietowej", new com.kodilla.abstracts.homework.cwiczenie3.OrnateTetra("Ameryka Południowa", "Gatunek zamieszkuje płytkie wody przybrzeżne na całym obszarze Amazonki"));
        rybka3.showEnvironment();
    }
}
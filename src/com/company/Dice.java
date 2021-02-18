package com.company;

import java.util.Random;

public class Dice {
    int previousRoll =  -1;
    int currentRoll;

    Dice(){

    }

    public int roll() {
        Random rand = new Random();
        int currentRoll = rand.nextInt(6);
        return currentRoll;
    }

}

package com.company;

import java.util.Random;

public class Coin {
    private static final int HEADS = 0;
    private static final int TAILS = 1;
    int faceUp;
    Coin() {
        faceUp = getFaceUp();
    }

    public int getFaceUp() {
        Random r = new Random();
        faceUp = r.nextInt(2);
        return faceUp;
    }
    public String getFaceUpStr() {
        if (faceUp == HEADS) return "HEADS";
        else if (faceUp == TAILS) return "TAILS";
        else return "INVALID";
    }
}

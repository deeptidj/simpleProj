package com.company;

public class Insect {
    int noOfLegs;
    boolean canFly;
    Insect(){
        System.out.println("Insect");
        noOfLegs = 4;
        canFly = true;
    }
    int getNoOfLegs(){
        return noOfLegs;
    }
    boolean getcanFly(){
        return canFly;
    }
}

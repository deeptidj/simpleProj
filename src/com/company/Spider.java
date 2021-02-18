package com.company;

public class Spider extends Insect{
    boolean poison,foundIndoors;
    Spider() {
        super();
        poison = true;
        noOfLegs = 8;
    }
    boolean foundIndoors() {
        return foundIndoors;
    }
}

package com.company;

import java.awt.*;

public class Car {
    String licensePlateNo;
    double avgMilesPerHour;
    Color paintColor;
    boolean tailLightsWorking;
    public Car(String licensePlateNo) {
        this.licensePlateNo = licensePlateNo;
    }
    public Car(String licensePlateNo, double avgMilesPerHour) {
        this.licensePlateNo = licensePlateNo;
        this.avgMilesPerHour = avgMilesPerHour;
    }
    public Car(String licensePlateNo, double avgMilesPerHour, Color paintColor) {
        this.licensePlateNo = licensePlateNo;
        this.avgMilesPerHour = avgMilesPerHour;
        this.paintColor = paintColor;
    }
    public int speedUpBy100(int currSpeed) {
        return currSpeed+=100;
    }
}

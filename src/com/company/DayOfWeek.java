package com.company;

import java.time.LocalDate;

public class DayOfWeek {
    public static void main(String[] args) {

        int year= 2018;
        int month = 11;
        int day = 15;

        LocalDate localDate = LocalDate.of(year, month, day);

        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);

    }
}

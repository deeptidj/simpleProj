package com.company;

public class ConsoleArgs {
    public static void main(String[] args) {
        System.out.println("Welcome!!");
        for (String s: args) {
            System.out.println(s);
        }
    }
}

package com.company;

public class Dog implements Pet{
    String name;
    String breed;
    boolean kidFriendly;
    int age;
    Dog() {

    }
    Dog(String name) {
        this.name = name;
    }
    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    Dog(String name, String breed, boolean kidFriendly) {
        this.name = name;
        this.breed = breed;
        this.kidFriendly = kidFriendly;
    }
    void bark() {
        System.out.println("Bark!!");
    }

    public void play() {
        System.out.println("Play...");
    }
}

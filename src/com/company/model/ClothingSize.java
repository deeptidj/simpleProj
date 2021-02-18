package com.company.model;

public enum ClothingSize {
    SMALL("Small"), MEDIUM("Medium"), LARGE("Large");
    private String desc;

    ClothingSize(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc;
    }
}

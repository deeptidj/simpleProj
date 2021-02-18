package com.company.model;

import java.text.NumberFormat;

public class Clothing {
    public static void main(String[] args) {
        double total;
        Shirt item = new Shirt(ClothingSize.LARGE,15.50,5);
        total = item.getPrice() * item.getQuantity();
        var form = NumberFormat.getCurrencyInstance();
        String output = String.format("Your order of %s size %s  will cost %s",item.getSize(),item.getType(),total);
        System.out.println(output);

        Hat hat = new Hat(ClothingSize.SMALL, 10, 2);

        total = hat.getPrice() * hat.getQuantity();
        System.out.println(" Hat costs "+ total);


    }
}

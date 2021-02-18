package com.company.ArraysAndStrings;

public class ProductOfArray {
    public static void main(String[] args) {
        System.out.println("Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].");
        int[] nums = new int[]{4,5,1,8,2,10,6};
        for (int i :
                nums) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println();
        int prod = 1;
        //int[] prods = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            prod = prod * nums[i];
            System.out.print(prod+" ");
        }
        System.out.println("Product: "+prod);

    }
}

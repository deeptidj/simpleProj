package com.company.ArraysAndStrings;

public class ArraysMoveZeroes {
    /*
    Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Example:

    Input: [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.
     */



    public static void main(String[] args) {
        //int[] arr = {0,1,0,3,12};
        int[] arr = {0,0,0,0,0};
        int count=0, j=0;
        for (int n:arr) {
            if(n==0) {
                count++;
            } else {
                arr[j] = n;
                j++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < count; i++) {
            arr[arr.length-1-i] = 0;
        }
        for (int k :arr) {
            System.out.print(k+" ");
        }
    }

}

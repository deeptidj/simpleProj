package com.company;

import java.util.Arrays;

public class sortedArrayWithDups {
    /*
    Find indices start and end for a particular value in a sorted integer array with duplicates
     */
    public static void main(String[] args) {
        int[] nums = {25,1,2,3,3,3,3,4,5};
        Arrays.sort(nums);
        for (int i :
                nums) {
            System.out.println(i);
        }
        int[] result = findStartEndInSortedArray(3,nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println();
        int[] nums1 = {1,1,1,1,1,2,3,4};
         result = findStartEndInSortedArray(1,nums1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println();
        int[] nums2 = {0,1,1,1,1,1};
         result = findStartEndInSortedArray(1,nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
    public static int[] findStartEndInSortedArray(int searchFor, int[] nums) {
        int[] ind = {-1,-1};

        for (int i = 0; i < nums.length; i++) {
             if (nums[i] == searchFor && ind[1] == -1) {
                ind[0] = i; //start index
            }
            if (nums[i] == searchFor && ind[0] != -1) {
                ind[1] = i; //start index
            }
        }
        return ind;

    }
}

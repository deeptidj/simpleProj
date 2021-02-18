package com.company.ArraysAndStrings;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        //https://leetcode.com/problems/rotate-array/solution/
        System.out.println("Given an array, rotate the array to the right by k steps, where k is non-negative.");
//        System.out.println("Enter a number");
//        Scanner sc  = new Scanner(System.in);
//        int k = sc.nextInt();
//        int k = 3;
//        int[] nums = {1,2,3,4,5,6,7};
//        int[] res = new int[nums.length];
//        for (int j :
//                nums) {
//            System.out.print(j);
//        }
//        System.out.println();
//        int tmp ;int len = nums.length;
//        k = k % len;
//
//        System.out.println(k);
//
//
//        for (int i = 0; i < len; i++) {
//            int kc = (i+k) % len;
//            res[kc] = nums[i];
//        }
//        System.out.println();
//
//        for (int j :
//                res) {
//            System.out.print(j);
//        }
        int cap = 7;
        int[] nums = new int[cap] ;
        for (int i = 0; i < cap; i++) {
            nums[i] = (i+1) * 10;
        }
        for (int i = 0; i < cap; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();

        int k = 3;
        int len = nums.length;
        k = k % len;

        for (int i = 0; i < 1; i++) {
            int curr = i;
            int prev = curr;
            int next = curr + k;
            do{
                nums[next] = nums[curr];
                nums[curr] = nums[prev];
                prev = curr +k;
                curr = curr + k;
                next =  (curr + k) % len;

            } while(curr <= len);
        }


        for (int i = 0; i < cap; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();

    }
}

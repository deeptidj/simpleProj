package com.company.algorithmsSorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{21,22,42,33,54};

        for (int k :
                nums) {
            System.out.print(k+ " ");
        }

        for (int i = 0; i < nums.length-1; i++) {
            int j = i+1;
            while ((j>0) && (nums[j-1] > nums[j])) {
                int t = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = t;
                j--;
            }

        }

        System.out.println();

        for (int k :
                nums) {
            System.out.print(k+ " ");
        }
    }
}

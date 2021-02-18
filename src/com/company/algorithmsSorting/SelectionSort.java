package com.company.algorithmsSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{21,22,42,33,54};
        int min;
        for (int i = 0; i < nums.length - 1; i++) {
            min = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[min]) min = j;
            }
            if(min != i) {
                int  t = nums[min];
                nums[min] = nums[i];
                nums[i] = t;
            }
        }

        for (int k :
                nums) {
            System.out.print(k+ " ");
        }

    }
}

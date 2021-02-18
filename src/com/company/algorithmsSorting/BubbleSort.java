package com.company.algorithmsSorting;

public class BubbleSort {
    int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] > nums[j+1]) {
                    int t = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = t;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] n = {2,1,5,3,4};
        int[] sortedArray = b.sort(n);
        for (int i :
                sortedArray) {
            System.out.print(i+" ");
        }
    }
}

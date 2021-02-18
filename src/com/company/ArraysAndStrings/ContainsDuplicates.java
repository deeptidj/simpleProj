package com.company.ArraysAndStrings;

import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        //https://leetcode.com/problems/contains-duplicate/solution/
        int[] nums = new int[]{1,2,3,4,32};
        System.out.println("find if the array contains any duplicates");
        System.out.println("Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct");
        System.out.println(containsDuplicate(nums));

    }
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> hs = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) return true;
            else hs.add(nums[i]);
        }
        return false;
    }
    /*
    Complexity Analysis

Time complexity : O(n)O(n). We do search() and insert() for n times and each operation takes constant time.

Space complexity : O(n)O(n). The space used by a hash table is linear with the number of elements in it.

Note

For certain test cases with not very large nn, the runtime of this method can be slower than Approach #2.
The reason is hash table has some overhead in maintaining its property. One should keep in mind that real world
performance can be different from what the Big-O notation says.
The Big-O notation only tells us that for sufficiently large input,
one will be faster than the other.
Therefore, when nn is not sufficiently large, an O(n)O(n) algorithm can be slower than an O(n \log n)O(nlogn) algorithm.
     */
}

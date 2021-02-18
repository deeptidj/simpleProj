package com.company.SearchAlgorithms;

import java.util.Arrays;

public class BinarySearchEx {
    public static int binarySearch(int[] n, int f, int l, int searchEle) {
        if (l>=f)
        {
        int mid = (l - f) / 2;
        if (n[mid] == searchEle) return mid;
        else if (n[mid] > searchEle) binarySearch(n, 0, mid - 1, searchEle);
        else if (n[mid] < searchEle) binarySearch(n, mid + 1, n.length - 1, searchEle);
         }
        return -1;
    }
    public static void main(String[] args) {
        int[] n = {1,5,2,4,3};
        int search = 3;
        Arrays.sort(n);
        for (int i : n) {
            System.out.print(i+" ");
        }
        System.out.println();
        int res = binarySearch(n,0,n.length-1, search);
        System.out.println(" found : "+res);

    }
}

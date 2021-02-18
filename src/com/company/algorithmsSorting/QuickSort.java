package com.company.algorithmsSorting;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class QuickSort {
    public static void main(String[] args) {
       int[] n = {1,5,2,4,3};
       quickSort(n,0,n.length-1);
        for (int i :
                n) {
            System.out.print(i+" ");
        }
       // int[] res = bubbleSort(n);
//        for (int i :
//                res) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
    }
   public static int partition(int[] n, int low, int hi){
        int pivot = n[hi];
        int tmp;
        int i = low - 1;
        for (int j = low; j < hi; j++) {
            if (n[j] < pivot){
                i++;
                tmp = n[j];
                n[j] = n[i];
                n[i] = tmp;
            }
        }
        tmp = n[i+1];
        n[i+1] = n[hi];
        n[hi] = tmp;
        return i+1;
    }
    static void quickSort(int[] n, int low, int hi) {
        if (low < hi) {
            int partition = partition(n, low, hi);
            quickSort(n, low, partition - 1);
            quickSort(n, partition + 1, hi);
        }
    }
}

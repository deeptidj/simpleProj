package com.company.SearchAlgorithms;

public class LinearSearchEx {

    public static void main(String[] args) {
        int[] n = {1,5,2,4,3};
        int search = 3;
        boolean flag = false;
        for (int i = 0; i < n.length; i++) {
            if(n[i] == search) {
                System.out.println("Found at index : " + i);
                flag = true;
            }
            }
        if (!flag) System.out.println("Not found");
        }

    }


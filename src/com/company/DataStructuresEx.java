package com.company;

import java.util.ArrayList;
import java.util.*;

public class DataStructuresEx {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        List<Integer> l =Arrays.asList(1,2,3,4);
        ArrayList<Integer> arrInt = new ArrayList<>(4);
        arrInt.addAll(l);

        for (int i = 0; i < 50; i++) {
            arrInt.add(i*10);
        }
        for (Integer i:arrInt) {
            System.out.println(i);
        }



    }
}

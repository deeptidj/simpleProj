package com.company.ArraysAndStrings;

import java.util.Scanner;

public class AreaParallelogram {
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner s = new Scanner(System.in);
        B = s.nextInt();
        H = s.nextInt();
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else flag = true;
    }

    public static void main(String[] args) {
            if(flag){
            int area = B * H;
            System.out.print(area);

            int i2 = 40;
            String s = Integer.toString(i2);

        }
    }

}

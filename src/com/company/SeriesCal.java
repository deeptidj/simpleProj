package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SeriesCal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[10][20];
        ArrayList<ArrayList<Integer> > myArr
                = new ArrayList<ArrayList<Integer> >();
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            myArr.add(new ArrayList<Integer>());
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s1=a;

            for (int j = 0; j < n; j++) {
                    int bPart = (int)Math.pow(2,j) * b;
                    int s0 = s1 + bPart;
                    myArr.get(i).add(j,s0);
                    arr[i][j] = s0;
                    s1 = s0;
            }

        }

        for (ArrayList<Integer> list : myArr)
        {
            for (Integer num : list)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }

        in.close();
    }
}

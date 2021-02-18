package com.company;

import java.util.Scanner;

public class LineInput {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int i=1;
        while(s.hasNext()){
            System.out.println(i+" "+s.nextLine());
            i++;
        }
    }
}

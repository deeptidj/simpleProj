package com.company;

import java.util.Scanner;

public class JavaStdin1 {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        String s = scan.next();
//        System.out.println("String: "+s);
//        System.out.println("Double: "+d);
//        System.out.println("Int: "+i);

        Scanner scan =  new Scanner(System.in);
        int i1 =  scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        scan.close();
    }
}

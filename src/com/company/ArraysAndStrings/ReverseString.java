package com.company.ArraysAndStrings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner s = new Scanner(System.in);
        String s1 = s.next();

        char[] arr = s1.toCharArray();
        char temp; int end=arr.length-1;int start=0;
        while (start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
        System.out.println(s1);
        StringBuffer sb = new StringBuffer();
        for (char c :
                arr) {
            sb.append(c);
        }
        System.out.println(sb.toString());


        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);
        String input = s.next();

        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
}

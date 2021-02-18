package com.company;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
//        System.out.println("Enter a string ");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
        String s = "I am sdfsdf ";
        String cs = s.trim().toLowerCase();
        char[] csArr = cs.toCharArray();
        int vowelCount = 0, consCount = 0;
        for (char i :
                csArr) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                vowelCount++;
            }
            else if(i != ' ' || i!= '.') {
                consCount++;
            }
            }

        System.out.println("Vowel count "+vowelCount);
        System.out.println("Consonant count "+consCount);


    }
}

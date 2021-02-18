package com.company;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {
        Scanner s;
        try {
            s = new Scanner(System.in);
            System.out.println("Enter a number");
            int a = s.nextInt();
            System.out.println("Enter another number");
            int b = s.nextInt();
            System.out.println("Select An operation +-*/");
            String opr = s.next();
            if(opr.contains("+")) {
                System.out.println("output : "+a+b);
            } else if (opr.contains("-")) {
                System.out.println("output : "+(a-b));
            } else if (opr.contains("*")) {
                System.out.println("output : "+a*b);
            } else if (opr.contains("/")) {
                System.out.println("output : "+a/b);
            } else {
                System.out.println("could not find valid operator");
            }
        }
        catch (InputMismatchException mismatchExceptione) {
            System.out.println("Number format error");
            //mismatchExceptione.printStackTrace();
        }
        catch (Exception e) {
           // e.printStackTrace();
            System.out.println("Exception handled generically");
        } finally {
        }

    }
}

package com.company.BasicPrograms;

public class Basic {
    // 0, 1, 1, 2, 3
    void printFibonacci(int count) {
        int n1 = 0 ;
        int n2 = 1;
        System.out.print(n1 + " "+n2+ " ");
        for (int i = 2; i < count; i++) {
            int sum = n1 + n2;
            System.out.print(sum+" ");
            n1 = n2;
            n2 = sum;
        }
        System.out.println();
    }

    int reverseNo(int num) {
        int r, sum = 0;

        while(num > 0) {
            r = num % 10;
            sum = sum * 10 + r;
            num = num/10;
        }
        return sum;
    }

    boolean isPalindrome(int n1, int n2) {
        if (n1 == n2) return true;
        else return false;
    }

    int fact(int n) {
        if ( n==0 ) return 1;
        else return n*fact(n-1);
    }
    boolean isArmStrong(int n){
        int copy=n;
        int r=0,s=0;
        while(n>0){
            r=n%10;
            s=s+(r*r*r);
            n=n/10;
        }
        if(copy==s) return true;
        else return false;
    }
    public static void main(String[] args) {
        Basic b = new Basic();
        b.printFibonacci(10);
        int num = 12321;
        System.out.println("Is palindrome = "+b.isPalindrome(num, b.reverseNo(num)));
        System.out.println(b.fact(5));
        System.out.println(b.isArmStrong(153));
        System.out.println(b.isArmStrong(4));

    }
}

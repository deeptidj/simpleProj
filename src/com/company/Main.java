package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        System.out.println("Enter a word");
//        Scanner sc =  new Scanner(System.in);
//        int input = sc.nextInt();
//        System.out.println(input);

        //System.out.println(in.contains("enter"));
        //Arrays
//        int[] arr = new int[3];
//        arr[0] = 0;
//        arr[1] = 1;
//        arr[2] = 2;
//        System.out.println(Arrays.toString(arr));
//
//
//        int[] newArr = {12,11,24,63,55,55,55,689,344,234};
//        System.out.println(Arrays.toString(newArr));
//        Arrays.sort(newArr);
//        System.out.println(Arrays.toString(newArr));

//        Car a = new Car("Liscencse Plate1");
//        int currSpeed = 100;
//        System.out.println(a.speedUpBy100(currSpeed));


//        Dog a = new Dog("mySweetDog", "German Shepard", true);
//        a.bark();
//        a.play();

//        Scanner sc = new Scanner(System.in);
//
//        Person p = new Person();
//        System.out.println("Enter age: ");
//        p.setAge(sc.nextInt());
//        int age = p.getAge();
//        System.out.println("Age entered is "+age);
//
//        if(age>=0 && age<5) System.out.println("Baby");
//        else if(age >= 5 && age <= 12) System.out.println("Kid");
//        else if (age > 12 && age < 18) System.out.println("Teen");
//        else if (age >= 18) System.out.println("Adult");
//        int x =3;
//        while (x > 0) {
//            System.out.println(x);
//            x--;
//        }
//        System.out.println("Out of loop x= "+x);

//        int y = 3;
//        do {
//            System.out.println(y);
//            y= y-1;
//        }while(y>0);
//        System.out.println("Out of loop x= "+y);


//        for (int i = 0; i < 3; i++) {
//            System.out.println(i);
//        }
//        for (int i = 3; i < 0; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < 3; i++) {
//            Dice d1 = new Dice();
//            System.out.println("Dice 1 = "+d1.roll());
//            System.out.println("Dice 2 = "+d1.roll());
//
//        }
//
//        for (int i = 0; i < 5; i++) {
//            Coin c = new Coin();
//            System.out.println(c.getFaceUpStr());
//        }
//        Insect i = new Insect();
//        System.out.println("Insect : "+i.getcanFly());
//        System.out.println("Insect : "+i.getNoOfLegs());
//
//        Spider s =  new Spider();
//        System.out.println("Spider : "+s.getcanFly());
//        System.out.println("Spider : "+s.getNoOfLegs());
//
//        Cricket c = new Cricket();
//        System.out.println("Cricket : "+c.getcanFly());
//        System.out.println("Cricket : "+c.getNoOfLegs());
//        c.makesNoise();
//        String input = "1 fish 2 fish red fish blue fish";
//      Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
//      System.out.println(s.nextInt());
//      System.out.println(s.nextInt());
//      System.out.println(s.next());
//      System.out.println(s.next());
//      s.close();

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            int addSpaces = 15 - s1.length();
            StringBuffer sb = new StringBuffer(s1);
            for (int j = 0; j <addSpaces; j++) {
                sb.append(" ");
            }
            int count =0 ;
            int q = x;
            if (x == 0) count = 1;
            while (x>0){
                int r = x%10;
                x = x/10;
                count++;
            }
            int leadingZeroes = 3 - count;
            for (int j = 0; j < leadingZeroes; j++) {
                sb.append("0");
            }
            sb.append(q);
            System.out.println(sb.toString());


        }
        System.out.println("================================");


    }
}

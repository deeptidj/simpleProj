package com.company.JavaCollectionsExam;

import java.util.*;

public class CollectionEx {
    public static void main(String[] args) {
        System.out.println("********************  ARRAY LIST **************************");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(26);
        arr.add(34);
        for (int i = 0; i < 5; i++) {
                arr.add(i);
        }

        for (int i: arr) {
            System.out.println(i);
        }

        System.out.println("********************  LINKED LIST **************************");
        LinkedList<Integer> li = new LinkedList<>();
        li.add(26);
        li.add(34);
        for (int i = 0; i < 5; i++) {
            li.add(i);
        }


        for (int i: li) {
            System.out.println(i);
        }

        System.out.println("********************** VECTOR  ************************");

        Vector<Integer> v = new Vector<>();
        v.add(26);
        v.add(34);
        for (int i = 0; i < 5; i++) {
            v.add(i);
        }
        for (int i: v) {
            System.out.println(i);
        }
        System.out.println("******************** STACK **************************");


        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);

        System.out.println(s.peek());

        s.pop();
        s.pop();

        System.out.println(s);

        System.out.println("********************* PRIORITY QUEUE *************************");

        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        p.add(10);
        p.add(20);
        p.add(30);
        System.out.println(p);
        System.out.println(p.peek());

        p.poll();
        System.out.println(p);

        System.out.println("********************* ARRAY DEQUE *************************");

        ArrayDeque<Integer> aDQ = new ArrayDeque<>();
        int[] arr1 = new int[] { 1, 2, 3, 4 };
        aDQ.add(10);
        aDQ.add(20);
        aDQ.add(30);
        aDQ.add(40);
        aDQ.add(50);
        aDQ.add(60);

        System.out.println(aDQ);

        aDQ.addFirst(500);

        System.out.println(aDQ);
        aDQ.addFirst(600);
        System.out.println(aDQ);
        aDQ.addLast(1000);
        System.out.println(aDQ);
        aDQ.addLast(5000);
        System.out.println(aDQ);


        System.out.println("******************** HASH SET **************************");

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            hs.add(i);
        }
        System.out.println(hs);
        System.out.println(hs.size());
        for (int i = 0; i < 4; i++) {
            hs.add(i);
        }
        System.out.println(hs);
        System.out.println(hs.size());
        int c = 0;
        for (int i = 6; i < 18; i++) {
            hs.add(i*5);
            c++;
        }
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(c);

        System.out.println("******************** LINKED HASH SET **************************");
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        int c1 = 0;
        for (int i = 6; i < 18; i++) {
            lhs.add(i*5);
            c1++;
        }

        System.out.println(lhs);
        System.out.println(lhs.size());
        System.out.println(hs);
        System.out.println(hs.size());
        for (int i = 0; i < 4; i++) {
            lhs.add(i);
        }
        System.out.println(lhs);
        System.out.println(lhs.size());

        for (int i = 0; i < 10; i++) {
            lhs.add(i);
        }
        System.out.println(lhs);
        System.out.println(lhs.size());
        System.out.println(c1);

        System.out.println("********************  TREE SET **************************");

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(34);
        ts.add(10);
        System.out.println(ts);


        System.out.println("******************** HASH MAP **************************");

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('a', 1);
        hm.put('b', 2);
        hm.put('c', 3);
        hm.put('d', 4);

        for (Map.Entry<Character,Integer> e: hm.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey() + " Value: "+ e.getValue());
        }
    }
}

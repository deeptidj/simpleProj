package com.company.DataStructuresStack;

public class StackDemo {
    public static void main(String[] args) {
        BasicStack b = new BasicStack();
        System.out.println("Default Stack size = "+b.size);

        b.push(1);
        b.push(2);
        b.push(3);
        b.push(4);
        b.push(55);
        b.printStackElements();
        System.out.println(b.pop());
        System.out.println(b.items[b.top]);
        b.printStackElements();

        BasicStack b1 = new BasicStack(20);
        System.out.println("Stack should be of size 20 "+ b1.size);

        b1.push(11);
        b1.push(22);
        b1.push(33);
        b1.push(44);
        b1.printStackElements();
        System.out.println(b1.pop());
        System.out.println(b.items[b.top]);
        b1.printStackElements();



    }
}

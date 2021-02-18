package com.company.DataStructuresStack;

public class BasicStack {
    int top = -1;
    int[] items;
    int size = 10;
    BasicStack(){
        items = new int[size];
    }
    BasicStack(int size){
        items = new int[size];
        this.size = size;
    }

    void push(int d) {
        if (top == (size-1)) System.out.println("Stack is already full");
        else items[++top] = d;
    }
    int pop() {
        if (top != -1) return items[top--];
        else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }
    void printStackElements() {
        for (int i : items) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

}

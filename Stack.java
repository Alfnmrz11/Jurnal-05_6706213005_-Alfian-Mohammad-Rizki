package com.company;

public class Stack {
    private final char[] dataStack;
    private int top;

    public Stack(int batas) {
        /*konstruktor method*/
        dataStack = new char[batas];
        top = 0;
    }

    public void push(char A) { /*penginputan data*/
        dataStack[++top] = A;
    }

    public char pop() { /*pengeluaran data akhir*/
        return dataStack[top--];
    }

    public boolean isEmpty() { /*pengecekan Stack*/
        return (top == 0);
    }

}

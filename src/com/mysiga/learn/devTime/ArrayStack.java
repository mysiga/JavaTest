package com.mysiga.learn.devTime;

/**
 * 基于数组实现顺序栈
 */
public class ArrayStack {
    private String[] items;
    private int count;
    private int n;

    public ArrayStack(int n) {
        this.n = n;
        this.count = 0;
        items = new String[n];
    }

    public boolean push(String item) {
        if (count == n) {
            return false;
        }
        items[count] = item;
        ++count;
        return true;
    }

    public String pop() {
        if (count == 0) {
            return null;
        }
        String temp = items[count - 1];
        --count;
        return temp;
    }
}


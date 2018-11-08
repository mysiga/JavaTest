package com.mysiga.learn.devTime;

/**
 * Created by Wilson on 2018/10/27.
 */
public class LoopArrayQueue {
    private String[] items;
    private int n;
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public LoopArrayQueue(int n) {
        this.n = n;
        items = new String[n];
    }

    public boolean enqueue(String item) {
        if ((tail + 1) % n == head) {
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % n;
        size++;
        return true;
    }

    public String dnqueue() {
        if (head == tail) {
            return null;
        }
        String temp = items[tail];
        head = (head + 1) % n;
        size--;
        return temp;

    }
}

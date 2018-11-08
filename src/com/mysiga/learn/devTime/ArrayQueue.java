package com.mysiga.learn.devTime;

/**
 * Created by Wilson on 2018/10/27.
 */
public class ArrayQueue {
    private String[] items;
    private int n;
    /**
     * head对头下标，tail队尾下标
     */
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    /**
     * 入队
     *
     * @param item
     * @return
     */
    public boolean enqueue(String item) {
        if (tail == n) {
            return false;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    /**
     * 出列
     *
     * @return
     */
    public String dequeue() {
        if (head == tail) {
            return null;
        }
        String temp = items[head];
        ++head;
        return temp;
    }
}

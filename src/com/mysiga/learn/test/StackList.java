package com.mysiga.learn.test;

/**
 * Created by Wilson on 2018/10/15.
 */
public class StackList<E> {
    private int elementCount;
    private int stackCount;
    private Object[] elementData;

    public StackList() {
        elementCount = 0;
        stackCount = 16;
        elementData = new Object[stackCount];
    }

    public synchronized void pop(E e) {

    }

    public synchronized void push(E e) {

    }
}

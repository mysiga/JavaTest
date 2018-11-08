package com.mysiga.learn.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Wilson on 2018/8/14.
 */
public class AtomicTest {
    static AtomicInteger atomicInteger = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.get());
    }
}

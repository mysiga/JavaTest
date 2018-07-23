package com.mysiga.learn.threads;

/**
 * Created by Wilson on 2018/7/13.
 */
public class VolatileTest {
    private int count = 0;
    private volatile int sum = 0;

    public synchronized void addLock() {
        count++;
        System.out.println("synchronized:count=" + count);
    }

    public void add() {
        sum++;
        System.out.println("sum=" + sum);
    }

    public static void main(String[] args) {
        VolatileTest volatileTest = new VolatileTest();
//        for (int i = 0; i < 10; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    volatileTest.addLock();
//                }
//            }).start();
//        }
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    volatileTest.add();
                }
            }).start();
        }

    }
}

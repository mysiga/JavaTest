package com.mysiga.learn.lock;

/**
 * Created by Wilson on 2018/8/13.
 */
public class RepeSynchronized implements Runnable {

    public synchronized void get() {
        System.out.println(Thread.currentThread().getId());
        set();
    }

    public synchronized void set() {
        System.out.println(Thread.currentThread().getId());
    }

    @Override
    public void run() {
        get();
    }

    public static void main(String[] args) {
        RepeSynchronized repeLock = new RepeSynchronized();
        new Thread(repeLock).start();
        new Thread(repeLock).start();
        new Thread(repeLock).start();
    }
}

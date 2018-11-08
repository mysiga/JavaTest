package com.mysiga.learn.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Wilson on 2018/8/13.
 */
public class RepeLock implements Runnable {
    private Lock lock = new ReentrantLock();

    public void get() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getId());
            set();
        } finally {
            lock.unlock();
        }
    }

    public void set() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getId());
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        get();
    }

    public static void main(String[] args) {
        RepeLock repeLock = new RepeLock();
        new Thread(repeLock).start();
        new Thread(repeLock).start();
        new Thread(repeLock).start();
    }
}

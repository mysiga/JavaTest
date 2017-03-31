package com.mysiga.learn.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Wilson on 2017/3/28.
 */
public class MyThread implements Runnable {
    private int ticket;
    private Lock lock = new ReentrantLock();

    public MyThread(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        print();
    }

    public void print() {
        lock.lock();
        try {
            while (ticket > 0) {
                System.out.println("ticket==" + ticket);
                ticket--;
            }
        } catch (Exception e) {
            System.out.println("Exception==" + e);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread(5);
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
    }
}

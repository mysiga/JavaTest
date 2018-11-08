package com.mysiga.learn.lock;

import java.util.Calendar;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

/**
 * Created by Wilson on 2018/8/14.
 */
public class ReadWriteThread {
    private StampedLock stampedLock = new StampedLock();
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void read() {
        long stampRead = stampedLock.readLock();
        try {
        } finally {
            stampedLock.unlockRead(stampRead);
        }
    }

    public void write() {
        long stamp = stampedLock.writeLock();
        try {
        } finally {
            stampedLock.unlockWrite(stamp);
        }
    }

    public void readLock() {
        try {
            readWriteLock.readLock().lock();
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public void writeLock() {
        try {
            readWriteLock.writeLock().lock();
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteThread readWriteThread = new ReadWriteThread();
        int cunt = 1000000;
        System.out.println("读取次数:" + cunt);

//        StamedTest(readWriteThread, cunt);
        lockTest(readWriteThread, cunt);

    }

    private static void lockTest(ReadWriteThread readWriteThread, int cunt) {
        long lockMillis1 = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i < cunt; i++) {
            readWriteThread.readLock();
            readWriteThread.writeLock();
        }
        long lockMillis2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("ReentrantReadWriteLock相差时间:" + (lockMillis2 - lockMillis1));
    }

    private static void StamedTest(ReadWriteThread readWriteThread, int cunt) {
        long currentMillis = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i < cunt; i++) {
            readWriteThread.read();
            readWriteThread.write();
        }
        long lastMillis = Calendar.getInstance().getTimeInMillis();
        System.out.println("StampedLock相差时间:" + (lastMillis - currentMillis));
    }
}

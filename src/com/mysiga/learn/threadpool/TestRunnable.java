package com.mysiga.learn.threadpool;

/**
 * Created by Wilson on 2018/7/10.
 */
public class TestRunnable implements Runnable {
    private final String mName;

    public TestRunnable(String name) {
        mName = name;
    }

    @Override
    public void run() {
        System.out.println(String.format("[%s] %s 执行", Thread.currentThread().getName(), mName));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.mysiga.learn.threads;

/**
 * Created by Wilson on 2018/8/2.
 */
public class ThreadImpl extends Thread {
    public static void main(String[] args) {
        ThreadImpl thread = new ThreadImpl();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
    }
}

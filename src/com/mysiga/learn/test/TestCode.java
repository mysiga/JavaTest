package com.mysiga.learn.test;

/**
 * Created by Wilson on 2017/3/16.
 */
public class TestCode {

    public static int getCount() {
        try {
            return 1;
        } catch (Throwable e) {

        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(getCount());
        String name;

    }
}

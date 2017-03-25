package com.mysiga.learn.proxy;

/**
 * Created by Wilson on 2017/3/25.
 */
public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("RealSubject,Request()");
    }
}

package com.mysiga.learn.strategy;

/**
 * Created by Wilson on 2017/3/25.
 */
public class Phone implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("phone");
    }
}
